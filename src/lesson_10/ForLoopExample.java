package lesson_10;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.09.2024
 */

public class ForLoopExample {
    public static void main(String[] args) {

        /*

        for ( <Блок инициализации> ; <Блок проверок / условие выхода> ; <Блок изменений>) {
         // Тело цикла
        }
         */

        // Вывести все числа от 0 до 10

        int j = 0;
        while (j <= 10) {
            System.out.print(j + ", ");
            j++;
        }

        System.out.println("\nEnd while loop " + j);

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", ");
        }



        System.out.println("\nEnd for loop\n");

//        for ( ; ; ) {
//            System.out.println("Hello World");
//        }
        // Запустится бесконечный цикл. Для цикла for ни один из блоков не является обязательным

        int i1 = 5;

        for ( i1 = 0; i1 >= 0; i1 = i1 + 10_000_000) {
            System.out.print(i1 + ", ");
        }
        System.out.println();
        System.out.println("i1 = " + i1);

        // В блоке инициализации может быть переменная любого типа

        for (String str = "Hello";  str.length() < 10; str += "$" ) {
            System.out.println(str);
        }

        System.out.println("Продолжение кода");

        // if (условие) оператор;
        if (true) System.out.println("True");
        // {} - позволяет объединить в себе несколько команд. От 0 до бесконечности команд
        // for () оператор

        System.out.println(" ================ \n");

        // Мы можем инициализировать несколько переменных в блоке инициализации
        // В блоке изменений мы также можем менять несколько переменных


        int k = 14;
        for (int a = 0, f = 1 ; k >= 0 && f < 10 ; k--, a = ++a + k, f++ ) {
            System.out.println(k + " : " + a + " : " + f);
        }

        System.out.println("\n ================ ");

        // Создать массив целых чисел случайной длины в диапазоне от 5 до 15
        // Заполнить массив случайными числами от -50 до 50 включительно

        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5]; // получить случайную длину
        System.out.println("Длина массива: " + ints.length);

        System.out.print("[");

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // (0..100) - 50 -> (-50..50)
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n"));
        }

        System.out.println("============= \n");

        // continue, break

        for (int i = 1; i < 7 ; i++){

            if (i == 3) continue; // continue - прервать текущую итерацию и перейти к следующей итерации цикла
            // Мы перейдем в блок изменения переменных, потом в блок проверки условия
            // В текущей итерации после continue все операторы в теле цикла будут пропущены.

            System.out.print(i + ", ");
        }
        System.out.println();


        for (int i = 1; i < 7; i++) {
            if (i == 3) break; // break заканчивает текущую итерацию цикла и весь цикл.
            // Все последующий итерации выполнены не будут
            System.out.print(i + "; ");
        }
        System.out.println("\nEnd loop with break");

        // continue и break работают аналогичным образом в циклах while
        int y = 1;
        while (y < 7) {
            if (y == 3) {
                y++;
                continue;
            }

            System.out.print(y++ + ", ");
        }
        System.out.println("\nEnd while loop with continue");





    }

}

//        long temp = 100_000_2_000_000_000L;
//        System.out.println("temp: " + temp);