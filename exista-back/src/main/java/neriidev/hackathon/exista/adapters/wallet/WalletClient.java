package neriidev.hackathon.exista.adapters.wallet;

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
public class WalletClient {

    public ResponseEntity<String> getWalletDetailsId(String customerId) {
        String url = "https://hackathon.vivacn.roxcode.io/api/wallets/details?customerId=" + customerId;

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "insomnia/9.3.2");

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return response;
    }


  public ResponseEntity<List<Wallet>> getWalletDetails() {
    String url = "https://hackathon.vivacn.roxcode.io/api/wallets/details";

    HttpHeaders headers = new HttpHeaders();
    headers.set("User-Agent", "insomnia/9.3.2");



    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<List<Wallet>> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Wallet>>() {});

    return response;
  }

}
