package lesson_17.objetsArray;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.10.2024
 */

public class Person {
    private String name;
    private int age;
    private String hobby;

    public Person(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String toString() {
        // Формирование строки по шаблону с подставляемыми значениями
        return String.format("Person %s, Age: %d, Hobby: %s", name, age, hobby);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }




}
