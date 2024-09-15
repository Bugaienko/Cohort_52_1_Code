package homework_03;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.09.2024
 */

/*
Task 2
Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4. Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
Выведите на экран значение переменной.
Сколько программа отбросила в дробной части?
 */

public class Task2 {
    public static void main(String[] args) {

        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;

        // Приоритет мат. операций.
        int average = (var1 + var2 + var3 + var4) / 4;
        System.out.println("average: " + average);

        int rest = (var1 + var2 + var3 + var4) % 4;
        System.out.println("rest: " + rest);

    }
}
