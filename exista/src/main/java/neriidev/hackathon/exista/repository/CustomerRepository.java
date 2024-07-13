package neriidev.hackathon.exista.repository;

import neriidev.hackathon.exista.domain.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}