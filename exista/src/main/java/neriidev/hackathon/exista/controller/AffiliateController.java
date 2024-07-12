package neriidev.hackathon.exista.controller;

import neriidev.hackathon.exista.domain.Affiliate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/afiliados")
public class AffiliateController {

    @GetMapping
    public ResponseEntity<List<Affiliate>> getAllAfiliados() {

        return ResponseEntity.ok(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Affiliate> getAfiliadoById(@PathVariable String id) {

        return ResponseEntity.ok(null);
    }

    @PostMapping
    public ResponseEntity<Affiliate> createAfiliado(@RequestBody Affiliate afiliado) {

        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Affiliate> updateAfiliado(@PathVariable String id, @RequestBody Affiliate afiliado) {

        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAfiliado(@PathVariable String id) {

        return ResponseEntity.ok().build();
    }
}