package org.ChatRoom;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class ChatClient {
    private static final String SERVER_IP = "127.0.0.1"; // 或者写服务器的实际 IP
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);
            BufferedReader keyboard = new BufferedReader(
                new InputStreamReader(System.in, StandardCharsets.UTF_8));
            PrintWriter out = new PrintWriter(
                new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8))
        ) {
            System.out.println("✅ Connected to chat server. Type your message:");

            // 接收消息线程
            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println("👤 " + msg);
                    }
                } catch (IOException ignored) {}
            }).start();

            // 发送消息线程
            String input;
            while ((input = keyboard.readLine()) != null) {
                out.println(input);
            }
        } catch (IOException e) {
            System.err.println("❌ Connection error: " + e.getMessage());
        }
    }
}
