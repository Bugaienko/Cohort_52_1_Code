package lesson_09;

/**
 * @author Sergey Bugaenko
 * {@code @date} 20.09.2024
 */

public class MethodExample2 {

    public static void main(String[] args) {

        int temp = 5;
        System.out.println("1: " + temp);

        changeMe(temp);

        System.out.println("2: " + temp);


        String string = "Java";
        changeMe(string);
        System.out.println("3: " + string);

        int[] arr = {0, 1, 2, 3, 4, 5};
        changeMe(arr);
        printArray(arr);

        int[] array2 = arr;
        printArray(array2);
        array2[5] = -5000;
        printArray(array2);
        printArray(arr);

        System.out.println(" ============= ");
        array2 = new int[]{1, 2, 3};
        printArray(array2);
        printArray(arr);


    } // Method Area

    public static void changeMe(int[] array) {
        array[0] = 1000;
    }

    public static void changeMe(String str) {
        str = str + "!!!";
        System.out.println(str);
    }


    public static void changeMe(int x) {
        x = 100;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
            i++;
        }
    }
}
