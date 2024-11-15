package lesson_47;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.11.2024
 */

public class TimeFormatterExample {
    public static void main(String[] args) {
         /*
        y - год
        M - месяц
        d - день
        H - часы в формате от 0 до 23
        h - часы в формате от 0 до 12, флаг а  для отображения AM/PM
        m - минута
        s - секунда

        Количество повторений символа определяет формат
        yy - двухзначный год, например 24 для 2024года
        yyyy - 4-значный год
        M - месяц "2" или "12"
        MM - месяц "02" или "12"
        d - однозначный или двузначный день: 3 или 29
        dd - двузначный день: 03 или 29

         */

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String strDate = now.format(formatter);
        System.out.println("date string: " + strDate);

        // У нас есть String с датой и временем в каком-то формате.
        // И нам нужно из этой строки получить объект даты-времени

        String dateStrParse = "24-10-05 16:58"; // 05- число, 24 - год
        System.out.println(dateStrParse);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parseDate = LocalDateTime.parse(dateStrParse, formatter2);
        System.out.println(parseDate);
        System.out.println(parseDate.getDayOfWeek() + " | "  + parseDate.getHour() + ":" + parseDate.getMinute());
        System.out.println(parseDate.format(formatter));


    }
}





















