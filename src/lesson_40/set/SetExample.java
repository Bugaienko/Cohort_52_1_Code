package lesson_40.set;

import java.util.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.11.2024
 */

public class SetExample {
    /*
    Контракт между equals() и hashCode()
    Для корректной работы хэш- коллекций есть важное правило, состоящее из 3 условий:
    1. Если два объекты равны по методу equals, то их хеш-коды тоже должны быть равны.
    2. Если хеш-коды двух объектов различны, то объекты точно не равны по equals.
    Обратное не всегда верно. Разные объекты могут иметь одинаковый хеш-код (коллизия)
    3. Вызов методы hasCode должен возвращать одинаковое значение при многократном вызове на неизмененном объекта

     */

    public static void main(String[] args) {

        // Конструкторы
        Set<Integer> set = new HashSet<>(); // Создает пустой хеш-сет емкостью 16 и коэффициент загрузки 0,75
        set = new HashSet<>(20); // Создает пустой хеш-сет с указанной емкостью и коэффициент загрузки 0,75
        // Создает новый сет, содержащий уникальные элементы из указанной коллекции
        set = new HashSet<>(List.of(1, 2, 3, 5, 6, 6, 6, 6, 6, 5, 3));

        System.out.println(set);

        List<Integer> startValues = new ArrayList<>(List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32));
        System.out.println(startValues);

        // HashSet не поддерживает порядко добавления элементов
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers hashSet: " + integers);

        // LinkedHashSet сохраняет порядок добавления элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSet: " + linkedSet);

        // Метода интерфейса Set

        // boolean add(E e) - добавление элемента
        System.out.println("integers.add(100): " + integers.add(100)); // true - элемент добавлен, т.к. еще не было такого значения
        // false - элемент НЕ добавлен, т.к. такое значения уже есть в сете (дубликат)
        System.out.println("integers.add(100) #2 : " + integers.add(100)); // false
        System.out.println("integers: " + integers);

        // boolean remove(Object obj) - удаляет элемент по значению
        System.out.println("integers.remove(100): " + integers.remove(100)); // true
        System.out.println(integers);
        System.out.println("integers.remove(100) #2: " + integers.remove(100)); // false

        System.out.println("\n ================== \n");
        // boolean contains(Object obj) - проверяет присутствие значения в множестве
        System.out.println("integers.contains(100): " + integers.contains(100));
        System.out.println("integers.contains(32): " + integers.contains(32));

        /*
        int size() - кол-во элементов
        boolean isEmpty() - true, если множество пустой
        clear() - удаляет все элементы
         */

        // iterator() - возвращает итератор для элементов set-a
        // Наличие итератора, позволяет перебрать все элементы циклом for-each
        for (Integer value: integers) {
            System.out.print(value + ", ");
        }
        System.out.println();

        // Написать метод, который принимает список (List) и возвращает список (List), состоящий только из уникальных элементов начального списка
        // Убрать дубликаты
        System.out.println("startValues: " +  startValues);
        List<Integer> resultList = getUniqueList(startValues);
        System.out.println("resultList: " + resultList);

        System.out.println("\n =================== \n");


        // SortedSet. Конструкторы
        // Конструктор  по умолчанию (естественный порядок сортировки, если реализован Comparable)
        SortedSet<Integer>  sortedSet = new TreeSet<>(); // пустое, упорядоченное множество (сортировка в естественном порядке)
        sortedSet.addAll(startValues);
        System.out.println("sortedSet: " + sortedSet);

        // Конструктор, принимающий коллекцию. Естественный порядок
        sortedSet = new TreeSet<>(startValues); // Будут добавлены все элементы из коллекции.
        System.out.println("sortedSet: " + sortedSet);

        // Конструктор с компаратором, определяющим порядок хранения элементов
        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()); // Обратный естественному порядок сортировки
        treeSet.addAll(startValues);
        System.out.println("treeSet: " + treeSet);

        treeSet = new TreeSet<>((i1, i2) -> i2 - i1);
        treeSet = new TreeSet<>((i1, i2) -> i2.compareTo(i1));

        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println("treeSet: " + treeSet);

        // first() - возвращает самый первый (самый левый) (наименьший по мнению Comparator-а) элемент
        System.out.println("treeSet.first(): " + treeSet.first());

        // last() - возвращает последний (самый правый) (наибольший по мнению Comparator-a)
        System.out.println("treeSet.last(): " + treeSet.last());

        SortedSet<Integer> integerSortedSet = new TreeSet<>(startValues);
        System.out.println("integerSortedSet: " + integerSortedSet);

        // SortedSet<E> headSet(E element) - возвращает часть множества, элементы которого строго меньше чем element
        SortedSet<Integer> headSet = integerSortedSet.headSet(8);
        System.out.println("integerSortedSet.headSet(8): " + headSet);
        System.out.println("integerSortedSet: " + integerSortedSet);

        //SortedSet<E> tailSet(E element) - вернет новое множество, состоящее из элементов старого, которые больше или равны element
        SortedSet<Integer> tailSet = integerSortedSet.tailSet(8);
        System.out.println("integerSortedSet.tailSet(8): " + tailSet);

        //  subSet(E fromElement, E toElement) - вернет новое множество, состоящее из элементов старого, которые находятся в диапазоне
        // от fromElement (включительно) до toElement (не включительно)
        System.out.println("integerSortedSet.subSet(3, 16): " + integerSortedSet.subSet(3, 16));

        // comparator() - Возвращает компаратор, используемый для упорядочивание элементов в этом множестве
        // вернется null если используется естественный порядок
        System.out.println(integerSortedSet.comparator());

        Comparator<Integer> comparator = (Comparator<Integer>) treeSet.comparator();


        test();





    } //Main





    public static <T> List<T> getUniqueList(List<T> list) {
       // получить set, состоящий из уникальных элементов списка
        Set<T> set = new LinkedHashSet<>(list);
        // вернуть новый список, содержащий все элемента set-a
        return new ArrayList<>(set);
    }

    public static void test() {
        String testStr = "Тестовая строка, со словами!";
        // Заменяем все не буквы на пустоту
        String newString = testStr.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        System.out.println(newString);

        // Преобразование строки в массив слов
        String[] words = newString.split(" ");
        System.out.println(Arrays.toString(words));

        // Arrays.asList(T[] array) -> преобразует массив в коллекцию
        List<String> list = Arrays.asList(words);
        System.out.println(list);

    }
}
