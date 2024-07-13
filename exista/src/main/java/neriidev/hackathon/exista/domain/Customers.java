package neriidev.hackathon.exista.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;
import java.time.LocalDate;

@Data
@Entity
public class Customers {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
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
