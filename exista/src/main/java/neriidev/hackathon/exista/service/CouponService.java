package neriidev.hackathon.exista.service;

import neriidev.hackathon.exista.domain.Coupon;
import neriidev.hackathon.exista.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CouponService {

    private final CouponRepository couponRepository;

    @Autowired
    public CouponService(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }

    // Create
    public Coupon createCoupon(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    // Read
    public Optional<Coupon> getCouponById(Integer id) {
        return couponRepository.findById(id);
    }

    // Update
    public Coupon updateCoupon(Integer id, Coupon coupon) {
        Coupon coupon1= couponRepository.findById(id).orElseThrow();
        coupon1.setCodigo(coupon.getCodigo());
        coupon1.setDesconto(coupon.getDesconto());
        coupon1.setDescricao(coupon.getDescricao());
        return couponRepository.save(coupon1);
    }

    // Delete
    public void deleteCoupon(Integer id) {
        couponRepository.deleteById(id);
    }

    // Read All
    public Iterable<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }
}