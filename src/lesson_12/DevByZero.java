package lesson_12;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.09.2024
 */

public class DevByZero {
    public static void main(String[] args) {

//        int a = 100;
//        int b = 0;
//        int c = a / 0;
//        System.out.println(c);

        double d1 = 100;
        double d2 = 0;
        double c1 = d1 / d2;
        double c2 = 5000 / d2;
        System.out.println(c1);
        System.out.println(c2);

        double test = c1 - c2;
        System.out.println(test);

        System.out.println(c1 == c2);
        System.out.println(c1 > c2);
        test = c1 / c2;
        System.out.println(test);

        test = c1 * c2;
        System.out.println(test);
        test = c1 + c2;
        System.out.println(test);
        test = c1 * -1;
        System.out.println(test);


    }
}
