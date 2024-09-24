package lesson_09;

/**
 * @author Sergey Bugaenko
 * {@code @date} 20.09.2024
 */

public class MethodsExample {
    public static void main(String[] args) {

        sayHello();
        sayHello();
        sayHello();

        String string = "Java";

//        System.out.println(string);

        saySomething("Java");

        char ch = 'A';
        char anotherChar = 'B';

        printDecimalCodeChar(ch);
        printDecimalCodeChar(anotherChar);
        printDecimalCodeChar('J');

        System.out.println(" ========= PrintArray ========== \n");

        int[] array = {1, 45, 76, 54, 90, 435, 0, 45};

        printArray(array);
        int[] array2 = {1, 2, 5, 777, 654, 88, 543, -100, 4545, 12, 0};

       // String[] strings = {"One", "Two", "Three", "Four", "Five"};
       //  printArray(strings);

        printArray(array2);

        array[0] = -1000000;
        array[3] = 101010101;

        printArray(array);

        System.out.println(" ============= Перегрузка ============\n");


        // ПЕРЕГРУЗКА методов
        /*
        В пределах одного класса может существовать два и более метода с одинаковым именем,
        но разным набором параметров (перегрузка методов)

        Сигнатура метода - совокупность названия и набора параметров (порядок передачи параметров имеет значение).
         */

        // написать метод, который выводит на экран числа от 1 до N
        printNumbers(10);

        // Написать метод, который выводит н экран числа X до Y
        printNumbers(5, 10);
        printNumbers("Java", 1);
        printNumbers(2, "Python");


    } // Method area

    public static void printNumbers(int x, String str) {
        System.out.println("Method opt 1: " + str);
    }

    public static void printNumbers(String str, int x) {
        System.out.println("Method opt 2: " + str);
    }

    public static void printNumbers(int x, int y) {
        int i = x;
        while (i <= y) {
            System.out.print(i++ + ", ");
        }
        System.out.println();
    }

    public static void printNumbers(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print(i++ + ", ");
        }
        System.out.println();
    }


    public static void printArray(int[] array) {
        System.out.print("[");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
            i++;
        }
    }

    public static void printDecimalCodeChar(char ch1) {
        System.out.println((int) ch1);
    }


    public static void saySomething(String text) {
        System.out.println(text);
    }

    public static void sayHello() {
        // Тело метода
        System.out.println("Hello!");
    }


} // End class
