package lesson_24.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Presentation implements ColorPrintable {

    String title;
    String author;
    String theme;
    int pages;

    public Presentation(String title, String author, String theme, int pages) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.pages = pages;
    }

    @Override
    public void colorPrint() {
        System.out.println("Отправляю презентацию в типографию.");
        System.out.printf("Printing presentation in colors: author %s, title: %s\n", author, title);
    }

    @Override
    public void print() {
        System.out.printf("Presentation by %s title: %s\n", author, title);
    }
}
