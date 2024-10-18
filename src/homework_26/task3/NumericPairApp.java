package homework_26.task3;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.10.2024
 */

public class NumericPairApp {

    public static void main(String[] args) {

        NumericPair<Integer, Double> numericPair =
                new NumericPair<>(10, 5.5);

        System.out.println(numericPair.sum());

        NumericPair<Integer, Integer> numericPair1 =
                new NumericPair<>(100, 25);
        System.out.println(numericPair1.sum());



    }
}
