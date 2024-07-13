package neriidev.hackathon.exista.controller;

import neriidev.hackathon.exista.domain.Customers;
import neriidev.hackathon.exista.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customers>> getAllClientes() {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customers> getClienteById(@PathVariable Integer id) {
       return ResponseEntity.ok(customerService.getCustomerById(id).get());
    }

    @PostMapping
    public ResponseEntity<Customers> createCliente(@RequestBody Customers newCliente) {
        return ResponseEntity.ok(customerService.createCustomer(newCliente));
    }

}