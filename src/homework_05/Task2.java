package homework_05;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.09.2024
 */


/*
Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
 */

/*
Task 2.2 * (Опционально)
Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.

 */

public class Task2 {
    public static void main(String[] args) {
        String str = "Java";
        String str1 = "is";
        String str2 = "a";
        String str3 = "powerful";
        String str4 = "language";

        String space = " ";

        String concat = String.join(space, str, str1, str2, str3, str4);

        System.out.println(concat + "; длина: " + concat.length());

        String concatStr2 = str.concat(space).concat(str1)
                .concat(space).concat(str2)
                .concat(space).concat(str3).concat(space).concat(str4);

        System.out.println(concatStr2 + "; длина: " + concatStr2.length());

        String concatStr3 = str + space + str1 + space + str2 + space + str3 + space + str4;

        System.out.println(concatStr3 + "; длина: " + concatStr3.length());
        // Ctrl + Alt = L | Cmd + Opt + L - выравнивание кода

        // Замена подстроки в строке

        String result = concatStr2.replace("powerful", "super");
//        String result = concatStr2.replace(str3, "super");
        System.out.println(result);

        // Поиск вхождений в строке
        String replaceMe = "AbAbAbAc";
        String replace1 = replaceMe.replaceFirst("Ab", "C");
        String replace2 = replaceMe.replace("Ab", "D");

        // Поддерживается работа с регулярными выражениями
        String replace3 = replaceMe.replaceAll("Ab", "E");
        System.out.println("replace1: " + replace1);
        System.out.println("replace2: " + replace2);
        System.out.println("replace3: " + replace3);

        // Поиск индекса вхождения подстроки в строку
        int index = concatStr2.indexOf("age");
        System.out.println("index: " + index);

        //replaceMe = "AbAbAbAc";
        int indexAb1 = replaceMe.indexOf("Ab");
        System.out.println("indexAb1: " + indexAb1);
        int indexAb2 = replaceMe.lastIndexOf("Ab");
        System.out.println("indexAb2: " + indexAb2);

        // Todo boolean variable





    }
}


















