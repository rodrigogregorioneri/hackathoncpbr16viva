package neriidev.hackathon.exista.service;

import neriidev.hackathon.exista.domain.Affiliate;
import neriidev.hackathon.exista.repository.AffiliateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AffiliateService {

    private final AffiliateRepository affiliateRepository;

    @Autowired
    public AffiliateService(AffiliateRepository affiliateRepository) {
        this.affiliateRepository = affiliateRepository;
    }

    // Create
    public Affiliate createAffiliate(Affiliate affiliate) {
        return affiliateRepository.save(affiliate);
    }

    // Read
    public Optional<Affiliate> getAffiliateById(Integer id) {
        return affiliateRepository.findById(id);
    }

    // Update
    public Affiliate updateAffiliate(Integer id, Affiliate affiliate) {
        Affiliate existingAffiliate = affiliateRepository.findById(id).orElseThrow();
        existingAffiliate.setNome(affiliate.getNome());
        existingAffiliate.setEmail(affiliate.getEmail());
        // Add more setters here based on the fields in your Affiliate class
        return affiliateRepository.save(existingAffiliate);
    }

    // Delete
    public void deleteAffiliate(Integer id) {
        affiliateRepository.deleteById(id);
    }

    // Read All
    public List<Affiliate> getAllAffiliates() {
        return affiliateRepository.findAll();
    }
}
