package neriidev.hackathon.exista.controller;

import neriidev.hackathon.exista.domain.Cards;
import neriidev.hackathon.exista.domain.Customers;
import neriidev.hackathon.exista.domain.WalletResponse;
import neriidev.hackathon.exista.service.integrationServices.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/wallets")
public class WalletController {


  @Autowired
  private WalletService customerService;

  @GetMapping
  public ResponseEntity<WalletResponse> getAllClientes() {
    System.out.println(customerService.getValueTotal());
    return ResponseEntity.ok(customerService.getValueTotal());
  }


  @GetMapping("/topCards")
  public ArrayList<Cards> getTopCards() {
    ArrayList<Cards> topCards = new ArrayList<>();

    String value1 = "R$ "+customerService.getValueTotal().getAmount().toString();
    String value2 = "50";
    String value3 = customerService.quantidadedeLojas().getQtdLojas().toString();
    String value4 = customerService.quantidadesCompras().getCompras().toString();


    topCards.add(new Cards("success", "bi bi-wallet",value1 , "Ganhos Totais"));
    topCards.add(new Cards("danger", "bi bi-coin", value2, "Lojas com maiores transações"));
    topCards.add(new Cards("warning", "bi bi-basket3", value3, "Quantidade de Lojas"));
    topCards.add(new Cards("info", "bi bi-bag", value4, "Totais de Vendas"));

    return topCards;
  }
}
