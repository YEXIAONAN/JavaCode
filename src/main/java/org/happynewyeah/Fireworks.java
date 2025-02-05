package org.happynewyeah;

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
        timer = new Timer(1000 / FPS, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Particle particle : particles) {
            particle.draw(g);
        }
    }

    public void explode(int x, int y) {
        for (int i = 0; i < 100; i++) {
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
        JFrame frame = new JFrame("Fireworks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Fireworks());
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    class Particle {
        private int x, y;
        private int dx, dy;
        private int life;

        public Particle(int x, int y) {
            this.x = x;
            this.y = y;
            this.dx = (int) (Math.random() * 20) - 10;
            this.dy = (int) (Math.random() * 20) - 10;
            this.life = 100;
        }

        public void draw(Graphics g) {
            if (life > 0) {
                g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
                g.fillOval(x, y, 5, 5);
            }
        }

        public void update() {
            x += dx;
            y += dy;
            life--;
        }

        public boolean isDone() {
            return life <= 0;
        }
    }
}