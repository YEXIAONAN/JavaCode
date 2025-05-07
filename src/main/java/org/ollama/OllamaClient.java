package org.ollama;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OllamaClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        String endpoint = "http://172.16.7.11:11434/api/generate";
        String json = """
                {
                    "model" : "deepseek-r1:1.5b",
                    "prompt" : "在餐馆中如何增加顾客的留存",
                    "stream" : true
                }
                """;
        HttpClient client  = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .header("Content-Type","application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();


        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Response: " + response.body());
    }
}
