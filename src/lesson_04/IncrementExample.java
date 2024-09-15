package lesson_04;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.09.2024
 */

public class IncrementExample {
    public static void main(String[] args) {
        int var = 5;

        var += 5; //  var = var + 5;
        System.out.println("var: " + var);
        var -= 2; // var = var - 2;
        var *= 2;
        var /= 4;
        System.out.println("var: " + var);
        // Инкремент, декремент
        var++; //  var += 1; // var = var + 1;
        var--; // var -= 1; // var = var - 1;
        System.out.println("var: " + var);


        System.out.println("==============");
        int x = 100;
        System.out.println("x1: " + x++);
        System.out.println("x2: " + x);

        int y = 100;
        System.out.println("y1: " + ++y);
        System.out.println("y2: " + y);
    }
}
