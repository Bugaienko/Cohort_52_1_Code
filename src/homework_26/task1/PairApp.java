package homework_26.task1;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.10.2024
 */

public class PairApp {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("a", "b");

        System.out.println(pair);
        pair.swap();

        System.out.println(pair);
    }
}
