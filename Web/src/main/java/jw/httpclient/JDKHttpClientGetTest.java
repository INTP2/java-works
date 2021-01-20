package jw.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JDKHttpClientGetTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        doGet();
    }

    public static void doGet() {
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create("http://www.baidu.com")).build();
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
