package neriidev.hackathon.exista.adapters.stores;

import neriidev.hackathon.exista.domain.Store;
import neriidev.hackathon.exista.domain.Wallet;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StoreClient {

    public ResponseEntity<String> getStoreDetailsId(String id) {
        String url = "https://hackathon.vivacn.roxcode.io/api/stores/details?id=" + id;

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "insomnia/9.3.2");

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return response;
    }

    public ResponseEntity<List<Store>> getStoreDetails() {
        String url = "https://hackathon.vivacn.roxcode.io/api/stores/details";

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "insomnia/9.3.2");

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        RestTemplate restTemplate = new RestTemplate();
      ResponseEntity<List<Store>> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Store>>() {});

        return response;
    }
}
