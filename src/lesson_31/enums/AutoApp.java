package lesson_31.enums;


/**
 * @author Sergey Bugaenko
 * {@code @date} 24.10.2024
 */

public class AutoApp {
    public static void main(String[] args) {

        Color color = Color.RED;
        System.out.println(color);

        Auto auto = new Auto("Model1", Color.BLUE);
        System.out.println(auto);

        auto.setColor(color);
        System.out.println(auto);

        System.out.println("\n============= \n");
        // Возвращает массив всех значений
        Color[] colors = Color.values(); // Возвращает массив всех значений

        for (Color currentColor : colors) {
            System.out.println(currentColor);
        }

        // Возвращает enum по строковому имени
        Color color1 = Color.valueOf("RED");
        System.out.println(color1);

        // Получить имя константы
        String name = Color.RED.name();
        System.out.println(name + "!");

        // Получить порядковый номер (начиная с 0)
        int ordinal = Color.GREEN.ordinal();
        System.out.println("ordinal: " + ordinal);

        System.out.println(auto);
        // Enum безопасно сравнивать на равенство оператором ==
        if (auto.getColor() == Color.GREEN) {
            System.out.println("Цвет авто зеленый");
        } else {
            System.out.println("Не зеленый");
        }

        System.out.println("\n ========= switch ==========");
        // Очень часто используется в switch
        switch (color) {
            case RED:
                System.out.println("Красный");
                break;
            case GREEN:
                System.out.println("Зеленый");
                break;
            default:
                System.out.println("Какой-то другой");
        }


    }
}
