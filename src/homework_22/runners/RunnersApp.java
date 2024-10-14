package homework_22.runners;

import java.util.Arrays;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.10.2024
 */

public class RunnersApp {
    public static void main(String[] args) {
        Human human = new Human();
        AmateurRunner amateurRunner =new AmateurRunner();

        human.run();
        amateurRunner.run();

        ProfiRunner profiRunner =new ProfiRunner();
        profiRunner.run();

        Human[] humans = new Human[3];
        humans[0] = human;
        humans[1] = amateurRunner;
        humans[2] = profiRunner;

        ProfiRunner superProfi = new ProfiRunner(27, 4);;
        superProfi.run();

        System.out.println("\n================");

        System.out.println(human);
        System.out.println(amateurRunner);
        System.out.println(superProfi);

        System.out.println(Arrays.toString(humans));

    }
}
