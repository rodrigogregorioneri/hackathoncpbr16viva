package neriidev.hackathon.exista.service.integrationServices;

import neriidev.hackathon.exista.adapters.stores.StoreClient;
import neriidev.hackathon.exista.adapters.wallet.WalletClient;
import neriidev.hackathon.exista.domain.Store;
import neriidev.hackathon.exista.domain.StoreResponse;
import neriidev.hackathon.exista.domain.Wallet;
import neriidev.hackathon.exista.domain.WalletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WalletService {

  @Autowired
  private WalletClient walletClient;

  @Autowired
  private StoreClient storeClient;

  public WalletResponse getValueTotal() {
    WalletResponse walletResponse = new WalletResponse();
    List<Wallet> wallets = walletClient.getWalletDetails().getBody();
    double total = 0;
    for (Wallet wallet : wallets) {
      for(Wallet.Transaction transaction :wallet.getTransactions()){
        total += transaction.getAmount();
        System.out.println(total);
      }
      System.out.println(total);
    }
    walletResponse.setAmount(total);
    return walletResponse;
  }

  public List<Wallet> getWalletsWithLeastTransactions() {
    List<Wallet> wallets = walletClient.getWalletDetails().getBody();
    List<Wallet> walletsWithLeastTransactions = new ArrayList<>();
    int leastTransactions = Integer.MAX_VALUE;

    for (Wallet wallet : wallets) {
      int transactionCount = wallet.getTransactions().size();
      if (transactionCount < leastTransactions) {
        leastTransactions = transactionCount;
        walletsWithLeastTransactions.clear();
        walletsWithLeastTransactions.add(wallet);
      } else if (transactionCount == leastTransactions) {
        walletsWithLeastTransactions.add(wallet);
      }
    }

    return walletsWithLeastTransactions;
  }

  public WalletResponse quantidadesCompras() {
    WalletResponse walletResponse = new WalletResponse();
    List<Wallet> wallets = walletClient.getWalletDetails().getBody();
    int totalCompras = 0;
    for (Wallet wallet : wallets) {
      for(Wallet.Transaction transaction :wallet.getTransactions()){
        totalCompras += 1;
        System.out.println(totalCompras);
      }
      System.out.println(totalCompras);
    }
    walletResponse.setCompras(totalCompras);
    return walletResponse;
  }

  public StoreResponse quantidadedeLojas() {
    StoreResponse response = new StoreResponse();
    List<Store> wallets = storeClient.getStoreDetails().getBody();
    int totalLojas = 0;
    for (Store store : wallets) {
      totalLojas += 1;
    }
    response.setQtdLojas(totalLojas);
    return response;
  }
}
