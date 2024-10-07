package lesson_18.staticBlockDemo;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.10.2024
 */

public class Test1 {
    public static void main(String[] args) {

        // Если в программе не используется статика или
        // не создаются объекты класса InitExample,
        // то его статические члены не будут проинициализированы

        System.out.println(InitExample.counter);


    }
}
