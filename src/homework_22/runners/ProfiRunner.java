package homework_22.runners;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.10.2024
 */

public class ProfiRunner extends Human {

    // Блок инициализации
    {
        setTypeRunner("Спортсмен-профи");
    }


    public ProfiRunner() {
        super(25, 5);
    }

    public ProfiRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }


}
