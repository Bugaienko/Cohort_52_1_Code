package lesson_42;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.11.2024
 */

public class Person {

    private final static AtomicInteger counter = new AtomicInteger(0);

    private final int id;
    private String name;
    private int age;
    private String position;

    public Person(String name, int age, String position) {
        this.id = counter.incrementAndGet();
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
