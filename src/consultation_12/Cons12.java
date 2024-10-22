package consultation_12;

/**
 * @author Sergey Bugaenko
 * {@code @date} 22.10.2024
 */

public class Cons12 {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5}; // синтаксический сахар

        Integer num = Integer.valueOf(5);
        Integer num2 = 5; // синтаксический сахар
        int x = num.intValue();
        int x1 = num; // Автораспаковка - тоже пример сахара

        // JDK 12. Синтаксический сахар
        /*
       int day = 2;
       String dayName = switch (day) {
           case 1 -> "Monday";
           case 2 -> "Tuesday";
           case 3 -> "Wednesday";
           default -> "Unknown";
       };
       */

        System.out.println(Constants.PI);

    }
}
