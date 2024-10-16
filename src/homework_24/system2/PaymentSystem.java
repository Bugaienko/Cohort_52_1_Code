package homework_24.system2;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.10.2024
 */

public interface PaymentSystem {
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();
    void transferMoney(double amount, PaymentSystem recipient); // (перевод средств на другой счет)

    String getCurrency();
    String getTitle();
}
