package neriidev.hackathon.exista.repository;

import neriidev.hackathon.exista.domain.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories
public interface CouponRepository extends CrudRepository<Coupon, Integer> {
}