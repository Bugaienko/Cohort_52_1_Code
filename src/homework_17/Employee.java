package homework_17;


/**
 * @author Sergey Bugaenko
 * {@code @date} 07.10.2024
 */

/*
Task 0
Написать класс Employee (Работник)

У него должны быть поля имя, возраст, зарплата

Инкапсулировать класс.

Написать метод info() выводящий информацию о работнике.


 */
public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

   // Генерация конструкторов, геттеров / сеттеров и прочего Alt + Ins | Cmd + N

    public String toString() {
        return String.format("Employee %s, age: %d, salary: %.2f", name, age, salary);
    }

    public void info() {
        System.out.println(this.toString());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) return;
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
