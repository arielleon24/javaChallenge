package org.example;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {



    private static final String URL = "http://localhost:8080/balance?acctnum=1234567";
    public static void main( String[] args ) throws IOException, InterruptedException {
        Gson gson = new Gson();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header( "accept", "application/json")
                .uri(URI.create(URL))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("statusCode is:" + response.statusCode());
        String json = response.body();
        Account account1 = gson.fromJson(json, Account.class);

        System.out.println("this is result " + account1.getBalance() +"$");

    }
}
