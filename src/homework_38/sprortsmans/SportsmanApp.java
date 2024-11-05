package homework_38.sprortsmans;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.11.2024
 */

public class SportsmanApp {

    public static void main(String[] args) {
        Sportsman[] sportsmanArray = new Sportsman[6];
        sportsmanArray[0] = new Sportsman("John", 100.50, 28);
        sportsmanArray[1] = new Sportsman("Alex", 90.78, 24);
        sportsmanArray[2] = new Sportsman("Bob", 100.50, 30);
        sportsmanArray[3] = new Sportsman("Tim", 50, 30);
        sportsmanArray[4] = new Sportsman("Hanna", 90.50, -1_600_000_000);
        sportsmanArray[5] = new Sportsman("Zlatan", 75, 1_400_000_000);

        Arrays.sort(sportsmanArray);

        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }

        Arrays.sort(sportsmanArray, new SportsmanScoreComparator());

        System.out.println("\n ===================== \n");

        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }

        System.out.println("\n ====================== \n");

        //
//        Comparator<Sportsman> comparator = new Comparator<Sportsman>() {
//            @Override
//            public int compare(Sportsman o1, Sportsman o2) {
//                return 0;
//            }
//        } ;

        int x1 = -1_500_000_000;
        int x3 = -1_400_000_000;
        System.out.println(x1 - x3);
//
        Arrays.sort(sportsmanArray, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.getAge(), s2.getAge());

                // сравнение примитивов. Может произойти переполнение типа -> некорректные значения операция вычитания
//                 return s1.getAge() - s2.getAge();
            }
        });

        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }

    }
}
