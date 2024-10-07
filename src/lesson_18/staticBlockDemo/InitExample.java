package lesson_18.staticBlockDemo;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.10.2024
 */

public class InitExample {

    static String[] colors;
    static int counter = 1;


    private String title = "Hello";
    private int capacity = 10;

    // Статический блок инициализации.
    // Вызывается этот блок только один раз, в момент загрузки класса в JVM
    // Инициализации статических полей - присвоение начальных значений

    static {
        System.out.println("Static init block run!");
        colors = new String[3];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "blue";
        counter = 10;
    }

    static {
        System.out.println("Second static init block run!");
        counter = 100;
    }

    // НЕ статический блок инициализации.
    // Выполняется ДО конструктора!
    {
        System.out.println("NON-static init block run!");
        this.title = "Non-Static title!";
    }


    public InitExample() {
        System.out.println("Constructor run!");
        this.title = "Constructor";
    }

    // Я могу менять состояние статических членов класса
    public static void changeColors(String color1, String color2) {
        colors[0] = color1;
        colors[1] = color2;
    }

    public String toString() {
        return "title: " + title + ", capacity: " + capacity
                + ", static-counter: " + counter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
