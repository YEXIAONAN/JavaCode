package org.project;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DutyRosterApp {

    private static final String[] dutyStudents = {
            "xxx", "xxx", "xxx", "xxx",
            "xxx", "xxx", "xxx", "xxx",
            "xxx", "xxx", "xxx", "xxx",
            "xxx"
    };
    private static int currentIndex = 0; // 假设今天是xxx值日，根据数组索引调整
    private static JLabel currentDutyLabel;
    private static JLabel prevDutyLabel;
    private static JLabel nextDutyLabel;
    private static JLabel timeLabel;
    private static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("值日生信息");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1800, 1400);
        frame.setLayout(new BorderLayout());

        // 设置渐变背景面板
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                GradientPaint gradient = new GradientPaint(0, 0, new Color(255, 240, 245), getWidth(), getHeight(), new Color(173, 216, 230));
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        mainPanel.setLayout(new BorderLayout());
        frame.setContentPane(mainPanel);

        // 信息面板
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.X_AXIS));
        infoPanel.setOpaque(false);

        prevDutyLabel = new JLabel("上一个值日生: " + dutyStudents[(currentIndex - 1 + dutyStudents.length) % dutyStudents.length], SwingConstants.CENTER);
        currentDutyLabel = new JLabel("今天值日生: " + dutyStudents[currentIndex], SwingConstants.CENTER);
        nextDutyLabel = new JLabel("下一个值日生: " + dutyStudents[(currentIndex + 1) % dutyStudents.length], SwingConstants.CENTER);

        prevDutyLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 50));
        currentDutyLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 90));
        nextDutyLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 50));

        prevDutyLabel.setForeground(Color.DARK_GRAY);
        currentDutyLabel.setForeground(new Color(0, 102, 204));
        nextDutyLabel.setForeground(Color.DARK_GRAY);

        infoPanel.add(prevDutyLabel);
        infoPanel.add(Box.createHorizontalGlue());
        infoPanel.add(currentDutyLabel);
        infoPanel.add(Box.createHorizontalGlue());
        infoPanel.add(nextDutyLabel);

        mainPanel.add(infoPanel, BorderLayout.CENTER);

        // 按钮区域
        JButton prevButton = createStyledButton("＜上一个值日生");
        JButton nextButton = createStyledButton("下一个值日生＞");

        prevButton.addActionListener(e -> {
            currentIndex = (currentIndex - 1 + dutyStudents.length) % dutyStudents.length;
            updateDutyLabels();
        });

        nextButton.addActionListener(e -> {
            currentIndex = (currentIndex + 1) % dutyStudents.length;
            updateDutyLabels();
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // 时间显示
        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 67));
        timeLabel.setForeground(new Color(47, 79, 79));
        mainPanel.add(timeLabel, BorderLayout.NORTH);

        frame.setVisible(true);

        timer = new Timer(1000, e -> {
            Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
            timeLabel.setText("当前时间: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
        });
        timer.start();

        updateDutyLabels(); // 初始化值日生信息
    }

    private static void updateDutyLabels() {
        prevDutyLabel.setText("上一个值日生: " + dutyStudents[(currentIndex - 1 + dutyStudents.length) % dutyStudents.length]);
        currentDutyLabel.setText("今天值日生: " + dutyStudents[currentIndex]);
        nextDutyLabel.setText("下一个值日生: " + dutyStudents[(currentIndex + 1) % dutyStudents.length]);
    }

    private static JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
        button.setPreferredSize(new Dimension(220, 70));

        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(47, 79, 79), 2), // 边框
                new RoundedCornerBorder(30) // 圆角
        ));

        button.setBackground(new Color(0, 123, 255));
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(0, 105, 217));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(0, 123, 255));
            }
        });

        return button;
    }

    private static class RoundedCornerBorder extends AbstractBorder {
        private final int radius;

        public RoundedCornerBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.GRAY);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(5, 5, 5, 5);
        }
    }
}
