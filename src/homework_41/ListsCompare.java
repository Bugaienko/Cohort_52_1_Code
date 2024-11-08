package homework_41;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
Создайте два списка.
Один на реализации ArrayList, второй на LinkedList.
Заполните их 1000 одинаковыми случайными значениями от 0 до 10_000.

Создайте 3 метода, принимающий список.

В первом методе - получение всех значений элементов списка по его индексу -
Второй метод - вставка 1000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1000 элементов по случайному индексу. (диапазон от 0 до размера коллекции)
Все три метода должны возвращать время, затраченное на выполнение метода в миллисекундах. Сравните для каждого из списка время выполнения каждого метода. И сравните время последовательного выполнения всех трех методов.
 */
public class ListsCompare {

    private static final int CAPACITY = 50_000;
    private static final int BOUND = 1000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(CAPACITY);
        List<Integer> linkedList = new LinkedList<>();

        Random random = new Random();
        for (int i = 0; i < CAPACITY; i++) { // заполнение списков одинаковыми значениями
            int value = random.nextInt(BOUND);
            arrayList.add(value);
            linkedList.add(value);
        }


        long start = System.currentTimeMillis();

        System.out.println("get array: " + getElements(arrayList));
        System.out.println("insert array: " + insertElements(arrayList));
        System.out.println("deleteByIndex array: " + deleteElementsByIndex(arrayList));
        System.out.println("deleteByValue array: " + deleteElementsByValue(arrayList));

        long end = System.currentTimeMillis();

        System.out.println("\nОбщее время для ArrayList: " + (end - start));

        System.out.println("\n ========================================= \n");
        start = System.currentTimeMillis();

        System.out.println("get linked: " + getElements(linkedList));
        System.out.println("insert linked: " + insertElements(linkedList));
        System.out.println("deleteByIndex linked: " + deleteElementsByIndex(linkedList));
        System.out.println("deleteByValue linked: " + deleteElementsByValue(linkedList));
        end = System.currentTimeMillis();

        System.out.println("\nОбщее время для ArrayList: " + (end - start));

    }

    public static long getElements(List<Integer> integers) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < integers.size(); i++) {
            int value = integers.get(i);
        }
        long end = System.currentTimeMillis();
        return (end - start);
    }

    public static long insertElements(List<Integer> integers) {
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY; i++) {
            integers.add(random.nextInt(integers.size()), random.nextInt(1000));
        }
        long end = System.currentTimeMillis();
        return (end - start);
    }

    public static long deleteElementsByIndex(List<Integer> integers) {
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY; i++) {
            integers.remove(random.nextInt(integers.size()));
        }
        long end = System.currentTimeMillis();
        return (end - start);
    }

    public static long deleteElementsByValue(List<Integer> integers) {
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY; i++) {
            integers.remove(Integer.valueOf(random.nextInt(BOUND)));
        }
        long end = System.currentTimeMillis();
        return (end - start);
    }
}
