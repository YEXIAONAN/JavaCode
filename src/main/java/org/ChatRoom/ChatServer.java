package org.ChatRoom;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class ChatServer {
    private static final int PORT = 12345;
    private static final Set<Socket> clientSockets = Collections.synchronizedSet(new HashSet<>());

    public static void main(String[] args) {
        System.out.println("🟢 Chat server started on port " + PORT);
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();
                clientSockets.add(socket);
                System.out.println("🔗 New client connected: " + socket.getRemoteSocketAddress());
                new Thread(() -> handleClient(socket)).start();
            }
        } catch (IOException e) {
            System.err.println("❌ Server error: " + e.getMessage());
        }
    }

    private static void handleClient(Socket socket) {
        try (
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8))
        ) {
            String msg;
            while ((msg = reader.readLine()) != null) {
                System.out.println("📨 Received: " + msg);
                broadcast(msg, socket);
            }
        } catch (IOException e) {
            System.out.println("⚠ Client disconnected: " + socket.getRemoteSocketAddress());
        } finally {
            clientSockets.remove(socket);
            try {
                socket.close();
            } catch (IOException ignored) {}
        }
    }

    private static void broadcast(String msg, Socket sender) {
        synchronized (clientSockets) {
            for (Socket client : clientSockets) {
                if (!client.equals(sender)) {
                    try {
                        PrintWriter out = new PrintWriter(
                                new OutputStreamWriter(client.getOutputStream(), StandardCharsets.UTF_8), true);
                        out.println(msg);
                    } catch (IOException ignored) {}
                }
            }
        }
    }
}
