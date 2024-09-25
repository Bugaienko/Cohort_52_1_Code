package homework_10;

import java.util.Arrays;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.09.2024
 */

/*
Task 1
Написать метод со следующим функционалом:

На вход метод принимает массив целых чисел и число - длину нового массива.
Метод должен создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Copy
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Copy
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */

public class Task1 {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6};
        copyOfArray(array, 10);

        array = null;

        int[] array2 = null;
        copyOfArray(array2, 10);

        // null - что ссылка не ссылается ни на какой объект
       String str = null;

       str = "Java";

       if (str != null) {
           System.out.println(str.length());
           System.out.println(str.toUpperCase());
       }

       int[] array1 = null;

       if (str.equals("Java")) {
           array1 = new int[10];
       } else {
           array1 = new int[2];
       }
//        copyOfArray(arr1, 2);



    } // Methods area


    public static void copyOfArray(int[] array, int newLength) {

        if (array == null) {
            return;
        }

        int[] result = new int[newLength];

        //Распечатать красиво массив
        String arrayStr = Arrays.toString(result);


        /*
            Массив всегда при создании заполняется значениями по умолчанию
            числовые типы данных (в том числе char) -> 0 / 0.0
            boolean -> false
            ссылочные типы (в том числе String) -> null
         */


        for (int i = 0; i < result.length && i < array.length; i++) {
            result[i] = array[i];
        }


        System.out.println(Arrays.toString(result));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }


}


















