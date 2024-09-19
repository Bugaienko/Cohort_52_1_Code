package consultation_04;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.09.2024
 */

public class NumberCut {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(10_000_000);
        System.out.println(rand);

        int sum = 0;

        while (rand > 0) {
            int digit = rand % 10;
            rand /= 10;
            sum += digit;

            System.out.print(digit);

            if (rand > 0) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }

        }

        System.out.println(sum);
    }
}
