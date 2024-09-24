package homework_09;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.09.2024
 */

/*
Task 1
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке,
а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]

Еще одна перегрузка: метод принимает массив и булевый флаг.
Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке
 */

public class Task1 {
    public static void main(String[] args) {

        int[] array = {1, 4, 3, 6, 7};
        printReverseArrayWhile(array, 2);
        printReverseArrayFor(array, 2);

        System.out.println("Reverse without index ");
        printReverseArrayWhile(array);

        System.out.println("Reverse with boolean ");
        printReverseArrayWhile(array, true);
        printReverseArrayWhile(array, false);

    } // Method area

    public  static  void  printReverseArrayWhile (int[] arr, int index) {
        System.out.print("[");
        int i = 0;
        while (i < index) {
            System.out.print(arr[i] + ", ");
            i++;
        }

        i = arr.length - 1;
        while (i >= index) {
            System.out.print(arr[i] + (i != index ? ", " : "]\n"));
            i--;
        }
    }

    public  static  void  printReverseArrayWhile (int[] arr) {
        printReverseArrayWhile(arr, 0);
    }

    public  static  void  printReverseArrayWhile (int[] arr, boolean flag) {
        if (flag) {
            // flag = true
            printReverseArrayWhile(arr);
        } else {
            printReverseArrayWhile(arr, arr.length - 1);
        }
    }


    public  static  void  printReverseArrayFor (int[] arr, int index) {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + ", ");
        }
        for (int i = arr.length - 1; i >= index ; i--) {
            System.out.print(arr[i] + (i != index ? ", " : "]\n"));
        }
    }



}
