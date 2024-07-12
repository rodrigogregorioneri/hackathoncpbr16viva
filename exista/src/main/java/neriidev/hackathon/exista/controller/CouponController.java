package neriidev.hackathon.exista.controller;

import neriidev.hackathon.exista.domain.Coupon;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cupons")
public class CouponController {

    @GetMapping
    public ResponseEntity<List<Coupon>> getAllCupons() {

        return ResponseEntity.ok(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coupon> getCupomById(@PathVariable String id) {

        return ResponseEntity.ok(null);
    }

    @PostMapping
    public ResponseEntity<Coupon> createCupom(@RequestBody Coupon cupom) {

        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Coupon> updateCupom(@PathVariable String id, @RequestBody Coupon cupom) {

        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCupom(@PathVariable String id) {

        return ResponseEntity.ok().build();
    }
}