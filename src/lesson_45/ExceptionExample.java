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
        } finally { // Не обязательный блок
            // код, который выполнится в любом случае (или после завершения блока try, или после catch)
        }


         */

        int[] numbers = {1, 2, 5};
//        array[10] = 100;

        int res;
        try {
            numbers[1] = 1000;
            String s = "null";
            s.length();
            res = 1 / 0;
            System.out.println("Конец блока try");
        } catch (NullPointerException npe) {
            System.out.println("NPE catch");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException catch: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Какая-то ошибка. " + ex.getMessage());
            System.out.println(ex.getClass());
//            ex.printStackTrace();
        } finally {
            // Этот код выполнится после блока try / catch - независимо будет Exception или нет)
            System.out.println("Finally code");

        }


        System.out.println("Код поле присвоение значения в массив");

        System.out.println("\n==============\n");

        String url = getUrlString();
        System.out.println(url);

        System.out.println("\n======= throws");

        String url1 = null;
        try {
            url1 = getUrlString2();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(url1);


    }

    // Ключевое слово throws используется в сигнатуре метода, для указания,
    // что метод может выбросить исключение
    private static String getUrlString2() throws MalformedURLException {
        URL myUrl = null;

        myUrl = new URL("https://google.com");

        return myUrl.toString();
    }

    private static String getUrlString() {

        URL myUrl = null;
        String defaultUrl = "http://google.com";

        try {
            myUrl = new URL("htps://google.com");
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
        } finally {
            if (myUrl == null) {
                try {
                    myUrl = new URL(defaultUrl);
                } catch (MalformedURLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        return myUrl.toString();
//        return myUrl == null ? "null" : myUrl.toString();
    }
}
