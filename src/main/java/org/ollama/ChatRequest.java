package org.ollama;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatRequest {
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
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    response.append(line);
                }
                in.close();

                // 输出响应内容
                System.out.println("Response: " + response.toString());
            } else {
                System.out.println("POST request failed. Response Code: " + responseCode);
            }

            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
