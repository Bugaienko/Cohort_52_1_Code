package homework_09;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.09.2024
 */

/*
Task4 * (опционально)
Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:

1
12
123
1234
12345
123456
 */

public class Task4 {
    public static void main(String[] args) {

        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        int[][] arr = new int[3][4];
        System.out.println();

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(51);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // многомерные массивы
        int[][][][] arrMulti = new int[2][4][2][7];


    }
}
