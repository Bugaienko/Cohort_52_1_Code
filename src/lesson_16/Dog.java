package lesson_16;

/**
 * @author Sergey Bugaenko
 * {@code @date} 01.10.2024
 */

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    String info() {
        return "I am dog " + name + ", my weight is " + weight;
    }

    void eat() {
        System.out.println("Я кушаю, ням-ням!");
        weight++;
    }

    void run() {
        /*
        1. Достаточен ли вес собаки для совершения пробежки
        2. Если вес слишком мал - собака должна поесть перед тренировкой
         */

        while (weight < 3) {
            System.out.println("Сорян! Я слишком худая и голодная! Бежать не могу!");
            System.out.println("Надо поесть. Мой вес сейчас: " + weight);

            eat();
        }

        System.out.println("Я бегу!");
        weight -= 2; // weight = weight - 2;
        System.out.println("Вес после пробежки: " + weight);
        System.out.println(" ================== \n");
    }






}
