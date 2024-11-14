package homework_45;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.11.2024
 */

public class ArrayListException {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        System.out.println(list.get(5));
    }
}
