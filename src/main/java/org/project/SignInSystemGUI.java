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
import javax.swing.border.EmptyBorder;
import java.util.Set;
import java.util.HashSet;

public class SignInSystemGUI extends JFrame {

    // 口令
    private static final String PASSWORD = "104";

    // MySQL 配置
    private static final String DB_URL = "jdbc:mysql://172.16.7.70:3306/sign_in_system?useSSL=false&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "123456";  // 请替换成你的密码

    // 定义授权用户列表
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
        setSize(800, 450);  // 增大界面尺寸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 设置字体
        Font titleFont = new Font("Microsoft YaHei", Font.BOLD, 24);
        Font labelFont = new Font("Microsoft YaHei", Font.PLAIN, 18);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(0xF4F4F4));  // 浅灰色背景
        panel.setBorder(new EmptyBorder(20, 60, 20, 60));  // 增大边距
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);  // 增大组件间距

        // 标题
        JLabel titleLabel = new JLabel("欢迎使用大数据 - 签到系统");
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(new Color(0x0077CC));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        // 当前时间显示
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
        timeLabel.setForeground(Color.GRAY);
        gbc.gridy = 1;
        panel.add(timeLabel, gbc);

        // 姓名标签和输入框
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridy = 2;
        gbc.gridx = 0;
        JLabel nameLabel = new JLabel("请输入姓名:");
        nameLabel.setFont(labelFont);
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        nameField = new JTextField(25);  // 增大输入框宽度
        nameField.setFont(labelFont);
        panel.add(nameField, gbc);

        // 口令标签和输入框
        gbc.gridy = 3;
        gbc.gridx = 0;
        JLabel passwordLabel = new JLabel("请输入口令:");
        passwordLabel.setFont(labelFont);
        panel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        passwordField = new JTextField(25);  // 增大输入框宽度
        passwordField.setFont(labelFont);
        panel.add(passwordField, gbc);

        // 签到按钮
        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton signInButton = new JButton("签到");
        signInButton.setBackground(new Color(0x22BB55));
        signInButton.setForeground(Color.WHITE);
        signInButton.setFocusPainted(false);
        signInButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));  // 增大字体
        panel.add(signInButton, gbc);

        // 消息标签
        gbc.gridy = 5;
        messageLabel = new JLabel(" ");
        messageLabel.setFont(labelFont);
        panel.add(messageLabel, gbc);

        signInButton.addActionListener(new SignInButtonListener());

        // 更新时间显示
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
        updateTime();

        add(panel);
    }

    private void updateTime() {
        String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        timeLabel.setText("当前时间： " + currentTime);
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

            // 检查用户是否在授权用户列表中
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
        String currentDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String signInTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String ipAddress = getClientIpAddress();  // 获取IP地址

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // 检查今天该用户是否已签到两次
            String countQuery = "SELECT COUNT(*) FROM sign_ins WHERE name = ? AND sign_in_date = ?";
            try (PreparedStatement countStmt = conn.prepareStatement(countQuery)) {
                countStmt.setString(1, name);
                countStmt.setString(2, currentDate);
                ResultSet rs = countStmt.executeQuery();
                if (rs.next() && rs.getInt(1) >= 2) {
                    showMessage("今天你已经打卡两次了，不能再签到！", Color.RED);
                    return;
                }
            }

            // 插入签到记录
            String insertQuery = "INSERT INTO sign_ins (name, sign_in_time, ip_address, sign_in_date) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
                stmt.setString(1, name);
                stmt.setString(2, signInTime);
                stmt.setString(3, ipAddress);  // 设置IP地址
                stmt.setString(4, currentDate);  // 设置当天日期
                stmt.executeUpdate();

                showMessage("签到成功！" + name + " 于 " + signInTime + "，IP: " + ipAddress, new Color(0x007744));
            }

        } catch (SQLException e) {
            showMessage("数据库错误：" + e.getMessage(), Color.RED);
        }
    }

    private String getClientIpAddress() {
        try {
            // 获取本地机器的 IP 地址
            InetAddress localHost = InetAddress.getLocalHost();
            return localHost.getHostAddress();  // 获取本机 IP 地址
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "无法获取IP";  // 如果获取失败，返回一个错误信息
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SignInSystemGUI gui = new SignInSystemGUI();
            gui.setVisible(true);
        });
    }
}
