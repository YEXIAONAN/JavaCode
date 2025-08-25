package org.code.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SwingListeningDemo {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public SwingListeningDemo(){
        prepareGUI();
    }

    public static void main(String[] args) {

    }

    private void prepareGUI(){
        mainFrame = new JFrame("Java Swing监听示例");
        mainFrame.setSize(400,500);
        mainFrame.setLayout(new GridLayout(3,1));

        headerLabel = new JLabel("",JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }
        });

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);

    }

    private void showEventDemo(){
        headerLabel.setText("Control in action : Button");

        JButton okButton = new JButton("确定");
        JButton submitButton = new JButton("提交");
        JButton cancelButton = new JButton("取消");

        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);

        mainFrame.setVisible(true);

    }

    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();

            if (command.equals("OK")){
                statusLabel.setText("确定");
            }else if (command.equals("Submit")){
                statusLabel.setText("提交");
            }else {
                statusLabel.setText("取消");
            }
        }
    }
}
