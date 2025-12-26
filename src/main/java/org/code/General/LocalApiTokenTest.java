package org.code.General;

import java.net.http.WebSocket;
import java.nio.ByteBuffer;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class LocalApiTokenTest {
    // 设置默认公钥

    public static void main(String[] args) {
        final String PUBLIC_TOKEN = "BigDataTeamDevelop";
        // 导入Scanner
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        int con;

        System.out.println("Please Enter Token");
        String Token  = sc.next();

        if (Token == PUBLIC_TOKEN) {
            System.out.println("Welcome to BigdataDevelop");


        }else if (Token != PUBLIC_TOKEN) {
            System.out.println("Sorry,Token is Error");
        }


    }

    WebSocket ws = new WebSocket() {
        @Override
        public CompletableFuture<WebSocket> sendText(CharSequence data, boolean last) {
            return null;
        }

        @Override
        public CompletableFuture<WebSocket> sendBinary(ByteBuffer data, boolean last) {
            return null;
        }

        @Override
        public CompletableFuture<WebSocket> sendPing(ByteBuffer message) {
            return null;
        }

        @Override
        public CompletableFuture<WebSocket> sendPong(ByteBuffer message) {
            return null;
        }

        @Override
        public CompletableFuture<WebSocket> sendClose(int statusCode, String reason) {
            return null;
        }

        @Override
        public void request(long n) {

        }

        @Override
        public String getSubprotocol() {
            return "";
        }

        @Override
        public boolean isOutputClosed() {
            return false;
        }

        @Override
        public boolean isInputClosed() {
            return false;
        }

        @Override
        public void abort() {

        }
    };

    // 声明Token类
    class ApiToken {
        final String API_TOKEN = "BigDataTeamDevelop";

    }



}
