package neriidev.hackathon.exista.controller;

import neriidev.hackathon.exista.adapters.customer.CustomerCLient;
import neriidev.hackathon.exista.domain.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class CustomerController {

    private List<Customers> clientes;

    @Autowired
    CustomerCLient customerCLient;

    @GetMapping
    public ResponseEntity<List<Customers>> getAllClientes() {
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customers> getClienteById(@PathVariable String id) {
       return customerCLient.getCustomerDetails(id);

    }

    @PostMapping
    public ResponseEntity<Customers> createCliente(@RequestBody Customers newCliente) {
        clientes.add(newCliente);
        return ResponseEntity.ok(newCliente);
    }

}