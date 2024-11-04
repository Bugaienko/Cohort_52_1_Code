package lesson_37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Sergey Bugaenko
 * {@code @date} 01.11.2024
 */

public class ProjectRandom {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println("Список: " + list);

        Collections.shuffle(list);
        Collections.shuffle(list);
        Collections.shuffle(list);

        System.out.println(list);

    }
}
