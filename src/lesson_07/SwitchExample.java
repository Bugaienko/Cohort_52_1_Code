package lesson_07;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.09.2024
 */

public class SwitchExample {
    public static void main(String[] args) {

        int x = 5;

        if (x == 5) {
            System.out.println("if: x равен 5");
        } else if (x == 7) {
            System.out.println("if-else: x равен 7");
        } else {
            System.out.println("else: что-то другое");
        }


        switch (x) {
            case 5:
                System.out.println("switch: x равен 5");
                break;
            case 7:
                System.out.println("switch: x равен 7");
                break;
            case 11:
                System.out.println("switch: x равен 11");
                break;
            default:
                System.out.println("switch: что-то другое");
        }

        System.out.println("Строка кода за пределами switch");

    }
}
