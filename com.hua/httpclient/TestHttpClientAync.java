package com.hua.httpclient;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

public class TestHttpClientAync {
    public static void main(String[] args) throws URISyntaxException, ExecutionException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request1 = HttpRequest.newBuilder(new URI("https://jsonplaceholder.typicode.com/todos")).GET().build();
        HttpRequest request2 = HttpRequest.newBuilder(new URI("https://jsonplaceholder.typicode.com/todos/1")).GET().build();
        CompletableFuture<String> response1 = client.sendAsync(request1, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body);
        CompletableFuture<String> response2 = client.sendAsync(request2, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body);
        System.out.println("test1");
        Stream.of(response1, response2).map(r -> {
            try {
                return r.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }).forEach(i -> System.out.println(i));

    }
}
