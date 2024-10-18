package consultation_11;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.10.2024
 */

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    private void sayHello() {
        System.out.println("Hello. I am " + name);
    }

    private void test(String str) {
        System.out.println(name + ", " + str);
    }
}
