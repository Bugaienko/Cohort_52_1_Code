package lesson_17;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.10.2024
 */

public class Auto {

    void gas() {
        /*
        Происходят какие-то сложные действия,
        в результате которых автомобиль движется
         */
        /*
        Изменили функционал! Дописали логику работы двигателя!
         */
        System.out.println("Авто едет вперед");
    }

    void  breakMe() {
        /*
        Происходят какие-то сложные действия,
        в результате которых автомобиль замедляется
         */
        System.out.println("Авто замедляется");
    }

    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.gas();
        auto.breakMe();
    }
}
