package org.yexiaonan.happynewyeah;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Fireworks extends JPanel implements ActionListener {
    private final int FPS = 60;
    private final Timer timer;
    private final List<Particle> particles = new ArrayList<>();

    public Fireworks() {
        setBackground(Color.BLACK); // 设置黑色背景
        timer = new Timer(1000 / FPS, this);
        timer.start();
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                explode(e.getX(), e.getY());
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        for (Particle particle : particles) {
            particle.draw(g);
        }
    }

    public void explode(int x, int y) {
        for (int i = 0; i < 200; i++) { // 增加粒子数量
            particles.add(new Particle(x, y));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<Particle> toRemove = new ArrayList<>();
        for (Particle particle : particles) {
            particle.update();
            if (particle.isDone()) {
                toRemove.add(particle);
            }
        }
        particles.removeAll(toRemove);
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Fireworks");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Fireworks fireworks = new Fireworks();
            frame.add(fireworks);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null); // 居中显示
            frame.setVisible(true);
        });
    }

    class Particle {
        private double x, y;
        private double dx, dy;
        private int life;
        private Color color;

        public Particle(int x, int y) {
            this.x = x;
            this.y = y;
            double angle = Math.random() * Math.PI * 2;
            double speed = Math.random() * 10 + 5;
            this.dx = Math.cos(angle) * speed;
            this.dy = Math.sin(angle) * speed - 2;
            this.life = 100;
            this.color = new Color(
                (int)(Math.random() * 256),
                (int)(Math.random() * 256),
                (int)(Math.random() * 256)
            );
        }

        public void draw(Graphics g) {
            if (life > 0) {
                g.setColor(color);
                g.fillOval((int)x, (int)y, 4, 4);
            }
        }

        public void update() {
            x += dx;
            y += dy;
            dy += 0.2; // 添加重力效果
            life--;
        }

        public boolean isDone() {
            return life <= 0;
        }
    }
}
