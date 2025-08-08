import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTasas {
    public TasasConversion tasas(String baseConversion){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/39630e799f3f689669ea5cf5/latest/" +
                baseConversion);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TasasConversion.class);
        } catch (Exception e) {
            throw new RuntimeException("Tasa de conversion no encontrada");
        }
    }
}
