package lesson_38;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.11.2024
 */

public class Car implements Comparable<Car>  {
    private String model;
    private int year;
    private  int speed;

    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Сравнение машин по году выпуска. "Меньшей" будет считаться машина с меньшим (более ранним) годом выпуска
    @Override
    public int compareTo(Car car1) {
        return this.year - car1.year;
        /*
        a vs b -> (a - b)
        a < b -> отрицательное значение
        a > b -> метод вернет положительное значение
        a == b -> метод вернет 0
         */
    }
}
