package lesson_24.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Journal implements Printable {

    String name;
    int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.printf("Journal %s #%d\n", name, number);
    }

    @Override
    public void test() {
        System.out.println("Test journal");
    }
}
