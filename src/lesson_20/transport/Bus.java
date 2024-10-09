package lesson_20.transport;

/**
 * @author Sergey Bugaenko
 * {@code @date} 09.10.2024
 */
//       Smartphone is-a Vehicle -> НЕ Верно. Применять наследования НЕЛЬЗЯ
//           Bus  is-a  Vehicle -> Верно. Можно применить наследование
public class Bus extends Vehicle {

    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
        // Нужно сначала создать объект родителя.
        super(model, year); // вызываем конструктор родительского класса
        this.capacity = capacity;
    }

    public boolean takePassenger() {
        // Проверить есть ли свободное место?
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус " + this.getModel());
            return true;
        }

        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажиров\n",
                this.getModel(), countPassengers);
        return false;
    }

    public boolean dropPassenger() {
        // Проверить есть ли в автобусе пассажиры
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса " + this.getModel());
            return true;
        }

        System.out.printf("В автобусе %s больше нет пассажиров\n", this.getModel());
        return false;
    }


    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
