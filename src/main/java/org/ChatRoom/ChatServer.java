package org.ChatRoom;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    // 定义服务器端口号
    private static final int PORT = 12345;

    // 使用线程安全的集合来存储所有客户端的Socket连接
    private static Set<Socket> clientSockets = Collections.synchronizedSet(new HashSet<>());

    public static void main(String[] args) throws IOException {
        // 创建服务器套接字，监听指定端口
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Chat server started on port " + PORT);

        // 无限循环，持续接受客户端连接
        while (true) {
            // 等待客户端连接，阻塞直到有客户端连接
            Socket socket = serverSocket.accept();

            // 将新连接的客户端Socket添加到集合中
            clientSockets.add(socket);

            // 为每个客户端启动一个新线程，处理客户端消息
            new Thread(() -> handleClient(socket)).start();
        }
    }

    // 处理单个客户端的消息
    private static void handleClient(Socket socket) {
        try (
            // 创建BufferedReader，用于读取客户端发送的消息
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            String msg;
            // 持续读取客户端发送的消息，直到客户端断开连接
            while ((msg = reader.readLine()) != null) {
                // 将消息广播给其他客户端
                broadcast(msg, socket);
            }
        } catch (IOException e) {
            // 捕获异常，表示客户端断开连接
            System.out.println("Client disconnected: " + socket);
        } finally {
            // 从客户端集合中移除断开的客户端
            clientSockets.remove(socket);
            try {
                // 关闭客户端Socket
                socket.close();
            } catch (IOException ignored) {}
        }
    }

    // 将消息广播给所有其他客户端
    private static void broadcast(String msg, Socket sender) {
        System.out.println("Broadcast: " + msg);
        // 同步操作，确保线程安全
        synchronized (clientSockets) {
            for (Socket client : clientSockets) {
                // 不向发送消息的客户端发送消息
                if (client != sender) {
                    try {
                        // 创建PrintWriter，用于向客户端发送消息
                        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                        out.println(msg);
                    } catch (IOException ignored) {}
                }
            }
        }
    }
}