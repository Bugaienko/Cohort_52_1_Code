package homework_38.sprortsmans;

import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.11.2024
 */

public class SportsmanScoreComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman s1, Sportsman s2) {

        return Double.compare(s1.getScore(), s2.getScore());

        // Такая реализация будет работать не верно, при разнице очков меньше единицы.
//        return (int) (s1.getScore() - s2.getScore());
    }
}
