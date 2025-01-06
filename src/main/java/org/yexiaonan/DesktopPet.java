package org.yexiaonan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DesktopPet extends JWindow {
    private JLabel petLabel;
    private Timer animationTimer;
    private Timer actionTimer;
    private int x, y;
    private int screenWidth, screenHeight;
    private String currentAction = "walk"; // 当前动作（walk, stand, sleep）

    private ImageIcon[] walkImages;
    private ImageIcon[] standImages;
    private ImageIcon[] sleepImages;
    private int frameIndex = 0;

    public DesktopPet() {
        // 初始化屏幕尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth = screenSize.width;
        screenHeight = screenSize.height;

        // 初始化宠物位置
        x = screenWidth / 2;
        y = screenHeight - 150; // 靠近屏幕底部

        // 加载宠物图片
        loadImages();

        // 设置宠物窗口
        petLabel = new JLabel();
        petLabel.setIcon(walkImages[0]);
        add(petLabel);

        setSize(100, 100); // 宠物窗口大小
        setLocation(x, y);
        setAlwaysOnTop(true); // 保持窗口在最前
        setBackground(new Color(0, 0, 0, 0)); // 透明背景

        // 动画定时器
        animationTimer = new Timer(100, e -> updateAnimation());
        animationTimer.start();

        // 动作控制定时器
        actionTimer = new Timer(3000, e -> updateAction());
        actionTimer.start();
    }

    private void loadImages() {
        // 加载不同动作的图片
        walkImages = new ImageIcon[] {
                new ImageIcon("walk1.png"),
                new ImageIcon("walk2.png"),
                new ImageIcon("walk3.png"),
        };
        standImages = new ImageIcon[] {
                new ImageIcon("stand1.png"),
                new ImageIcon("stand2.png"),
        };
        sleepImages = new ImageIcon[] {
                new ImageIcon("sleep1.png"),
                new ImageIcon("sleep2.png"),
        };
    }

    private void updateAnimation() {
        // 更新动画帧
        ImageIcon[] currentImages;
        switch (currentAction) {
            case "stand":
                currentImages = standImages;
                break;
            case "sleep":
                currentImages = sleepImages;
                break;
            default:
                currentImages = walkImages;
        }

        frameIndex = (frameIndex + 1) % currentImages.length;
        petLabel.setIcon(currentImages[frameIndex]);

        if ("walk".equals(currentAction)) {
            movePet();
        }
    }

    private void updateAction() {
        // 随机切换动作
        String[] actions = {"walk", "stand", "sleep"};
        currentAction = actions[new Random().nextInt(actions.length)];
    }

    private void movePet() {
        // 随机移动宠物位置
        x += new Random().nextInt(21) - 10; // -10 到 10 的随机步长
        y += new Random().nextInt(11) - 5; // -5 到 5 的随机步长

        // 确保宠物不会移出屏幕
        x = Math.max(0, Math.min(screenWidth - getWidth(), x));
        y = Math.max(0, Math.min(screenHeight - getHeight(), y));

        setLocation(x, y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DesktopPet pet = new DesktopPet();
            pet.setVisible(true);
        });
    }
}
