package lesson_16;

/**
 * @author Sergey Bugaenko
 * {@code @date} 01.10.2024
 */

public class TestArray {
    public static void main(String[] args) {

        MagicArray magicArray = new MagicArray();

        System.out.println(magicArray.toString());

        magicArray.add(100);
        magicArray.add(200);
        magicArray.add(300);

        System.out.println("Сейчас в массиве элементов: "  + magicArray.size());

        magicArray.add(500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500);

        System.out.println(magicArray.toString());


    }
}
