package lesson_26.methods;

import lists.MyArrayList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.10.2024
 */

public class MethodsApp {
    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5, 6};
        String[] strings = {"Hello", "World", "Java"};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};


        System.out.println(Util.printArray(integers));
        System.out.println(Util.printArray(strings));
        System.out.println(Util.printArray(doubles));

        Util.swap(strings, 0, 2);
        System.out.println(Util.printArray(strings));

        double sum = Util.sum(integers);
        System.out.println("sum = " + sum);
        System.out.println(Util.sum2(integers));

        double sumDouble = Util.sum(doubles);
        System.out.println("sumDouble = " + sumDouble);
        System.out.println(Util.sum2(doubles));

        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.addAll(1, 2, 3, 4, 5, 6, 7);

        double listSum = Util.listSum(myArrayList);
        System.out.println("listSum = " + listSum);

        MyArrayList<String> strings1 = new MyArrayList<>();
        strings1.addAll("Hello", "World", "Java");

        // Ошибка компиляции
        // double listSu2 = Util.listSum(strings1);


    }
}
