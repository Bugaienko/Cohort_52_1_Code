package lesson_26.boxes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.10.2024
 */

public class BoxesApp {

    public static void main(String[] args) {

        String variable = "Hello";
        System.out.printf("Шаблон строки %s\n", variable);

        SuperBoxGen<String> box = new SuperBoxGen<>("Hello");

        SuperBoxGen<Double> doubleBox = new SuperBoxGen<>(3.14);

        // Если мы не укажет тип при создании объекта, будет подставлен Object
        SuperBoxGen boxObject = new SuperBoxGen<>("String");
        boxObject.setValue(1);

        // Object
       // System.out.println(boxObject.getValue() + 5.0);

        System.out.println((doubleBox.getValue() + 5.0));

        SuperBoxGen<Integer> integerSuperBoxGen = new SuperBoxGen<>(100);

        System.out.println(integerSuperBoxGen.getValue() + 25);


                // int примитив -> class Integer ссылочный тип данных

    }
}
