package consultation_10;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Fruit {
    String title;
    boolean isReady;

    public Fruit(String title) {
        this.title = title;
    }

    public void ripen() {
        System.out.println("Ripen from Fruit");
        isReady = true;
    }

    @Override
    public String toString() {
        System.out.println("toString Fruit");
        return "{Fruit title=" + title + ", isReady=" + isReady + "}";
    }
}
