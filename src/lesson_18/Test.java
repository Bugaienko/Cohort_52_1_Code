package lesson_18;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.10.2024
 */

public class Test {
    // non-static Поле класса
    int x;

    // static поле класса
    static int staticY;

    public void testNonStatic(){
        // У нестатических методов есть доступ КО ВСЕМ членам класса:
        x++;
        staticY++;
        // Может вызывать НЕ-статические и статические методы
        testStatic();
    }

    public static void testStatic(){
        // Статические методы видят ТОЛЬКО статические члены класса:
        // x++; нет доступа к не-статическому полю
        staticY++;
        // Может вызвать ТОЛЬКО статические методы
    }


    // Метод main у нас статический. Имеет доступ только к статическому контенту.
    public static void main(String[] args) {
       // x = 10; // Ошибка компиляции. У статического метода нет доступа к НЕ-статическим членам!
        Test.testStatic();
        // testNonStatic(); не могу вызвать не-статический метод

        Test test = new Test();
        // я могу вызвать не-статический метод, используя ссылку на объект.
        test.testNonStatic();
    }

}
