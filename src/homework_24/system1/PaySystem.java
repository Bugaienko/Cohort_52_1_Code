package homework_24.system1;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.10.2024
 */

public interface PaySystem {

    void withdrawMoney(double amount); // (снятие со счета) - списываются деньги со счета
    void depositTransfer(double amount); // (поступление денег на счет);
    double checkBalance(); // (остаток на счете).
}
