package org.yexiaonan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;

@SuppressWarnings("unused")
public class ChineseTextFillQuiz {
    private JFrame frame;
    private JPanel panel;
    private JTextArea originalArea;
    private JButton checkButton;
    private JLabel resultLabel;
    private JTextArea errorArea;
    private List<JTextField> inputFields = new ArrayList<>();
    private Map<Integer, String> correctAnswers = new HashMap<>();
    private List<String> blanksText = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChineseTextFillQuiz().createAndShowGUI());
    }

    private void createAndShowGUI() {
        frame = new JFrame("中文随机填空测试程序");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton loadButton = new JButton("加载文本文件");
        loadButton.addActionListener(this::loadTextFile);
        panel.add(loadButton);

        originalArea = new JTextArea(8, 60);
        originalArea.setLineWrap(true);
        originalArea.setWrapStyleWord(true);
        originalArea.setEditable(false);
        panel.add(new JScrollPane(originalArea));

        checkButton = new JButton("检查");
        checkButton.addActionListener(this::checkAnswers);
        panel.add(checkButton);

        resultLabel = new JLabel("正确率: ");
        panel.add(resultLabel);

        errorArea = new JTextArea(6, 60);
        errorArea.setEditable(false);
        panel.add(new JScrollPane(errorArea));

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private void loadTextFile(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                String content = sb.toString().replaceAll("\\s+", "");
                createBlanksFromText(content);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "加载失败: " + ex.getMessage());
            }
        }
    }

    private void createBlanksFromText(String text) {
        inputFields.clear();
        correctAnswers.clear();
        blanksText.clear();
        panel.removeAll();

        StringBuilder displayText = new StringBuilder(text);
        Random rand = new Random();
        Set<Integer> usedIndexes = new HashSet<>();

        int blanksToGenerate = 5;
        int minContextLength = 5; // 确保挖空前后至少有这么多字符

        for (int i = 0; i < blanksToGenerate; i++) {
            if (displayText.length() < 2 * minContextLength + 2) { // 确保文本足够长以进行有意义的挖空
                break;
            }
            int len = rand.nextInt(Math.min(6, displayText.length() - 2 * minContextLength - 1)) + 2;
            int idx = 0;
            int attempts = 0;
            boolean foundValidIndex = false;
            do {
                int maxStartIndex = displayText.length() - len - minContextLength;
                if (maxStartIndex < minContextLength) break; // 无法找到合适的起始位置

                idx = rand.nextInt(maxStartIndex - minContextLength + 1) + minContextLength; // 限制起始位置，确保前后有足够字符
                final int currentIndex = idx;
                if (usedIndexes.stream().noneMatch(x -> Math.abs(x - currentIndex) < 7)) {
                    foundValidIndex = true;
                    break;
                }
                attempts++;
                if (attempts > 1000) break;
            } while (!foundValidIndex);

            if (!foundValidIndex) break;

            String original = displayText.substring(idx, idx + len);
            correctAnswers.put(i, original);
            blanksText.add(original);
            displayText.replace(idx, idx + len, "____");
            usedIndexes.add(idx);
        }

        originalArea.setText(displayText.toString());
        panel.add(new JScrollPane(originalArea));

        for (int i = 0; i < blanksText.size(); i++) {
            panel.add(new JLabel("第" + (i + 1) + "空:"));
            JTextField field = new JTextField(30);
            inputFields.add(field);
            panel.add(field);
        }

        panel.add(checkButton);
        panel.add(resultLabel);
        panel.add(new JScrollPane(errorArea));

        frame.revalidate();
        frame.repaint();
    }

    private void checkAnswers(ActionEvent e) {
        int correct = 0;
        StringBuilder errors = new StringBuilder();

        for (int i = 0; i < inputFields.size(); i++) {
            String userInput = inputFields.get(i).getText().trim();
            String correctAnswer = correctAnswers.get(i);
            if (userInput.equals(correctAnswer)) {
                correct++;
            } else {
                errors.append("第").append(i + 1).append("空：应为“")
                        .append(correctAnswer).append("”，你填了“")
                        .append(userInput).append("”\n");
            }
        }

        if (!inputFields.isEmpty()) {
            double accuracy = 100.0 * correct / inputFields.size();
            resultLabel.setText(String.format("正确率: %.2f%%", accuracy));
        } else {
            resultLabel.setText("正确率: 0.00%% (没有填空)");
        }
        errorArea.setText(errors.toString());
    }
}