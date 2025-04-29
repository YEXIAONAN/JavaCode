/**
 * 该类 `ChatRequest` 包含一个主方法，用于向指定的 Ollama API 端点发送 POST 请求，
 * 以获取聊天完成的响应。请求使用 JSON 格式的消息体，指定模型和用户消息。
 */
package org.ollama;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatRequest {
    /**
     * 程序的入口点，发送一个 POST 请求到 Ollama 的聊天完成 API 端点。
     *
     * @param args 命令行参数，在本程序中未使用。
     */
    public static void main(String[] args) {
        try {
            // 定义要请求的 API 端点 URL
            String url = "http://172.16.7.11:11434/v1/chat/completions";
            // 创建 URL 对象
            URL obj = new URL(url);
            // 打开 HTTP 连接
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // 设置请求方法为 POST
            con.setRequestMethod("POST");
            // 设置请求头，指定请求体的内容类型为 JSON
            con.setRequestProperty("Content-Type", "application/json");
            // 允许向服务器输出数据
            con.setDoOutput(true);

            // 构造 JSON 格式的请求体，指定使用的模型和用户消息
            String jsonInputString = "{\"model\":\"EntropyYue/chatglm3:latest\",\"messages\":[{\"role\":\"user\",\"content\":\"你好\"}]}";
            /**可以在Ollama服务中使用命令查看模型列表
             * C:\Users\Ollama>ollama list
             * NAME                          ID              SIZE      MODIFIED
             * EntropyYue/chatglm3:latest    8f6f34227356    3.6 GB    5 days ago
             * gemma2:2b                     8ccf136fdd52    1.6 GB    13 days ago
             * llama3.2:latest               a80c4f17acd5    2.0 GB    6 weeks ago
             * deepseek-r1:1.5b              a42b25d8c10a    1.1 GB    7 weeks ago
             */



            // 尝试将 JSON 请求体写入输出流
            try (OutputStream os = con.getOutputStream()) {
                // 将 JSON 字符串转换为 UTF-8 编码的字节数组
                byte[] input = jsonInputString.getBytes("utf-8");
                // 将字节数组写入输出流
                os.write(input, 0, input.length);
            }

            // 获取服务器的响应状态码
            int responseCode = con.getResponseCode();
            // 检查响应状态码是否为 200 (HTTP_OK)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // 创建一个 BufferedReader 用于读取服务器的响应
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
                // 用于存储响应内容的 StringBuilder
                StringBuilder response = new StringBuilder();
                String line;
                // 逐行读取响应内容并添加到 StringBuilder 中
                while ((line = in.readLine()) != null) {
                    response.append(line);
                }
                // 关闭 BufferedReader
                in.close();

                // 输出服务器的响应内容
                System.out.println("Response: " + response.toString());
            } else {
                // 若响应状态码不是 200，输出请求失败信息和响应状态码
                System.out.println("POST request failed. Response Code: " + responseCode);
            }

            // 断开与服务器的连接
            con.disconnect();
        } catch (Exception e) {
            // 若发生异常，打印异常堆栈信息
            e.printStackTrace();
        }
    }
}
