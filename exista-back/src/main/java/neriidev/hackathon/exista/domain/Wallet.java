package neriidev.hackathon.exista.domain;

import lombok.Data;

import java.util.List;

@Data
public class Wallet {
  private String customerId;
  private double balance;
  private List<Transaction> transactions;

  @Data
  public static class Transaction {
    private String storeId;
    private String date;
    private double amount;
    private String type;
    private String description;


  }
}
