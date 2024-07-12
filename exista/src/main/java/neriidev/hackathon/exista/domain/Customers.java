package neriidev.hackathon.exista.domain;

import lombok.Data;

import java.util.List;
import java.time.LocalDate;

@Data
public class Customers {
        private String id;
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String zipCode;
        private String phone;
        private String email;
        private LocalDate dateOfBirth;
        private LocalDate registrationDate;
        private List<String> preferences;


}
