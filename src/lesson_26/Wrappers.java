package lesson_26;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.10.2024
 */

public class Wrappers {
    /*
    Классы-обертки используются в Java для представления примитивных типов данных как объектов
    Byte -> обертка для byte
    Short -> обертка для short
    Integer -> обертка для int
    Long -> обертка для long
    Float -> обертка для float
    Double -> обертка для double
    Character -> обертка для char
    Boolean -> обертка для boolean
     */

    public static void main(String[] args) {

        // Автоматическое приведение типов
        // Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Автораспаковка. Из типа Integer автоматически преобразовало в примитив int

        Boolean boolWrapper = true; // автоупаковка
        System.out.println("boolWrapper: " + boolWrapper);
        boolWrapper = null; // У ссылочного Boolean появляется третье значение - null


        System.out.println("\n======================= \n");

        // Сравнение объектов
        // Кеширование объектов -128...127

        Integer a = 127;
        Integer b = 127;
        // Так как это ссылочный тип данных оператором == сравниваются ссылки
        System.out.println("a == b -> " + (a == b)); // true.
        System.out.println("a.equals(b): " + a.equals(b)); // true

        Integer c = 128;
        Integer d = 128;
        System.out.println("c == d -> " + (c == d)); // false
        System.out.println("c.equals(d): " + c.equals(d)); // true

        String j1 = "Java";
        String j2 = "Java";
        System.out.println("j1 == j2 -> " + (j1 == j2)); //true
        String j3 = new String("Java");

        System.out.println("j2 == j3 -> " + (j2 == j3)); // false
        System.out.println("j3.equals(j2): " + j3.equals(j2)); // true

        System.out.println("\n ========================= \n");
        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        System.out.println("min: " + Integer.MIN_VALUE);

        // Схожие методы для всех оберточных типов
        // 1. valueOf() - преобразует явным образом примитив или строку в объект типа обертки

        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("e == f -> " + (e == f));

        // Возвращает ссылочные типы данных (Integer, Double, Long)
        Integer intStr = Integer.valueOf("123"); // передаем строку

        System.out.println(intStr + 100); // 223

        Double doubleWrap = Double.valueOf(154.5);
        System.out.println(doubleWrap);

        // 2. parseXXX() - преобразует строку в соответсвующий примитив (int, double, long)
        // "456"
        System.out.println(Integer.parseInt("456") + 100);
        double d1 = Double.parseDouble("345.67") + 200;
        System.out.println(d1);

        // 3. toString - возвращает строковое представление числа
        System.out.println(doubleWrap);

        // 4. equals(Object obj) - сравнение объектов на равенство по значению
        Long l1 = Long.valueOf(200);
        // Вариант 2
        l1 = 200L;
        System.out.println("l1.equals(200): " + l1.equals(200));
        // Мы хотим сравнить объект типа Long с примитивом int
        // Метод equals принимает объект типа Object. Поэтому примитив должен быть приведен к ссылочному типу
        // для примитива int его обертка (ссылочный тип) это Integer -> int автоупаковывается (приводится) к типу Integer
        // Логика сравнения метода equals



        System.out.println("l1.equals(200): " + l1.equals(200L));
        Integer i1 = 150;
        System.out.println("i1.equals(150): " + i1.equals(150));

        // 5. compareTo() - сравнивает текущий объект с другим объектом того же типа (кто больше?)
        // 1 - если наш объект больше чем тот объект, с которым сравниваем
        // -1 - если наш объект меньше
        // 0 - если объекты равны по значению

        Integer iMax = 250;
        Integer iMin = 125;
        Integer iSuper = 500;
        System.out.println(iMax +  ".compareTo(" + iMin + ") -> " + iMax.compareTo(iMin)); // 1
        System.out.println(iMax + " .compareTo( " + iSuper + ") -> " + iMax.compareTo(iSuper)); // -1
        System.out.println(iMax +  ".compareTo(" + 250 + ") -> " + iMax.compareTo(250)); // 0

        // xxxValue() - возвращает значение объекта в виде примитивного типа
        // doubleValue

        Double d2 = Double.valueOf(125.56); // Явная / принудительная упаковка. Примитив -> Обертку
        double dPrimitive = d2.doubleValue(); // Явная / принудительная распаковка. Обертка -> примитив

        System.out.println("\n ========================= \n");

        /*
        Все числовые обертки наследуются от абстрактного класса Number.

        Byte
        Short
        Integer
        Long
        Float
        Double
         */

        /*
        Методы возвращают соответсвующий примитив
        byteValue()
        shortValue()
        intValue()
        longValue()
        floatValue()
        doubleValue()
         */

        Integer integer = 31844;
        Double doubleVal = 235.76;

        System.out.println(integer.doubleValue());

        short shortPrimitive = integer.shortValue();

        int intPrimitive = doubleVal.intValue();
        System.out.println("intPrimitive: " + intPrimitive);



    }


}















