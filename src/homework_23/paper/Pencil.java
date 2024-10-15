package homework_23.paper;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Pencil extends Pen{
    @Override
    void draw(String figure) {
        System.out.println("Рисую карандашом: " + figure);
    }
}
