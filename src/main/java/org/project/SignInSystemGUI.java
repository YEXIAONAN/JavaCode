package org.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.border.EmptyBorder;

public class SignInSystemGUI extends JFrame {

    private static final String PASSWORD = "104";
    private static final String DB_URL = "jdbc:mysql://172.16.7.70:3306/sign_in_system?useSSL=false&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "123456";

    private static final Set<String> authorizedUsers = new HashSet<>();
    static {
        authorizedUsers.add("yexiaonan");
        authorizedUsers.add("叛逆小狼崽");
        authorizedUsers.add("木木");
        authorizedUsers.add("李想");
        authorizedUsers.add("01");
        authorizedUsers.add("gancheng");
    }

    private JTextField nameField;
    private JTextField passwordField;
    private JLabel messageLabel;
    private JLabel timeLabel;

    public SignInSystemGUI() {
        setTitle("大数据 - 签到系统");
        setSize(800, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Font titleFont = new Font("Microsoft YaHei", Font.BOLD, 24);
        Font labelFont = new Font("Microsoft YaHei", Font.PLAIN, 18);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(0xF4F4F4));
        panel.setBorder(new EmptyBorder(20, 60, 20, 60));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);

        JLabel titleLabel = new JLabel("欢迎使用 \n 大数据 - 签到系统");

        titleLabel.setFont(titleFont);
        titleLabel.setForeground(new Color(0x0077CC));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
        timeLabel.setForeground(Color.GRAY);
        gbc.gridy = 1;
        panel.add(timeLabel, gbc);

        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridy = 2;
        gbc.gridx = 0;
        JLabel nameLabel = new JLabel("请输入姓名:");
        nameLabel.setFont(labelFont);
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        nameField = new JTextField(25);
        nameField.setFont(labelFont);
        panel.add(nameField, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        JLabel passwordLabel = new JLabel("请输入口令:");
        passwordLabel.setFont(labelFont);
        panel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        passwordField = new JTextField(25);
        passwordField.setFont(labelFont);
        panel.add(passwordField, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton signInButton = new JButton("签到");
        signInButton.setBackground(new Color(0x22BB55));
        signInButton.setForeground(Color.WHITE);
        signInButton.setFocusPainted(false);
        signInButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
        panel.add(signInButton, gbc);

        gbc.gridy = 5;
        messageLabel = new JLabel(" ");
        messageLabel.setFont(labelFont);
        panel.add(messageLabel, gbc);

        signInButton.addActionListener(new SignInButtonListener());

        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
        updateTime();

        add(panel);
    }

    private void updateTime() {
        String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        timeLabel.setText("当前时间（本地）： " + currentTime);
    }

    private class SignInButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText().trim();
            String inputPassword = passwordField.getText().trim();

            if (name.isEmpty()) {
                showMessage("请输入姓名！", Color.RED);
                return;
            }

            if (!PASSWORD.equals(inputPassword)) {
                showMessage("口令错误，签到失败！", Color.RED);
                return;
            }

            if (!authorizedUsers.contains(name)) {
                showMessage("你没有权限签到！", Color.RED);
                return;
            }

            signIn(name);
        }
    }

    private void showMessage(String message, Color color) {
        messageLabel.setText(message);
        messageLabel.setForeground(color);
    }

    private void signIn(String name) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // 使用服务器时间（NOW()）
            String serverTimeQuery = "SELECT NOW(), CURDATE()";
            String signInTime, currentDate;
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(serverTimeQuery)) {
                if (rs.next()) {
                    signInTime = rs.getString(1); // NOW()
                    currentDate = rs.getString(2); // CURDATE()
                } else {
                    showMessage("无法获取服务器时间", Color.RED);
                    return;
                }
            }

            String tableName = "sign_ins_" + currentDate.replace("-", "_");
            String createTableQuery = String.format(
                    "CREATE TABLE IF NOT EXISTS `%s` (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(255)," +
                            "sign_in_time DATETIME," +
                            "ip_address VARCHAR(50)," +
                            "sign_in_date DATE)", tableName);

            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(createTableQuery);
            }

            // 限制每天每人最多2次
            String checkQuery = "SELECT COUNT(*) FROM `" + tableName + "` WHERE name = ?";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
                checkStmt.setString(1, name);
                try (ResultSet rs = checkStmt.executeQuery()) {
                    if (rs.next() && rs.getInt(1) >= 2) {
                        showMessage("今日已签到两次，无法再次签到！", Color.RED);
                        return;
                    }
                }
            }

            String ipAddress = getClientIpAddress();
            String insertQuery = "INSERT INTO `" + tableName + "` (name, sign_in_time, ip_address, sign_in_date) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
                stmt.setString(1, name);
                stmt.setString(2, signInTime);
                stmt.setString(3, ipAddress);
                stmt.setString(4, currentDate);
                stmt.executeUpdate();

                showMessage("签到成功！" + name + " 于 " + signInTime + "，IP: " + ipAddress, new Color(0x007744));
            }

        } catch (SQLException e) {
            showMessage("数据库错误：" + e.getMessage(), Color.RED);
        }
    }

    private String getClientIpAddress() {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            return localHost.getHostAddress();
        } catch (UnknownHostException e) {
            return "无法获取IP";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SignInSystemGUI gui = new SignInSystemGUI();
            gui.setVisible(true);
        });
    }
}
