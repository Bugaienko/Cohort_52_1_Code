package homework_24.system1;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.10.2024
 */

public class BankAccount implements PaySystem {

    private double balance;
    private String title;
    private final String currency;

    public BankAccount(double balance, String title) {
        this.balance = balance;
        this.title = title;
        this.currency = "EUR";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance + " " + currency +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        System.out.println("Withdrawing " + amount + " from bank " + title );
        balance -= amount;

    }

    @Override
    public void depositTransfer(double amount) {
        if (amount < 0 ) {
            System.out.println("Недопустимая сумма");
            return;
        }

        System.out.println("Deposit " + amount + " to " + title );
        balance += amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
