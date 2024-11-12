package lesson_44;

import lesson_43.Cat;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.11.2024
 */

public class StreamExample {

    public static void main(String[] args) {


        /*
        Stream api - мощный инструмент, позволяющий обрабатывать наборы данных в декларативном стиле.

        Stream - поток данных, который представляет собой последовательность элементов.
        Поток дает возможность поочередного получения элемента данных для обработки.
        Стрим может быть создан из различных источников (массивы, коллекции и так далее)

        Pipeline - последовательность операций, выполняемых на потоке

        Промежуточные операции (методы) - Это операции, которые преобразуют поток в другой поток (возвращают поток)
        Их может много (больше чем одна)

        Терминальные операции (методы) - Это операции, которые запускают обработку потока и закрывают его.
        После выполнения терминальной операции поток перестает быть доступным для дальнейшей обработки.
        Может быть ТОЛЬКО ОДИН терминальный метод

        Ленивые вычисления
        Стримы не выполняют промежуточные операции, пока на потоке не будет вызван терминальный метод.

        Как создать поток:
        stream() - создание потока из элементов коллекции

         */

        /*
        Промежуточные методы:
        Stream<T> filter(Predicate<T> predicate) - оставляет в потоке только те элементы, для которых предикат вернет true
        Т.е. оставляет элементы, удовлетворяющие условию (отбрасывает элементы НЕ удовлетворяющие условию)
        ___
        sorted() - сортирует поток в естественном порядке
        sorted(Comparator<T> comparator) - сортирует элементы с использованием компаратора.
        ___

        Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции,
        в том числе в другой тип данных

        distinct() - удаляет дубликаты из потока. Сравниваем (определяет равенство) методом equals()

        void peek(Consumer<T> action) - выполняет действие для каждого элемента потока

        limit(long maxSize) - ограничивает кол-во элементов потока заданным значением. В потоке может быть не больше maxSize
        skip(long n) - пропускает первые n элементов потока

        mapToObj(IntFunction() mapper) - преобразование примитивного типа данных в ссылочный тип при помощи заданной функции

        mapToInt - преобразует поток Stream<Integer> в IntStream (поток примитивов)

        boxed() - используется для преобразования потока примитивов (IntStream, DoubleStream)
        в поток их соответсвующий оберток (Stream<Integer>, Stream<Double)

         */

        /*
        Терминальные методы
        R collect(Collector<T, A, R> collector) - преобразует элементы потока в разные типы коллекции или другие структуры данных

        void forEach(Consumer<T? action) - выполняет заданное действия для каждого элемента потока

        Optional<T> min(Comparator<T> comparator) - элемент с минимальным значением в соответствии с компаратором
        Optional<T> max(Comparator<T> comparator) - элемент с максимальным значением в соответствии с компаратором

         */

        // task1();
        // task2();
//        task3();

//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//            task9();
//        task10();
//        task11();
//        task12();

        task13();


    }

    private static void task13() {
        // Преобразовать массив примитивов в коллекцию
        int[] ints = new int[]{1, 2, 3, 4, 5, 6};

        List<Integer> integers = Arrays.stream(ints)
//                .boxed()
                // автоупаковка
                .mapToObj(i -> i)
//                .mapToObj(i -> Integer.valueOf(i))
                .collect(Collectors.toList());
        System.out.println(integers);

        int[] intArray = integers.stream()
                .mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(intArray));

    }

    private static void task12() {
        // Получить список из трех самых маленьких чисел из списка
        List<Integer> integers = List.of(0, 5, 1, 4, 7, 55, 78);
        // integers = List.of(10, 5);

        // 0, 1, 4, 5, 7, 55, 78
        List<Integer> smallest = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("smallest: " + smallest);

        // Получить список чисел, отбросив 2 самых маленьких
        List<Integer> array = integers.stream()
                .sorted()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("array: " + array);

        Integer[] arrayIntegers = integers.stream()
                .toArray(Integer[]::new);

    }

    private static void task11() {
        List<Cat> cats = getListCats();
        // Верните самое длинное имя кота из списка котов
        /*
        Стрим Cat -> Стрим имен
        Найти самое длинное имя
        Сравнить имена по их длине. (max + Comparator сортирующий имена по длине в порядке возрастания)
         */

        Optional<String> longestName = cats.stream()
                .filter(Objects::nonNull) // проверка null объектов Cat
                .map(Cat::getName)
                .filter(Objects::nonNull) // проверка имен Null
                .max(Comparator.comparing(String::length));
//                .max((n1, n2) -> Integer.compare(n1.length(), n2.length()));
//                .max((name1, name2) -> name1.length() - name2.length());

        if (longestName.isPresent()) {
            System.out.println(longestName.get());
        } else {
            System.out.println("Котов с именами не найден");
        }

        String longestNullString = cats.stream()
                .map(Cat::getName)
                .max(Comparator.comparing(String::length))
                .orElse(null);

        System.out.println("longestNullString: " + longestNullString);
    }

    private static void task10() {
        // min, max, Optional
        // Optional<T> - класс обертка, который может содержать или объект типа T или null
        // Optional<User>

        List<Integer> integers = List.of(5, 4, 14, 59, 32, 24, -1, -6);

        // Я хочу найти максимальное отрицательное число
        Optional<Integer> max = integers.stream()
                .filter(i -> i < 0)
                .peek(System.out::println)
                .max(Comparator.naturalOrder());

        // Проверка наличия значения в Optional
        System.out.println("max.isPresent(): " + max.isPresent()); // вернет true, если значение присутствует (там не null)
        System.out.println("max.isEmpty(): " + max.isEmpty()); // вернет true, если значение отсутствует (там внутри null) // Java 11

        if (max.isPresent()) {
            Integer value = max.get(); // возвращает значение, если оно присутствует. Если внутри null - будет исключение NoSuchElement (ошибка).
            System.out.println("value: " + value);
        } else {
            System.out.println("Завернут null");
        }

        // Возвращает значение, если оно присутствует. Если внутри null - вернет defaultValue
        Integer optValue = max.orElse(-1000);
        System.out.println("optValue: " + optValue);

        // Создание объектов
        Optional.empty(); // возвращает пустой Optional. (завернут null)
        Optional.of(new Object()); // возвращает Optional с не-null значением. Если попытаемся завернуть null 0 будет NPE.
        Optional.ofNullable(null); // возвращает Optional. Можно завернуть или значение, или null (вернет пустой Optional)


    }

    private static Optional<Cat> findCat(String name) {
        List<Cat> cats = getListCats();

        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                return Optional.of(cat);
            }
        }

        return Optional.empty();
    }

    // Использование Optional типом возвращаемого значения
    private static Optional<Cat> findCat2(String name) {
        List<Cat> cats = getListCats();

        Cat result = null;
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                result = cat;
            }
        }
        return Optional.ofNullable(result);
    }

    private static Cat findCat4(String name) {
        List<Cat> cats = getListCats();

        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                return cat;
            }
        }

        return null;
    }

    private static void task9() {
        // Создание стрима map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 5);
        map.put("Cherry", 0);

        // Создание стрима из элементов entrySet
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    private static void task8() {
        // Мультикурсор Alt + Shift + click | Mac Opt + Shift + click
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "gray");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = new Cat[]{cat, cat1, null, cat2, cat3, new Cat(null, 10, "red")};

        // Получить список кошек, вес которых больше 4


        // получить поток из элементов массива
        List<Cat> bigCats = Arrays.stream(cats)
//                .filter(c -> c != null) // оставить только не null
//                .filter(c -> Objects.nonNull(c)) // оставить только ne null
                .filter(Objects::nonNull)
                .filter(c -> Objects.nonNull(c.getName())) // проверка какого-то поля на null (для примера)
                .filter(c -> c.getWeight() > 4)
                .collect(Collectors.toList());

        System.out.println(bigCats);

    }

    private static void task7() {
        // Изменить имя котиков, вес которых меньше 5
        // Вывести в консоль все элементы потока

        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() < 5) // фильтруем котиков
                .peek(cat -> cat.setName("Slim_" + cat.getName())) // промежуточный метод, выполняет действие для каждого элемента
                .peek(System.out::println);


        catStream.forEach(cat -> System.out.println(cat)); // терминальный метод, выполняет действие для каждого элемента
//        catStream.forEach(System.out::println);
        System.out.println("cats: " + cats);

    }

    private static void task6() {
        // Получить список имен кошек, у которых имена короче 5 символов
        List<Cat> cats = getListCats();

        List<String> catNames = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(cat -> cat.getName())
                .collect(Collectors.toList());
        System.out.println(catNames);

        /*
        Эффективность: имена извлекаются у всех объектов Car, даже у тех,
        которые позже будут отфильтрованы.
         */

        System.out.println("\n =================== \n");

        List<String> catNames2 = cats.stream()
                // .map(cat -> cat.getName()) // тоже самое
                .map(Cat::getName)
                .filter(name -> name.length() < 6)
                .collect(Collectors.toList());
        System.out.println(catNames2);

        /*
        Читаемость, понимание кода
         */


    }


    private static void task5() {
        // Получить список имен кошек, чей вес больше 4
        // Создать поток
        // Оставить кошек, чей вес большее 4
        // изменить тип потока Cat -> name (String)
        // собрать в список

        List<Cat> cats = getListCats();

        List<String> catNames = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
//                .map(cat -> cat.getName())
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);

    }

    private static void task4() {
        List<Cat> cats = getListCats();

        // Получить список имен всех кошек

        // получаем поток элементов другого типа
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);
        // Изначальная коллекция не изменяется
        //  System.out.println(cats);


    }

    private static void task3() {
        List<Cat> cats = getListCats();

        // фильтрация список. Оставить котов с именем длиннее 4 символов
        Stream<Cat> stream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        // Пока не запущен терминальный метод - промежуточные метода не выполняются
        List<Cat> longNameCats = stream.collect(Collectors.toList());

        System.out.println("longNameCats: " + longNameCats);
    }

    private static void task2() {
        List<Cat> cats = getListCats();

        // список кошек с весом больше 4 кг
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // Терминальный метод
        List<Cat> fatCats = catStream.collect(Collectors.toList());

        // Повторно использовать "закрытый" поток нельзя. (Закрытый - на котором уже был вызван терминальный метод)
        // fatCats = catStream.filter(c -> c.getWeight() > 5).collect(Collectors.toList()); - будет исключение (ошибка)


        System.out.println(fatCats);


    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")

        );
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0);
        // Список, содержащий положительные числа
        // Список должен быть отсортирован в порядке возрастания

        List<Integer> result = new ArrayList<>();
        for (Integer i : integers) {
            if (i > 0) result.add(i);
        }
        result.sort(Comparator.naturalOrder());
        System.out.println(result);

        // У всех коллекций есть метод stream() создающий поток из элементов коллекции
        List<Integer> integerList = integers.stream() // создание потока на основе элементов списка
                .filter(i -> i > 0) // фильтрация элементов потока
                .sorted() // сортировка элементов в естественном порядке
                .collect(Collectors.toList()); // собирает элементы потока в коллекцию List

        System.out.println("integerList: " + integerList);

        //Pipeline
        // integers.stream().filter(i -> i > 0).sorted().collect(Collectors.toList());


    }

}
