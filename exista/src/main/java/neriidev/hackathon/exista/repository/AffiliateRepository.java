package neriidev.hackathon.exista.repository;

import neriidev.hackathon.exista.domain.Affiliate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface AffiliateRepository extends JpaRepository<Affiliate, Integer> {
}