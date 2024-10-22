package homework_28;

import lists.MyArrayList;
import lists.MyList;


public class RectangleTest {
    public static void main(String[] args) {
        MyList<Rectangle> rectangles = new MyArrayList<>();

        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        // Цикл for-each почему-то не работает.
        System.out.println("Список до удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }


        System.out.println("\n===============\n");


        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
//        RectangleUtils.removeDuplicates(rectangles, rectangleToRemove);

        System.out.println("Список в одним прямоугольником, но без дубликатов:");
        System.out.println(RectangleUtils.removeOnlyDuplicates(rectangles,
                rectangleToRemove));

        RectangleUtils.removeDuplicates2(rectangles, rectangleToRemove);


        System.out.println(rectangles);

        // Цикл не работает
        System.out.println("\nСписок после удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }
    }
}
