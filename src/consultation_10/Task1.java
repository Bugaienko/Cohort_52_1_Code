package consultation_10;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Task1 {

    public static void main(String[] args) {

       int[] link; // переменная может хранить адрес области памяти, в которой расположен объект массива целых чисел.

       link = new int[10]; // создается новый массив

       int x = 0;


        System.out.println(link[0]);
        int len = link.length; // Возможность обратиться к ссылке и получить длину массива обусловленная типом ссылки.


    }
}
