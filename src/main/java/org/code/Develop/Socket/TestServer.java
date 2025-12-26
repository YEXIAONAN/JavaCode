package org.code.Develop.Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TestServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666); // 监听指定端口
        System.out.println("Server is running....");

        for (;;) {
            Socket sock = ss.accept();
            System.out.println("Connection from: " + sock.getRemoteSocketAddress()); // 打印输出连接到的SockServer地址
            Thread t = new Handler(sock);
            t.start();
        }
    }
}

class Handler extends Thread {
    Socket sock;
    public Handler(Socket sock) {
        this.sock = sock;
    }

    public void run(){
        try(InputStream input = this.sock.getInputStream()) {
            try (OutputStream output = this.sock.getOutputStream()){
                handler(input,output);
            }
        }catch (Exception ioe){

        }
        System.out.println("client disconnected.");
    }

    private void handler(InputStream input,OutputStream output) throws IOException {
        var writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        var reader = new BufferedReader((new InputStreamReader(input,StandardCharsets.UTF_8)));

        writer.write("hello\n");
        writer.flush();
        for (;;){
            String s = reader.readLine();
            if (s.equals("bye~")){
                writer.write("bye~\n");
                writer.flush();
                break;
            }
            writer.write("ok : " + s + "\n");
            writer.flush();
        }
    }
}


