package MyWallet.domain.repository;

import MyWallet.domain.model.User;
import MyWallet.domain.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletRepository  extends JpaRepository<Wallet, Long> {
    Wallet getFirstByWallet(String walletName);
}
