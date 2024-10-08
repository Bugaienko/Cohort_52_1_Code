package lesson_18;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.10.2024
 */

public class Car {
    public static int totalCarProduced;

    private String model;
    private  int powerPS;

    public Car(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        totalCarProduced++; // Увеличиваем общее количество автомобилей при создании нового объекта (автомобиля)
    }

    public String toString() {
        // Нельзя создать статическую переменную внутри какого-то метода
     //   static String result = "Hello";
        return String.format("Auto - model: %s, power: %d. " +
                "Всего выпушено машин: %d", model, powerPS, totalCarProduced);
    }

    public static void testStatic() {
        // В статике нельзя использовать this - обращение к текущему объекту
        // this.model
        System.out.println("Hello from static method");
    }

    public int getPowerPS() {
        return powerPS;
    }

    public void setPowerPS(int powerPS) {
        this.powerPS = powerPS;
    }

    // final в параметрах метода
    public void test(final int number) {
        // Нельзя изменить значение, т.к. в параметрах метода переменная помечена как final
        //number++;
        int x = number + 10;
        x++;
    }

    public void test(final int[] numbers) {
        // нельзя присвоить новую ссылку
        // numbers = new int[100];

        // Можем использовать эту ссылку
        int[] newNumbers = numbers;

        // Можем изменять состояние объекта
        numbers[0] = 10000;

    }



}
