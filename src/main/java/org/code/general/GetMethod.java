package org.code.general;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetMethod {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 创建一个Http对象
        HttpClient client = HttpClient.newHttpClient();
        // 创建一个Request对象
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://172.16.7.69/api/time"))
                .header("X-API-Key","82566136-2bdc-4f06-9908-7e7077feea5f")
                .GET()
                .build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println("Response code : " + response.statusCode());
        System.out.println("Body: " + response.body());



    }
}
