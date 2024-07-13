package neriidev.hackathon.exista.controller;

import neriidev.hackathon.exista.domain.Affiliate;
import neriidev.hackathon.exista.service.AffiliateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/afiliados")
public class AffiliateController {

    @Autowired
    private AffiliateService affiliateService;

    @GetMapping
    public ResponseEntity<List<Affiliate>> getAllAfiliados() {

        return ResponseEntity.ok(affiliateService.getAllAffiliates());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Affiliate> getAfiliadoById(@PathVariable Integer id) {
        return ResponseEntity.ok(affiliateService.getAffiliateById(id).get());
    }

    @PostMapping
    public ResponseEntity<Affiliate> createAfiliado(@RequestBody Affiliate afiliado) {
        return ResponseEntity.ok(affiliateService.createAffiliate(afiliado));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Affiliate> updateAfiliado(@PathVariable Integer id, @RequestBody Affiliate afiliado) {
        return ResponseEntity.ok(affiliateService.updateAffiliate(id, afiliado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAfiliado(@PathVariable Integer id) {
        affiliateService.deleteAffiliate(id);
        return ResponseEntity.ok().build();
    }
}