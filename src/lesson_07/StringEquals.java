package lesson_07;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.09.2024
 */

public class StringEquals {

    public static void main(String[] args) {

        int x = 10;

        // Ссылочный тип данных. В переменной str1 хранится ссылка на область в памяти в которой находится объект типа String (значение)
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        // == Сравниваются значения, которые хранятся в переменных
        boolean b1 = (str1 == str2);
        System.out.println("str1 == str2: " + b1); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        System.out.println("str1 == str4: " + (str1 == str4)); // false

        // String Pool

        // ВАЖНО!!!
        // Для сравнения строк по их значению мы ДОЛЖНЫ использовать метод equals

        boolean b2 = str1.equals(str2); // Сравнение по значению строк (не по ссылкам)
        System.out.println("str1.equals(str2) -> " + b2); // true
        System.out.println("str1.equals(str4) -> " + str1.equals(str4)); // true
        System.out.println("str1.equals(str3) -> " + str1.equals(str3));
        System.out.println(str1+ ".equalsIgnoreCase(" + str3 + ") -> " + str1.equalsIgnoreCase(str3)); // сравнение по значению с игнорированием регистра



    }
}
