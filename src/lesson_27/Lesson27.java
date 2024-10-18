package lesson_27;

import lists.MyArrayList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.10.2024
 */

public class Lesson27 {
    public static void main(String[] args) {

        MyArrayList<Integer> integers = new MyArrayList<>();

        integers.addAll(1, 5, 7, 98, 100, 500);
        System.out.println(integers);

        integers.add(1000);
        System.out.println(integers);

        System.out.println("size: " + integers.size());

        System.out.println("isEmpty: " + integers.isEmpty());

        int idx = integers.indexOf(100);
        System.out.println("integers.indexOf(100): " + idx);

        integers.set(idx, -200);
        System.out.println(integers);



    }
}
