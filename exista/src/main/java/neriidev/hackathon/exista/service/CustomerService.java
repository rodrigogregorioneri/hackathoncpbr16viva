package neriidev.hackathon.exista.service;

import neriidev.hackathon.exista.domain.Customers;
import neriidev.hackathon.exista.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Create
    public Customers createCustomer(Customers customer) {
        return customerRepository.save(customer);
    }

    // Read
    public Optional<Customers> getCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    // Update
    public Customers updateCustomer(Integer id, Customers customer) {
        Customers existingCustomer = customerRepository.findById(id).orElseThrow();
        existingCustomer.setFirstName(customer.getFirstName());
        existingCustomer.setLastName(customer.getLastName());
        // Add more setters here based on the fields in your Customers class
        return customerRepository.save(existingCustomer);
    }
    // Delete
    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

    // Read All
    public List<Customers> getAllCustomers() {
        return customerRepository.findAll();
    }
}