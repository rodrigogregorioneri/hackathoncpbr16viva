package neriidev.hackathon.exista.controller;

import neriidev.hackathon.exista.domain.Coupon;
import neriidev.hackathon.exista.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/cupons")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @GetMapping
    public ResponseEntity<Iterator<Coupon>> getAllCupons() {

        return ResponseEntity.ok(couponService.getAllCoupons().iterator());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coupon> getCupomById(@PathVariable Integer id) {
        return couponService.getCouponById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Coupon> createCupom(@RequestBody Coupon cupom) {
        return ResponseEntity.ok(couponService.createCoupon(cupom));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Coupon> updateCupom(@PathVariable Integer id, @RequestBody Coupon cupom) {

        return ResponseEntity.ok(couponService.updateCoupon(id, cupom));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCupom(@PathVariable Integer id) {
        couponService.deleteCoupon(id);
        return ResponseEntity.ok().build();
    }
}