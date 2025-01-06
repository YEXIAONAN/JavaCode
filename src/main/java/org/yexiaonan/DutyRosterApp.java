import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DutyRosterApp extends JFrame {

    private JLabel timeLabel;
    private JLabel dutyNameLabel;
    private JLabel prevDutyLabel;
    private JLabel nextDutyLabel;
    private JButton prevButton;
    private JButton nextButton;
    private List<String> dutyRoster;
    private int currentIndex;

    public DutyRosterApp() {
        // 界面基本设置
        setTitle("值日生轮换");
        setSize(800, 500); // 初始尺寸
        setLocationRelativeTo(null); // 居中显示
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(245, 245, 245)); // 背景颜色柔和
        setResizable(true);  // 允许窗口缩放
        setExtendedState(JFrame.MAXIMIZED_BOTH); // 窗口全屏显示

        // 初始化值日生名单
        dutyRoster = new ArrayList<>();
        dutyRoster.add("张三");
        dutyRoster.add("李四");
        dutyRoster.add("王五");
        dutyRoster.add("赵六");
        dutyRoster.add("钱七");

        currentIndex = 0;

        // 创建显示当前时间的标签
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18)); // 使用支持中文的字体
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setVerticalAlignment(SwingConstants.TOP);
        timeLabel.setForeground(new Color(100, 100, 100)); // 深灰色
        timeLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // 上下间距
        add(timeLabel, BorderLayout.NORTH);

        // 创建“今天的值日生是：”提示文本
        JLabel promptLabel = new JLabel("今天的值日生是：", SwingConstants.CENTER);
        promptLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 24)); // 使用支持中文的字体
        promptLabel.setForeground(new Color(50, 50, 50)); // 深灰色
        add(promptLabel, BorderLayout.NORTH); // 将提示文本放置在顶部

        // 创建显示值日生名字的标签
        dutyNameLabel = new JLabel(dutyRoster.get(currentIndex));
        dutyNameLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 60)); // 使用支持中文的字体，增加粗体
        dutyNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dutyNameLabel.setVerticalAlignment(SwingConstants.CENTER);
        dutyNameLabel.setForeground(new Color(0, 0, 0)); // 黑色字体
        add(dutyNameLabel, BorderLayout.CENTER);

        // 创建上一个和下一个值日生标签，放在当前值日生的左右两边
        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0)); // FlowLayout将值日生标签放到左右
        sidePanel.setOpaque(false);

        prevDutyLabel = new JLabel(dutyRoster.get((currentIndex - 1 + dutyRoster.size()) % dutyRoster.size()));
        prevDutyLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
        prevDutyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        prevDutyLabel.setVerticalAlignment(SwingConstants.CENTER);
        prevDutyLabel.setForeground(new Color(150, 150, 150)); // 上一个值日生的名字颜色
        sidePanel.add(prevDutyLabel);

        nextDutyLabel = new JLabel(dutyRoster.get((currentIndex + 1) % dutyRoster.size()));
        nextDutyLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
        nextDutyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nextDutyLabel.setVerticalAlignment(SwingConstants.CENTER);
        nextDutyLabel.setForeground(new Color(150, 150, 150)); // 下一个值日生的名字颜色
        sidePanel.add(nextDutyLabel);

        add(sidePanel, BorderLayout.CENTER); // 放置在中间，左右的值日生标签在当前值日生旁边

        // 创建按钮面板，设置为固定大小
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 20, 0)); // 按钮间距
        buttonPanel.setOpaque(false);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 20, 50)); // 左右间距

        prevButton = new JButton("上一个");
        prevButton.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));  // 使用支持中文的字体
        prevButton.setBackground(new Color(70, 130, 180)); // 深蓝色
        prevButton.setForeground(Color.WHITE);
        prevButton.setFocusPainted(false);
        prevButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // 增加按钮内部的间距
        prevButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        prevButton.setPreferredSize(new Dimension(120, 50)); // 合理的按钮大小
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPreviousDuty();
            }
        });

        nextButton = new JButton("下一个");
        nextButton.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));  // 使用支持中文的字体
        nextButton.setBackground(new Color(70, 130, 180)); // 深蓝色
        nextButton.setForeground(Color.WHITE);
        nextButton.setFocusPainted(false);
        nextButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // 增加按钮内部的间距
        nextButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        nextButton.setPreferredSize(new Dimension(120, 50)); // 合理的按钮大小
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextDuty();
            }
        });

        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        // 创建底部面板并将按钮放置在中间
        JPanel buttonContainer = new JPanel(new BorderLayout());
        buttonContainer.setOpaque(false);
        buttonContainer.add(buttonPanel, BorderLayout.CENTER);
        add(buttonContainer, BorderLayout.SOUTH);

        // 定时更新当前时间
        Timer timeTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timeTimer.start();

        // 初次显示时间
        updateTime();
    }

    // 更新当前时间显示
    private void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new Date());
        timeLabel.setText("当前时间: " + time);
    }

    // 显示上一个值日生
    private void showPreviousDuty() {
        currentIndex = (currentIndex - 1 + dutyRoster.size()) % dutyRoster.size();
        updateDutyName();
    }

    // 显示下一个值日生
    private void showNextDuty() {
        currentIndex = (currentIndex + 1) % dutyRoster.size();
        updateDutyName();
    }

    // 更新值日生名字并添加平滑动画效果
    private void updateDutyName() {
        String newDutyName = dutyRoster.get(currentIndex);
        dutyNameLabel.setText(newDutyName);

        // 更新上一个和下一个值日生名字
        prevDutyLabel.setText(dutyRoster.get((currentIndex - 1 + dutyRoster.size()) % dutyRoster.size()));
        nextDutyLabel.setText(dutyRoster.get((currentIndex + 1) % dutyRoster.size()));

        // 使用Swing动画效果实现平滑过渡
        Thread animationThread = new Thread(() -> {
            try {
                // 从当前值日生名字渐变到新的名字
                for (int i = 0; i <= 10; i++) {
                    int opacity = i * 25;  // 每次渐变25%
                    dutyNameLabel.setForeground(new Color(0, 0, 0, opacity));
                    Thread.sleep(50);
                }
                dutyNameLabel.setText(newDutyName);

                // 渐变回正常状态
                for (int i = 10; i >= 0; i--) {
                    int opacity = i * 25;
                    dutyNameLabel.setForeground(new Color(0, 0, 0, opacity));
                    Thread.sleep(50);
                }
                dutyNameLabel.setForeground(Color.BLACK); // 恢复默认颜色
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        animationThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DutyRosterApp().setVisible(true);
            }
        });
    }
}
