package consultation_08;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.10.2024
 */

/*
Класс BigDecimal предоставляет методы для выполнения основных математических операций.
Кроме того он позволяет конвертировать значения в примитивные типы данных
 */

public class BigDecimalExample {
    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("3.14");
        BigDecimal num2 = new BigDecimal("5.75");

        BigDecimal result = num1.add(num2);
        System.out.println(result);

        System.out.println("num1.subtract(num2): " + num1.subtract(num2));
        System.out.println("num1.multiply(num2): " + num1.multiply(num2));
        System.out.println("num1.divide(num2, 2, BigDecimal.ROUND_HALF_UP): " + num1.divide(num2, 2, BigDecimal.ROUND_HALF_UP));

        int intValue = result.intValue();
        System.out.println(intValue);
        double doubleValue = result.doubleValue();
        System.out.println(doubleValue);

        System.out.println("\n=========================");
        BigDecimal bigDecimal = new BigDecimal("3.143519");
        // Округление
        BigDecimal rounded = bigDecimal.setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(rounded);



    }
}
