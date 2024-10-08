package lesson_19;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.10.2024
 */

public class FinalDemo {

    // Имена констант в Java принято писать в верхнем регистре (все буквы в имени большие)

    public static final double PI = 3.141519; // Константа

    // Состояние объекта (значения в массиве) можно изменить
    public static final int[] ints = new int[10]; // НЕ является константой,

    // Неизменяемый тип данных.
    public static final String COUNTRY = "Germany"; // Константа, т.к. невозможно изменить значение строки

    // Не константа, так как я могу изменить значения внутри массива (переписать ссылки)
    public static final String[] colors = {"blue", "red", "yellow"};



    // Переменная примитивного типа, помеченная ключевом словом final
    private final int x;
    // Final переменные должны быть явно проинициализированы.
    // Прямо в поле, в конструкторе или в блоке инициализации.

    // Ссылочные типы данных. Невозможно переписать ссылку, которая хранится в переменной
    private final int[] array = new int[10];

    //
    private final String title = "Title";

    public FinalDemo() {
        // переписать ссылку не могу, т.к. переменная final
       // colors = new String[10];
        colors[0] = "green";
        ints[0] = 1;
        this.x = 100;
        // Нельзя присвоить ссылку на другой объект
        // this.array = new int[20];

        // Но мы можем изменять состояние самого объекта
        this.array[0] = 1000;
        this.array[array.length - 1] = 15000;
    }

    public FinalDemo(int x) {
        this.x = x; // после инициализации переменной нельзя поменять значение переменной.
      //  this.x = 10; не могу изменить значение final переменной
    }

    public void changeX() {
        // x = 15; Ошибка компиляции, т.к. x final переменная
    }

    public void setX(int x) {
        // this.x = x; Для final переменных сеттер не пишется (ошибка компиляции)
    }


    public int getX() {
        return x;
    }

    // Мы можем использовать значения констант в методах класса
    public double getPiX() {
        return PI * this.x;
    }
}
