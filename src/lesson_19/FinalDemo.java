package lesson_19;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.10.2024
 */

public class FinalDemo {


    // Переменная примитивного типа, помеченная ключевом словом final
    private final int x;
    // Final переменные должны быть явно проинициализированы.
    // Прямо в поле, в конструкторе или в блоке инициализации.

    // Ссылочные типы данных. Невозможно переписать ссылку, которая хранится в переменной
    private final int[] array = new int[10];

    public FinalDemo() {
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
}
