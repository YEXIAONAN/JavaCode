package org.yexiaonan;

import java.io.*;
import java.net.*;

public class ChatClient {
    // 定义服务器的IP地址和端口号
    private static final String SERVER_IP = "localhost"; // 服务器IP地址，当前为本地
    private static final int SERVER_PORT = 12345;        // 服务器端口号

    public static void main(String[] args) throws IOException {
        // 创建一个Socket连接到服务器
        Socket socket = new Socket(SERVER_IP, SERVER_PORT);
        System.out.println("Connected to chat server."); // 连接成功提示

        // 启动一个新线程，用于接收服务器发送的消息
        new Thread(() -> {
            try (
                // 创建BufferedReader，用于读取服务器发送的消息
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ) {
                String msg;
                // 持续读取服务器发送的消息，直到连接断开
                while ((msg = in.readLine()) != null) {
                    System.out.println(">> " + msg); // 打印接收到的消息
                }
            } catch (IOException ignored) {
                // 捕获异常，通常是由于连接断开
            }
        }).start();

        // 主线程用于读取用户输入并发送到服务器
        try (
            // 创建BufferedReader，用于读取用户从键盘输入的消息
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            // 创建PrintWriter，用于向服务器发送消息
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        ) {
            String input;
            // 持续读取用户输入并发送到服务器
            while ((input = keyboard.readLine()) != null) {
                out.println(input); // 将用户输入发送到服务器
            }
        }
    }
}