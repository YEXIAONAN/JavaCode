package org.yexiaonan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetime {

    private static JLabel dateTimeLabel;

    public static void main(String[] args) {
        // 创建 JFrame 窗口
        JFrame frame = new JFrame("时间显示");
        frame.setSize(400, 200); // 设置窗口大小
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // 窗口居中

        // 创建 Label 用于显示时间
        dateTimeLabel = new JLabel("", SwingConstants.CENTER);
        dateTimeLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // 将 Label 添加到窗口
        frame.add(dateTimeLabel);

        // 设置定时器更新时间
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDateTime();
            }
        });
        timer.start();

        // 显示窗口
        frame.setVisible(true);

        // 初始化显示一次
        updateDateTime();
    }

    // 更新日期和时间显示
    private static void updateDateTime() {
        // 获取当前时间
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTime = formatter.format(new Date());
        dateTimeLabel.setText(currentDateTime);
    }
}

