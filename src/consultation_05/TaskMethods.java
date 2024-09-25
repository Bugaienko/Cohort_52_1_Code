package consultation_05;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.09.2024
 */

public class TaskMethods {
    public static void main(String[] args) {

       // Написать метод, определяющий присутствует ли число в массиве.
        // Тип возвращаемого значение:
        // 1. boolean (true -> число есть, false -> числа нет)
        // 2. int -> индекс числа в массиве. Если число есть - вернется что-то >= 0.
        // Если числа нет - вернется -1;

        int[] ints = {1, 55, 66, 88, -100, -46, 0, 26};
        int findMe = 0;

       boolean bol = findNumberInArray(ints, findMe);

        System.out.println("bol: " + bol);

        int index = findNumberInArrayOption2(ints, findMe);
        System.out.println("index: " + index);

        if (index < 0) {
            System.out.println(findMe + " - > не найдено в массиве");
        } else {
            int num = ints[index];
            System.out.println("Найдено число: " + num);
        }


    }

    public static int findNumberInArrayOption2(int[] arr, int number) {
        if (arr == null || arr.length == 0) return -1;
        // Перебрать все значения в массиве. И сравнить каждое с искомым
        // Если текущий элемент в массиве равен искомому числу, значит мы его нашли. Число есть в массиве
        // Прекращаем дальнейшие возвращаем индекс числа
        // Если число не найдено - вернем минус 1.

        for (int i = 0; i <= arr.length -1; i++) {
            if (arr[i] == number) return i;
        }

        //Перебрали все числа, совпадений не нашли (ни разу if не выдал нам true)
        return -1;

    }


    public static boolean findNumberInArray(int[] arr, int number) {
        if (arr == null || arr.length == 0) return false;
        // Перебрать все значения в массиве. И сравнить каждое с искомым
        // Если текущий элемент в массиве равен искомому числу, значит мы его нашли. Число есть в массиве
        // Прекращаем дальнейшие поиски и возвращаем true

        for (int i = 0; i <= arr.length -1; i++) {
            if (arr[i] == number) return true;
        }

        //Перебрали все числа, совпадений не нашли (ни разу if не выдал нам true
        return false;

    }
}



















