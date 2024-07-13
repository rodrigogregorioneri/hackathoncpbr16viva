package neriidev.hackathon.exista.adapters.customer;

import neriidev.hackathon.exista.domain.Customers;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CustomerCLient {

    public ResponseEntity<Customers> getCustomerDetailsId(String id) {
        String url = "https://hackathon.vivacn.roxcode.io/api/customers/details?id=" + id;

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "insomnia/9.3.2");

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Customers> response = restTemplate.exchange(url, HttpMethod.GET, entity, Customers.class);

        return response;
    }

    public ResponseEntity<List> getCustomerDetails() {
        String url = "https://hackathon.vivacn.roxcode.io/api/customers/details";

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "insomnia/9.3.2");

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List> response = restTemplate.exchange(url, HttpMethod.GET, entity, List.class);

        return response;
    }


}
