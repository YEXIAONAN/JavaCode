package org.yexiaonan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EasyClean {
    private static JLabel studentLabel;
    private static JLabel dateLabel;
    private static Timer timer;

    public static void main(String[] args) {
        // 创建 JFrame 窗口
        JFrame frame = new JFrame("值日生显示");
        frame.setSize(500, 300); // 设置窗口大小
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // 窗口居中
        frame.setResizable(false); // 禁止窗口大小调整

        // 创建背景面板，并设置背景图片
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon background = new ImageIcon("background.jpg"); // 设置背景图片
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        panel.setLayout(new BorderLayout());

        // 创建显示值日生名字的标签
        studentLabel = new JLabel("值日生: 张三", SwingConstants.CENTER);
        studentLabel.setFont(new Font("微软雅黑", Font.BOLD, 24));
        studentLabel.setForeground(Color.WHITE); // 设置文字颜色为白色

        // 创建显示当前日期的标签
        dateLabel = new JLabel("", SwingConstants.CENTER);
        dateLabel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
        dateLabel.setForeground(Color.WHITE); // 设置文字颜色为白色

        // 将标签添加到面板
        panel.add(studentLabel, BorderLayout.NORTH);
        panel.add(dateLabel, BorderLayout.CENTER);

        // 设置定时器更新时间
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDate();
            }
        });
        timer.start();

        // 初始化显示日期
        updateDate();

        // 将面板添加到窗口并显示
        frame.add(panel);
        frame.setVisible(true);
    }

    // 更新日期显示
    private static void updateDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = formatter.format(new Date());
        dateLabel.setText("当前时间: " + currentDate);
    }
}
