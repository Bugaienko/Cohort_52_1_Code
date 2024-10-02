package lesson_17;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.10.2024
 */

public class Cat17 {
    private String name;
    private int age;
    private int weight;

    public Cat17(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Геттеры и сеттеры
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getWeight(){
        return weight;
    }

    public void setAge(int age) {
        if (age < 0 || age > 20) {
            // прекращение работы метода, если входящий возраст нас "не устраивает"
            return;
        }
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    private Cat17() {
    }



    private void testMethod() {
        System.out.println("Test");
    }

    public void sayMeow() {
        System.out.println("Meow! " + name);
        testMethod();
    }

    public String toString() {
        return "Cat " + name + ", age: " + age + ", weight: " + weight;
    }
}
