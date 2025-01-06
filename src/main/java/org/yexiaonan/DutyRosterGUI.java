package org.yexiaonan;

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

public class DutyRosterGUI {

    private static final String[] dutyStudents = {
            "梁文龙", "林远喜", "廖世鑫", "农光浩",
            "潘润根", "黄正宇", "周朝双", "林李想",
            "叶小楠", "黄显套", "吴光鑫", "陀乾鑫"
    };
    private static int currentIndex = 0; // 假设今天是梁文龙值日，根据数组索引调整
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

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.X_AXIS));

        prevDutyLabel = new JLabel("上一个值日生: " + dutyStudents[(currentIndex - 1 + dutyStudents.length) % dutyStudents.length], SwingConstants.CENTER);
        currentDutyLabel = new JLabel("今天值日生: " + dutyStudents[currentIndex], SwingConstants.CENTER);
        nextDutyLabel = new JLabel("下一个值日生: " + dutyStudents[(currentIndex + 1) % dutyStudents.length], SwingConstants.CENTER);

        prevDutyLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 50));
        currentDutyLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 90));
        nextDutyLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 50));

        // 增加填充以调整位置
        prevDutyLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 0));
        nextDutyLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 20));

        infoPanel.add(prevDutyLabel);
        infoPanel.add(Box.createHorizontalGlue());
        infoPanel.add(currentDutyLabel);
        infoPanel.add(Box.createHorizontalGlue());
        infoPanel.add(nextDutyLabel);

        frame.add(infoPanel, BorderLayout.CENTER);

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
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 67));
        frame.add(timeLabel, BorderLayout.NORTH);

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
        button.setPreferredSize(new Dimension(200, 70));  // 增加按钮的宽度和高度，确保文字能适应

        // 设置圆角效果
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 2), // 边框
                new RoundedCornerBorder(30) // 圆角
        ));

        // 鼠标悬停效果
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(0, 105, 217)); // 悬停时颜色
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(0, 123, 255)); // 恢复正常颜色
            }
        });

        // 设置渐变色背景
        button.setBackground(new Color(0, 123, 255)); // 初始背景色
        button.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                ButtonModel model = ((AbstractButton) c).getModel();
                Graphics2D g2 = (Graphics2D) g;

                // 渐变背景
                if (model.isPressed()) {
                    g2.setPaint(new GradientPaint(0, 0, new Color(0, 105, 217), 0, c.getHeight(), new Color(0, 123, 255)));
                } else {
                    g2.setPaint(new GradientPaint(0, 0, new Color(0, 123, 255), 0, c.getHeight(), new Color(0, 105, 217)));
                }

                g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 30, 30); // 绘制圆角矩形
                super.paint(g, c);  // 绘制按钮内容
            }
        });

        return button;
    }

    // 自定义一个类来创建圆角边框
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