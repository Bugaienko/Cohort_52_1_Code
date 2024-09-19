package consultation_04;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.09.2024
 */

/*
Task 5 * (Опционально)
Используйте оператор switch для решения задачи:

Ваш ребенок принес оценку за контрольную работу по математике.
В школе 12-балльная система.
Запишите в переменную случайное число от 0 до 12.

Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.

P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.


 */

public class HW07_Task5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int note = rand.nextInt(13);

        System.out.println("Оценка: " + note);

        int time = 45;
        switch (note) {
            case 12:
            case 11:
            case 10:
                System.out.println("как вы рады");
                time += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("похвалите ребенка");
                time += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("нейтрально отнеситесь");
                time += 15;
                break;
            case 3:
                System.out.println("огорчитесь");
                time -= 10;
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("запретите телевизор");
                time = 0;
                break;
            default:
                System.out.println("Опять подрисовывал оценки в дневнике?");
        }

        if (time > 60) time = 60;
        if (time < 0) time = 0;

        System.out.println("Остаток времени на сегодня: " + time);


    }
}
