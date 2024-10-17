package lesson_26.methods;

import lesson_23.abstracts_class.Cat;
import lists.MyArrayList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.10.2024
 */

public class Util {


    // Метод, возвращающий строковое представление любого массива
    public static <T> String printArray(T[] array) {
        if (array == null || array.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append((i < array.length - 1) ? ", " : "]");
        }

        return sb.toString();
    }

    // Поменять местами два элемента в любом массиве по их индексам
    public static <T> void swap(T[] array, int idx1, int idx2) {
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    // Ограничение сверху Upper Bounds
    // <T extends Number> - тип Т должен быть либо классом Number либо его наследником

    // Написать метод, который считает сумму элементов в массиве
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.doubleValue();
        }
        return sum;
    }

    public static <T extends Number> int sum2(T[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.intValue();
        }
        return sum;
    }

    // <? extends Number> - мы работаем с неизвестным типом, который является наследником Number
    // Метод принимает MyArrayList только с элементами типа Number или его наследниками
    public static double listSum(MyArrayList<? extends Number> listNumber) {
        double sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i).doubleValue();
        }
        return sum;
    }



}
