package neriidev.hackathon.exista.service;

import neriidev.hackathon.exista.adapters.customer.CustomerCLient;
import neriidev.hackathon.exista.adapters.wallet.WalletClient;
import neriidev.hackathon.exista.domain.Customers;
import neriidev.hackathon.exista.domain.Wallet;
import neriidev.hackathon.exista.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;



    @Autowired
    private CustomerCLient customerCLient;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Create
    public Customers createCustomer(Customers customer) {
        return customerRepository.save(customer);
    }

    // Read
    public Customers getCustomerByPhone(String phone) {

        List<Customers> customers = customerCLient.getCustomerDetails().getBody();
        for (Customers customer : customers) {
            if (customer.getPhone().equals(phone)) {
                return customer;
            }
        }
        return null;
    }

    public ResponseEntity<Customers> getAllCustomersId(String id) {
        return customerCLient.getCustomerDetailsId(id);
    }
    public List<Customers> getAllCustomers() {
        return  customerCLient.getCustomerDetails().getBody();
    }


}
