package lesson_05;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.09.2024
 */

public class StringExample {
    public static void main(String[] args) {

        String string = "Java"; // Объявление и инициализация переменной типа String.

        String string1 = new String("Hello");; // Тоже создание новой строки (не рекомендуемый)

        System.out.println(string);

        // 1. Получить количество символов в строке (длина строки)
        int length = string.length();
        System.out.println("length: " + length);

        // Метод позволяет перевести все символы строки в верхний регистр
        System.out.println(string.toUpperCase());
        System.out.println("string: " + string);

        // String иммутабельна (неизменна).
        // Если я хочу сохранить результат работы метода - я должен сохранить его в какую-то переменную
        String stringUpper = string.toUpperCase();

        System.out.println("stringUpper: " + stringUpper);
        System.out.println("string: " + string );

        // toLowerCase() - переводит все символы строки в нижний регистр
        // Результат работы метода мы можем сохранить и в ту же самую переменную. Переписав ее значение
        stringUpper = stringUpper.toLowerCase();
        System.out.println("stringUpper: " + stringUpper);

        System.out.println(" =========================== \n");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // Различные варианты конкатенации (склеивания / объединения) строк

        // Конкатенация
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);

        // Конкатенация vs мат. операция сложения
        System.out.println(1 + 3);

        // "4"
        //            1 + 3 = сложение -> 4 + " : " = конкатенация -> "4 : " + 2 = конкатенация -> "4 : 23"

        // 4 + " : "
        System.out.println(1 + 3 + " : " + 2 + 3);
        System.out.println(1 + 3 + " : " + (2 + 3));

        // Конкатенация 2
        String concatStr2 = str1.concat(str2); // str1 + str2
        concatStr2 = concatStr2.concat(str3); // str1 + str2 + str3
        System.out.println("concatStr2: " + concatStr2);

        // цепочка методов
        String concatStr3 = str1.concat(str2).concat(str3).concat("!!!"); // (str1 + str2) + str3 + "!"
        System.out.println("concatStr3: " + concatStr3);

        // Конкатенация 3
        // "One", "hello", "java" -> "One hello java"
        String concatStr4 = str1 + " " + str3 + " " + "java";
        System.out.println("concatStr4: " + concatStr4);

        concatStr4 = String.join(" ", str1, str3, "java");
        System.out.println("concatStr4: " + concatStr4);

        // Приведение типов. Когда есть строка - знак плюс - это знак конкатенации. Все типы данных преобразуются в строки
        int id = 1;
        int id2 = 2;
        String string2 = "Hello" + id + id2;
        System.out.println("string2: " + string2); // "Hello12"
        // Меняет порядок операция
        string2 = "Hello" + (id + id2);
        System.out.println("string2: " + string2); // Hello3

        System.out.println("My age is: " + id2);

        System.out.println(" ===================== \n");

        String digits = "0123456789";
        System.out.println("digits.length(): " + digits.length());
        // Взять символ из строки по его индексу (номеру).
        char firstChar = digits.charAt(0); // взять символ под номером 0 из строки digits
        // Независимо от фактической длинный строки, индекс последнего символа ВСЕГДА будет равен (длинна - 1)
        char lastChar = digits.charAt(digits.length() - 1);

        System.out.println("firstChar: " + firstChar);
        System.out.println(digits.charAt(4));
        System.out.println("lastChar: " + lastChar );

        System.out.println("========================\n");


        // Выделение подстроки
        String subString = digits.substring(2); // Выделить подстроку со второго индекса и до конца строки
        System.out.println("subString: " + subString);
        System.out.println("digits: " + digits); // Изначальная строка остается не измененной

        String subString2 = digits.substring(2, 7); // Взять символы со 2 (включительно) по 7 (не включительно). в математике пишут -> [2:7)
        System.out.println("subString2: " + subString2);




    }
}
