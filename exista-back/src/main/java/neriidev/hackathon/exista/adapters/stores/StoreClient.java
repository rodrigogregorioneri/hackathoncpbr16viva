package neriidev.hackathon.exista.adapters.stores;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

    public ResponseEntity<String> getStoreDetails() {
        String url = "https://hackathon.vivacn.roxcode.io/api/stores/details";

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "insomnia/9.3.2");

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return response;
    }
}
