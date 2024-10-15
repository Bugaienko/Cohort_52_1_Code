package consultation_10;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Orange extends Fruit{

    public Orange(String title) {
        super(title);
    }

    public void  extractJuice() {
        if (isReady) {
            System.out.println("Получаем вкусный сок");
        } else {
            System.out.println("Фрукт не готов. Сока нет");
        }
    }

//    @Override
//    public void ripen() {
//        System.out.println("Ripen from Orange");
//        isReady = true;
//    }

    @Override
    public String toString() {
        System.out.println("toString Orange");
        return "{ Orange title: " + title + "}";
    }
}
