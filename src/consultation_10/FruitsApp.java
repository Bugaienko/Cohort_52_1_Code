package consultation_10;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class FruitsApp {
    public static void main(String[] args) {

        Orange orange;
        orange = new Orange("Or1");

        System.out.println(orange.toString());
        orange.ripen();





        Fruit fruit2 = new Fruit("Fruit2");
        System.out.println("fruit2.getClass(): " + fruit2.getClass());


        Fruit fruit;
         fruit = orange; // Неявное приведение ссылок
        System.out.println("fruit.getClass(): " + fruit.getClass());
        System.out.println();

        System.out.println(fruit.toString());
//        orange.extractJuice();
        fruit.ripen();

        orange = (Orange) fruit2;
        orange.extractJuice();

        System.out.println("\nПриведение ссылки ==========");
        // Проверка приведения типа ссылки к Orange
        if (fruit instanceof Orange) {
            orange = (Orange) fruit;
            orange.extractJuice();
        }





    }
}
