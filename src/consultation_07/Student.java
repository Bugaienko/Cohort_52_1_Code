package consultation_07;

/**
 * @author Sergey Bugaenko
 * {@code @date} 01.10.2024
 */

public class Student {
    String name;
    int age;
    String group;
    String major;
    String hobby;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }


    void learn() {
        System.out.println("I am learning");
    }

    void dancing() {
        System.out.println("I am dancing");
    }



}
