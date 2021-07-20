package org.example;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {

    Gson gson = new Gson();

    private static final String URL = "http://localhost:8080/balance?acctnum=1234567";
    public static void main( String[] args ) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header( "accept", "application/json")
                .uri(URI.create(URL))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("status:" + response.statusCode());
        System.out.println("status:" + response.body());
        String json = response.body();


    }
}
