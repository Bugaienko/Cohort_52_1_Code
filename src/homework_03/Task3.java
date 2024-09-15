package homework_03;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.09.2024
 */

/*
Task 3 * (Опционально)
Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.

Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.

Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
 */

public class Task3 {
    public static void main(String[] args) {

        double priceA = 1000;
        double priceB = 500;

        int discount = 10; // в процентах

        double discountMoney = (priceA + priceB)  * discount / 100;

        // Option 1
        double priceWithDiscount = priceA + priceB - discountMoney;
        // Option 2
        double priceWithDiscount1 = (priceA + priceB) * (100 - discount) / 100;

        System.out.println("discountMoney: " + discountMoney);
        System.out.println("priceWithDiscount: " + priceWithDiscount);
        System.out.println("priceWithDiscount1: " + priceWithDiscount1);




    }
}
