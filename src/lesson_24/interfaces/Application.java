package lesson_24.interfaces;

import homework_23.shapes.Circle;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Application {
    public static void main(String[] args) {

        Book book = new Book("Мастер и Маргарита", "М.Булгаков");
//        Object objBook = (Object) book;
//        System.out.println("ссылка типа object: " + objBook.toString());

         Journal journal = new Journal("Cosmopolitan", 154);

         Printable printable = journal; // Неявное приведение типа ссылки
        printable.print();



        book.print();

        Printable book1 = new Book("Философия Java", "Б. Эккель");
        book1.print();

        book.test();
        journal.test();

        Printable.testStatic("Hello!");

        System.out.println("\n ==================== \n");

        Presentation presentation = new Presentation(
                "Inheritance",
                "Noname",
                "Inheritance in OOP",
                20);

        presentation.print();
        presentation.colorPrint();
        presentation.test();

        Printable printable1 = presentation;
        printable1.print();


    }
}
