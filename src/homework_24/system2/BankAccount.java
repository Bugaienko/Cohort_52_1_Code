package homework_24.system2;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.10.2024
 */

public class BankAccount extends PaymentSystemImpl {

    public BankAccount(String title, double balance) {
        super(title, balance, "EUR");
    }


    @Override
    public void transferMoney(double amountEur, PaymentSystem recipient) {
        /*
        1. Проверить достаточно ли средств
        2. Проверить валюту счета получателя
        3. Если нужна конвертация - произвести ее
        4. Снять с нашего счета средства
        5. Зачислить на счет получателя средства (в валюте счета получателя)
         */

        if (amountEur > checkBalance()) {
            System.out.printf("Недостаточно средств! (amount: %.2f | bal: %.2f)\n", amountEur, checkBalance());
            return;
        }

        if (recipient.getCurrency().equals("EUR")) {
            recipient.depositTransfer(amountEur);
            this.withdrawMoney(amountEur);
            System.out.printf("Успех! Перевод: %.2f EUR (%s) -> %s",
                    amountEur, this.getTitle(), recipient.getTitle());
        } else if (recipient.getCurrency().equals("BTC")) {
            double course =  this.getCourseBtc();

            double amountTransferBtc = amountEur / course;
            recipient.depositTransfer(amountTransferBtc);
            this.withdrawMoney(amountEur);
            System.out.printf("Успех! Перевод %.2f EUR (%s) -> %.2f BTC (%s)\n",
                    amountEur, this.getTitle(), amountTransferBtc, recipient.getTitle());
        } else {
            System.out.println("Что-то пошло не так. Валюта счета получателя не поддерживается");
        }
    }


    @Override
    public String toString() {
        return "Bank {" +
                getTitle() +
                ", balance: " + checkBalance() +
                ", currency: " + getCurrency() +
                "}";
    }
}
















