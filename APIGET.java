import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import java.io.IOException;
import java.net.Authenticator;
import java.net.CookieHandler;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class APIGET {
    public static void main(String[] args) throws IOException, InterruptedException {

        String url = "https://jsonplaceholder.typicode.com/albums";

        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        HttpClient httpClient = HttpClient.newBuilder().build();


        HttpResponse<String> httpResponse = httpClient.send(request,HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());


    }
}