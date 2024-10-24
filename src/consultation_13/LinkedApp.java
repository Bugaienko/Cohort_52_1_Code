package consultation_13;

import lists.MyLinkedList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.10.2024
 */

public class LinkedApp {
    public static void main(String[] args) {


        MyLinkedList<Integer> integers = new MyLinkedList<>();
        System.out.println(integers);


        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);
        integers.add(60);
        integers.add(70);
        System.out.println(integers);

        System.out.println("size: " + integers.size());

        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
            System.out.println("==============");
        }

        integers.set(2, 100);
        System.out.println(integers);

    }
}
