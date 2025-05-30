import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Monedas buscarMoneda(String monedaBase, String monedaTarget){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b18c941a9c7405001d7ceb81/pair/"+ monedaBase + "/" + monedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("La moneda solicitada no está en nuestros registros");
        }
    }
}
