package lesson_20;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 09.10.2024
 */

public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "Java " + "is" + " " + "the" + " " + "best";

        /*
        StringBuilder - это класс в Java, предназначенный для эффективного создания и модификации изменяемых последовательностей символов.

         */
        // Конструктор перегружен. Может быть пустым, может принимать String
        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb = new StringBuilder("Hello");

        // Метод для добавления в конец строки (приклеить справа) / аналог конкатенации
        sb.append(" ").append("Java");

        // Получить строковое представление
        String string = sb.toString();
        System.out.println(string);

        //  Вставить символы в указанную позицию
        StringBuilder sb2 = new StringBuilder("Hello World");
        sb2.insert(6, "beautiful ");
        System.out.println(sb2);

        // Заменить подстроку (определяется индексами) на указанное значение
        StringBuilder sb3 = new StringBuilder("Hello World!");
        sb3.replace(6, 11, "Java"); // верхняя граница не включительно
        System.out.println(sb3);

        // Удалить подстроку в диапазоне от start до end
        StringBuilder sb4 = new StringBuilder("Hello World!");
        sb4.delete(5, 11);
        System.out.println(sb4);

        // Реверс - Разворачивает последовательность символов
        StringBuilder sb5 = new StringBuilder("Hello World!");
        sb5.reverse();
        System.out.println(sb5);

        // Количество символ - длина
        System.out.println("sb5.length(): " + sb5.length());

        // Получить символ по индексу
        char ch = sb5.charAt(3);
        System.out.println(ch);

        // Получить подстроку
        sb = new StringBuilder("Hello World");
        String subString = sb.substring(1); // от индекса до конца строки
        System.out.println("sb.substring(1): " + subString);

        subString = sb.substring(6, 9); // от start до end (не включительно)
        System.out.println("sb.substring(6, 9): " + subString);

        // Изменять размер последовательности символов
        sb = new StringBuilder("Hello");
        sb.setLength(10);
        // Если увеличить строку, она будет заполнена char с кодом 0
        System.out.println("sb.setLength(10): " + sb);
        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8): " +  (int) ch1);

        sb.setLength(3);
        System.out.println("sb.setLength(3): " + sb);

        /*
        Написать метод, который запрашивает у пользователя строку, состоящую из нескольких слов
        и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанных в верхнем регистре)
         */
        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] strings = example.split(" ");
        System.out.println(Arrays.toString(strings));

        String result = phraseString();
        System.out.println("Аббревиатура: " + result);

        // Потоко-безопасный брат StringBuilder
        StringBuffer stringBuffer = new StringBuffer();


    }

    public static String phraseString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку из нескольких слов");

        String input = sc.nextLine();

        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        // String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // result = result + word.charAt(0);
            sb.append(word.charAt(0));
        }

        // System.out.println("Результирующая строка: " + result.toUpperCase());

        return sb.toString().toUpperCase();
    }
}
