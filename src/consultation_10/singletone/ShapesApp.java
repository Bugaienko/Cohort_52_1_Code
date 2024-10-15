package consultation_10.singletone;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class ShapesApp {
    public static void main(String[] args) {

        Triangle triangle = Triangle.createTriangle(3,4,10);
        System.out.println(triangle);

        triangle = Triangle.createTriangle(5,7,10);
        System.out.println(triangle);
    }
}
