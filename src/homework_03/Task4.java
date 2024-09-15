package homework_03;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.09.2024
 */

/*
Task 3 * (Опционально)
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).

Вычислите среднюю температуру за неделю и выведете ее на печать.
 */

public class Task4 {

    public static void main(String[] args) {

        int t1 = 20;
        int t2 = 18;
        int t3 = 22;
        int t4 = 17;
        int t5 = 23;
        int t6 = 21;
        int t7 = 20;

        int days = 7;

        // Сумма всех значений деленная на их количество

        int sumTemp = t1 + t2 + t3 + t4 + t5 + t6 + t7;
        System.out.println("sumTemp: " + sumTemp);

        // x / 7 -> средняя температура
        // 141 / 7 -> 20.14..

//        double averageTemp =  sumTemp /  days; // Обрезается дробная часть в операции деления
        double averageTemp =  sumTemp / (double) days;


        System.out.println("averageTemp: " + averageTemp);


    }
}
