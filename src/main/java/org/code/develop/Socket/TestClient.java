package org.code.develop.Socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) throws IOException {
        Socket sock  = new Socket("localhost",6666); // 指定需要连接的服务器IP地址+端口

        try (InputStream input = sock.getInputStream()){
            try(OutputStream output = sock.getOutputStream()){
                handle(input,output);
            }
        }
        sock.close();
        System.out.println("disconnected.");
    }

    private static void handle(InputStream input,OutputStream output) throws IOException {
        var writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        var reader = new BufferedReader(new InputStreamReader(input,StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);
        System.out.println("[server] " + reader.readLine());

        for (;;) {
            System.out.println(">>> "); // 打印提示
            String s = sc.nextLine();
            writer.write(s);
            writer.newLine();
            writer.flush();
            String resp = reader.readLine();
            System.out.println("<<< " + resp);
            if (resp.equals("Bye~")){
                break;
            }
        }
    }
}
