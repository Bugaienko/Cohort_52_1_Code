package homework_11;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.09.2024
 */
/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.
 */
    /*
    Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).


     */

public class Task1and2 {
    public static void main(String[] args) {

        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ints1 = {-5, 0, 5};
        int sum = sumElements(ints);

        System.out.println(sum);
        System.out.println(sumElements(ints));

        int[] intsNull = null;
        System.out.println(sumElements(intsNull));

        double[] doubles = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumElements(doubles));

        double d1 = 4; // 4.0

        System.out.println(averageArray(intsNull));

        int[] emptyArray = new int[0]; //[]

        double averageDouble = averageArray(emptyArray);
        System.out.println("avDouble: " + averageDouble);


    }

    // Написать метод принимающий строку и возвращающий ее длину

    // [];

    public static double averageArray(int[] ints) {
        if (ints == null) {
            return Integer.MIN_VALUE;
        }
       double sum = sumElements(ints); // -2147......
       double average = sum / ints.length; // 0
       return average;
    }

    public static int sumElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("В метод передан не корректный массив!!!");
            return Integer.MIN_VALUE;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static double sumElements(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
