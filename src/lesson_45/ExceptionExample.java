package lesson_45;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.11.2024
 */

public class ExceptionExample {
    public static void main(String[] args) {

        /*
        Ошибки компиляции - ошибки, которые возникают на этапе компиляции программы
        Время выполнения (runtime) - время, когда программа выполняется после ее компиляции
        Ошибки времени выполнения.

        Exceptions (исключение) - представляет собой событие, которые возникают во время выполнения программы
        и нарушают ее нормальное выполнение.


         */

//        int a = "Java";
        // String str = "Java"

        // System.out.println( 1 / 0); // java.lang.ArithmeticException
        int[] array = {1, 2, 4};
        // array[10] = 100;  //  java.lang.ArrayIndexOutOfBoundsException

        String str = null;
        // str.length(); // java.lang.NullPointerException

        /*
        Механизм обработки исключений
        try {
            // код который может вызвать исключение
        } catch(ExceptionType ex) {
            // код обработки исключения
        }


         */

        int[] numbers = {1, 2, 5};
//        array[10] = 100;

        try {
            numbers[1] = 1000;
            String s = "null";
            s.length();
            System.out.println(1 /0 );
            System.out.println("Код в блоке try");
        }
        catch (NullPointerException npe) {
            System.out.println("NPE catched");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException catched: " + e.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Какая-то ошибка. " + ex.getMessage());
            System.out.println(ex.getClass());
//            ex.printStackTrace();
        }



        System.out.println("Код поле присвоение значения в массив");

        String url = getUrlString();
        System.out.println(url);


    }

    private static String getUrlString() {

        URL myUrl = null;

        try {
            myUrl = new URL("https://google.com");
            System.out.println("Next line code");
        } catch (MalformedURLException exception) {
            System.out.println("неверный формат URL: " + exception.getMessage());
            System.out.println(exception.toString());
            System.out.println("==========");
//            exception.printStackTrace();

            /*
            getMessage() - возвращает строку с коротким описание исключения
            toString() - Строковое представление исключения
            printStackTrace() - выводит трассировку исключения
             */
        }

        return myUrl == null ? "null" : myUrl.toString();
    }
}
