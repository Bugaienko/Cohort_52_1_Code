package homework_24.system2;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.10.2024
 */

abstract class PaymentSystemImpl implements PaymentSystem {

    private String title;
    private double balance;

    private double courseBtc;

    private final String currency;

    public PaymentSystemImpl(String title, double balance, String currency) {
        this.title = title;
        this.balance = balance;
        this.currency = currency;
        setActualCourseBtc();
    }

    public void setActualCourseBtc() {
        // запрос на сервер платежной системы, получение курса на момент запроса
        this.courseBtc = 60000;
    }

    public void setActualCourseBtc(double currentCourseBtc) {
        this.courseBtc = currentCourseBtc;
    }

    @Override
    public void withdrawMoney(double amount) {
        // -100 | 5000
        // 100000 | 5000

        if (amount < 0 || amount > balance) {
            System.out.println("Денег не достаточно для снятия со счета!");
            return;
        }
        balance -= amount;
        System.out.println(title + ": Снято со счета " + amount + " " + currency);
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount < 0) {
            System.out.println(title + ": Недопустимая сумма к зачислению на счет!");
            return;
        }

        balance += amount;
        System.out.println(title + ": Зачислено на счет: " + amount + " " + currency);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getCurrency() {
        return currency;
    }

    public double getCourseBtc() {
        return courseBtc;
    }

    @Override
    public String toString() {
        return "PaymentSystemImpl{" +
                "title='" + title + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }



    @Override
    public double checkBalance() {
        return balance;
    }


}
