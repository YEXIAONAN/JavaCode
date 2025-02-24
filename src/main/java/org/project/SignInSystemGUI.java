package org.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SignInSystemGUI extends JFrame {
    private static final String PASSWORD = "114514";
    private JTextField nameField;
    private JTextField passwordField;
    private JLabel messageLabel;

    public SignInSystemGUI() {
        // 设置窗口标题
        setTitle("小楠签到系统");
        // 设置窗口大小
        setSize(700, 300);
        // 设置窗口关闭时的操作
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口布局
        setLayout(new GridLayout(4, 2, 10, 10));
        // 设置窗口居中显示
        setLocationRelativeTo(null);

        // 创建并添加姓名标签和输入框
        JLabel nameLabel = new JLabel("请输入姓名:");
        nameField = new JTextField();
        add(nameLabel);
        add(nameField);

        // 创建并添加口令标签和输入框
        JLabel passwordLabel = new JLabel("请输入口令:");
        passwordField = new JTextField();
        add(passwordLabel);
        add(passwordField);

        // 创建并添加签到按钮
        JButton signInButton = new JButton("签到");
        signInButton.addActionListener(new SignInButtonListener());
        add(new JLabel()); // 占位
        add(signInButton);

        // 创建并添加消息显示标签
        messageLabel = new JLabel("");
        add(new JLabel()); // 占位
        add(messageLabel);
    }

    private class SignInButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String inputPassword = passwordField.getText();
            String name = nameField.getText().trim();
            if (name.isEmpty()) {
                messageLabel.setText("请输入姓名！");
                return;
            }
            if (PASSWORD.equals(inputPassword)) {
                signIn(name);
            } else {
                messageLabel.setText("口令错误，签到失败！");
            }
        }
    }

    private void signIn(String name) {
        try {
            // 创建 sign_logs 目录（如果不存在）
            File logDirectory = new File("sign_logs");
            if (!logDirectory.exists()) {
                logDirectory.mkdirs();
            }

            // 获取当前时间
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String signInTime = dateFormat.format(new Date());

            // 将签到时间和姓名写入文件
            File logFile = new File(logDirectory, "sign_in_records.txt");
            FileWriter writer = new FileWriter(logFile, true);
            writer.write("姓名：" + name + "，签到时间：" + signInTime + "\n");
            writer.close();

            messageLabel.setText("签到成功！姓名：" + name + "，签到时间：" + signInTime);
        } catch (IOException ex) {
            messageLabel.setText("签到记录保存失败：" + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SignInSystemGUI signInSystem = new SignInSystemGUI();
            signInSystem.setVisible(true);
        });
    }
}