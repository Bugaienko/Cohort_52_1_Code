package homework_28;

/**
 * @author Sergey Bugaenko
 * {@code @date} 22.10.2024
 */

public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        // JDK 16 и ваше
//        if (!(o instanceof Rectangle rectangle)) return false;

        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;

        return Double.compare(width, rectangle.width) == 0 && Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(width);
        result = 31 * result + Double.hashCode(height);
        return result;
    }

    @Override
    public String toString() {
        return "Прямоугольник{" +
                "width= " + width +
                ", height= " + height +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}



/*
Task 1: Создание класса “Rectangle”
Создайте класс Rectangle, который представляет прямоугольник со следующими полями:

    - length (длина) — тип double
    - width (ширина) — тип double

Требования:
Конструкторы:
   - Создайте конструктор, который инициализирует оба поля класса.
   - Создайте конструктор без параметров (по умолчанию), который устанавливает длину и ширину в значение 1.0.

Методы:
   - Реализуйте методы доступа (геттеры и сеттеры) для каждого поля.
   - Переопределите метод toString(), чтобы он возвращал строковое представление объекта Rectangle
   в формате: "Прямоугольник [длина=..., ширина=...]".

Метод main():
   - В методе main() создайте несколько объектов Rectangle и выведите их на экран, используя метод toString().

___

Task 2: Сравнение объектов класса “Rectangle”
Используя класс Rectangle из первого задания, необходимо реализовать сравнение объектов на равенство по их содержимому.

Требования:
Переопределение метода equals():
    - Переопределите метод equals() в классе Rectangle, чтобы два объекта считались равными, если у них совпадают значения полей length и width.
Copy
Метод main():
- Создайте несколько объектов Rectangle, некоторые из которых имеют одинаковые длину и ширину.
- Сравните объекты между собой, используя метод equals(), и выведите результаты сравнения на экран.
Copy
Пример:
public class RectangleTest {
public static void main(String[] args) {
Rectangle rect1 = new Rectangle(5.0, 3.0);
Rectangle rect2 = new Rectangle(5.0, 3.0);
Rectangle rect3 = new Rectangle(4.0, 2.0);

        System.out.println(rect1.equals(rect2)); // Должно быть true
        System.out.println(rect1.equals(rect3)); // Должно быть false
    }
}
 */
