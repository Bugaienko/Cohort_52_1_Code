package homework_24.system2;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.10.2024
 */

public class PaySystemApp {
    public static void main(String[] args) {

        BankAccount bank = new BankAccount("Bank1", 100_000);
        BankAccount bank2 = new BankAccount("Bank2", 10_000);


        System.out.println(bank);
        System.out.println(bank2);

        bank.transferMoney(50000, bank2);

        System.out.println(bank);
        System.out.println(bank2);
        System.out.println("\n ================= \n");

        bank2.transferMoney(100000, bank);



    }
}

/*
Task 2
Платежные системы
Создайте интерфейс PaymentSystem с методами:

withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).

Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.

Опционально
Добавить в интерфейс метод:

transferMoney() (перевод средств на другой счет) - Средства списываются с одного счета и зачисляются на другой счет
Должна быть возможность осуществлять переводы между этими классами. Т.е. возможность перевода средств:
Банк -> Банк
Банк -> Кошелек
Кошелек -> Кошелек
Кошелек -> Банк
 */