package homework_23.paper;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class ColorPencil extends Pencil{

    private String color = "Red";

    @Override
    void draw(String figure) {
        System.out.printf("Рисую фигуру %s цветным (%s) карандашом!\n",
                figure, color);
    }

    public ColorPencil() {
    }

    public ColorPencil(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
