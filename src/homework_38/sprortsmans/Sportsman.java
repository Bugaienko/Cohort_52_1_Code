package homework_38.sprortsmans;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.11.2024
 */

/*
Task 1
Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг).

Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name.

Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому критерию, например, по score.

В методе main создайте массив из нескольких объектов Sportsman.
Отсортируйте его с использованием:

- естественного порядка, определенного в Comparable,
- данного класса Comparator,
- анонимного класса Comparator для сортировки по третьему полю
(например, age).

Выведите каждый вариант отсортированного массива в консоль.
 */

public class Sportsman implements Comparable<Sportsman>{
    private String name;
    private double score;
    private int age;

    public Sportsman(String name, double score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Sportsman sportsman) {
        return this.getName().compareTo(sportsman.getName());
    }
}
