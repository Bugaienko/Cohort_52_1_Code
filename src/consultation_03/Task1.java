package consultation_03;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.09.2024
 */

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(51) -20; // (0, 1, 2 ... 50) -> (-20, -19, -18 ... 30)
        // 0 - 20 -> -20
        // 30 - 20 -> 10
        // 50 - 20 -> 30
        System.out.println(x);

        // 50 - 80.
        int y = rand.nextInt(31) + 50; // (50..80)

        // 1...100 ->
        int z = rand.nextInt(100) + 1; //
        System.out.println(z);

    }
}
