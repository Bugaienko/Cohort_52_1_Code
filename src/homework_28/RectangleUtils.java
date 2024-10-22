package homework_28;

import lists.MyArrayList;
import lists.MyList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 22.10.2024
 */

public class RectangleUtils {

    public static void removeDuplicates(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {

        for (int i = 0; i < rectangles.size(); i++) {
            if (rectangles.get(i).equals(rectangleToRemove)) {
                rectangles.remove(i);
                i--; // Корректируем индекс после удаления элемента
            }
        }
    }

    // Todo - Перебрать for-each


    public static void removeDuplicates2(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {

        while (rectangles.contains(rectangleToRemove)) {
            rectangles.remove(rectangleToRemove);
        }
    }

    // Оставить один прямоугольник, повторяющиеся убрать из списка
    public static MyList<Rectangle> removeOnlyDuplicates(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {
        MyList<Rectangle> result = new MyArrayList<>();
        /*
        1. Проверить, есть ли такой прямоугольник в новом списке
        2. Если нет - то добавить в список
        3. Перебросить ссылки. Ссылка rectangles должна ссылаться на новый список
         */

        for (int i = 0; i < rectangles.size(); i++) {
            if (!result.contains(rectangles.get(i))) {
                result.add(rectangles.get(i));
            }
        }

        return result;
    }
}
