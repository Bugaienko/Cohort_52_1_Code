package homework_16;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.10.2024
 */

public class MagicApp {
    public static void main(String[] args) {

        int[] test = {0, 1, 2, 3, 4, 5, 6, 7};

        MagicArray2 magicArray = new MagicArray2();

//        magicArray.cursor = 1_000_000;
//        magicArray.array = new int[100000];
//        magicArray.array = new int[]{1,2,3,4};


        magicArray.add(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(magicArray.toString());

        int index = magicArray.indexOf(100);
        System.out.println("Индекс элемента: " + index);

        magicArray.remove(3);
        magicArray.add(1555);
        System.out.println(magicArray.toString());

        System.out.println("\n======= Remove By Value ========= \n");

        boolean isDeleted = magicArray.removeByValue(7);
        System.out.println("isDeleted: " + isDeleted);
        System.out.println(magicArray.toString());

        isDeleted = magicArray.removeByValue(10000000);
        System.out.println("isDeleted: " + isDeleted);
        System.out.println(magicArray.toString());


    }
}
