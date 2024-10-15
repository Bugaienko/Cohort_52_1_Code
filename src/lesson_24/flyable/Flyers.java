package lesson_24.flyable;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Flyers {
    public static void main(String[] args) {

        Airplane airplane = new Airplane(50);
        Duck duck = new Duck();

        duck.fly();
        duck.swim();

        System.out.println("\n============\n");

        Flyable[] flyables = new Flyable[2];
        flyables[0] = airplane;
        flyables[1] = duck;

        for (int i = 0; i < flyables.length; i++) {
            Flyable flyable = flyables[i];

            if (flyable instanceof Airplane) {
                // Проверяем возможность приведения ссылки к типу класса
                Airplane airplaneLink = (Airplane) flyable;
                System.out.println("airplaneLink.takePassenger(): " + airplaneLink.takePassenger());
                System.out.println("Вместимость: " + airplaneLink.capacity);
                System.out.println("airplaneLink.countPassenger(): " + airplaneLink.countPassenger());
            }

            // Проверяем возможность приведения ссылки к типу интерфейса
            if (flyable instanceof Swimmable) {
                Swimmable swimmable = (Swimmable) flyable;
                swimmable.swim();
            }

            System.out.println("\n=============\n");
            flyable.fly();
        }

    }
}
