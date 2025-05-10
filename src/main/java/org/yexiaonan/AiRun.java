package org.yexiaonan;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class AiRun {
    public static void main(String[] args) {
        try {
            String url = "http://172.16.7.11:11434/v1/chat/completions";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // 设置请求方法和请求头
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);

            // 构造 JSON 请求体 (修正字符串格式)
            String jsonInputString = "{\"model\":\"deepseek-r1:1.5b\",\"messages\":[{\"role\":\"user\",\"content\":\"你好\"}]}";

            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // 读取响应
            System.out.println("🧠 启动中：您的 AI 健康助手正在加载...\n");
            try {
                Thread.sleep(800);
                HME.main(args);
            } catch (InterruptedException e) {
                System.out.println("❌ 助手加载失败：" + e.getMessage());
            }

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}