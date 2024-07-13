package neriidev.hackathon.exista.adapters.location;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocationClient {

    public ResponseEntity<String> getLocationDetailsId(String resource, String state) {
        String url = "https://hackathon.vivacn.roxcode.io/api/location/details?resource=" + resource + "&state=" + state;

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "insomnia/9.3.2");

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return response;
    }

    public ResponseEntity<String> getLocationDetailsStates() {
        String url = "https://hackathon.vivacn.roxcode.io/api/location/details?resource=states";

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "insomnia/9.3.2");

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return response;
    }
}