package homework_24.task_01;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.10.2024
 */

/*
Task 1
Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.

Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.

Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */

public class RunnersApp {
    public static void main(String[] args) {

        Triathlete triathlete = new Triathlete("John Runner");

        System.out.println(triathlete);

        triathlete.run();
        triathlete.swim();
    }
}
