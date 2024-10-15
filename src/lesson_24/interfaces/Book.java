package lesson_24.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Book implements Printable{
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public void print() {
        System.out.printf("Book %s (%s)\n", title, author);
    }
}
