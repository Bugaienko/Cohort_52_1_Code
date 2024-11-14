package consultation_19;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.11.2024
 */

public class JavaTime {
    public static void main(String[] args) {

        // Instant - представляет момент времени в эпохе Unix (кол-во миллисекунд с 1 января 1970 года, 00:00 UTC)

        Instant start = Instant.now();
        System.out.println(start);

        // Здесь будет какой-то код, время работы которого мы хотим засечь
        int sum =0;
        for (int i = 0; i < 100000; i++) {
            sum += i;
        }

        Instant end = Instant.now();

        // Duration - продолжительность в секундах и наносекундах.
//        Чаще всего используется для измерения коротких промежутков времени
        Duration duration = Duration.between(start, end);
        System.out.println("duration: " + duration);

        long millis = duration.toMillis();
        System.out.println("millis: " + millis);
        long nanoseconds = duration.toNanos();
        System.out.println("nanoseconds: " + nanoseconds);
        long seconds = duration.toSeconds();
        System.out.println("seconds: " + seconds);

        System.out.println("\n ============== Period =========== ");
        // Period представляет период времени в годах, месяцах и днях
        LocalDate startDate = LocalDate.of(2022, 01, 1);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);
        System.out.println("period: " + period);
        System.out.println(period.getYears() + " | " + period.getMonths() + " | " + period.getDays());
        System.out.println("period.toTotalMonths(): "  + period.toTotalMonths());
        // Можно получить период в выбранной единице времени (универсальный геттер) -
        // не производит вычислений (нет пересчета общего кол-ва месяцев)
        System.out.println(period.get(ChronoUnit.MONTHS));

        System.out.println("\n===================DateTimeFormatter =========");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String strDate = now.format(formatter);
        System.out.println(strDate);

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

        // Из строки получить объект LocalDateTime с указанной в строке датой и времени
        String dateForParse = "23-10-26 19:15";
        System.out.println(dateForParse);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parseDate = LocalDateTime.parse(dateForParse, formatter2);
        System.out.println(parseDate.getDayOfWeek() + " | " + parseDate.getHour());
        System.out.println(parseDate);

        System.out.println("\n============== Task1 =================");

        // "15-12-2022 20-46"
        // Запарсить строку в формат LocalDateTime
        // распечатать отдельно месяц, день и час

        // "30/01/23 1:47" 23 это год.
        // Какому дню недели соответствует вторая дата
        // Сколько дней между этими датами

        String strDate1 = "15-12-2022 20-46";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime date1 = LocalDateTime.parse(strDate1, formatter1);
        System.out.println("месяц-enum: " + date1.getMonth() + " | номер месяца:" +date1.getMonth().getValue() + " | " + date1.getDayOfMonth() + " | " + date1.getHour());

        String strDate2 = "30/01/23 1:47";
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yy H:mm");
        LocalDateTime date2 = LocalDateTime.parse(strDate2, formatter3);
        System.out.println(date2.getDayOfWeek() + " | номер дня недели: " + date2.getDayOfWeek().getValue());
        System.out.println(ChronoUnit.DAYS.between(date1, date2));
        System.out.println(date1.until(date2, ChronoUnit.DAYS));




    }
    public static void task2(List<LocalDate> dates) {
        //Надо определить самую раннюю дату (меньшую)
        //Надо определить самую позднюю дату (большую)
        // min, max - среди чисел

        int result;
        if (dates == null || dates.isEmpty()) {
            result = 0;
        }

        LocalDate min = dates.get(0);
        LocalDate max = dates.get(0);
        //Перебираем в цикле все даты.
        // Сравниваем каждую с тем, что сейчас в переменной min
        // Если текущая дата меньше (раньше) - переписываем значение в min

        // Сравниваем каждую с тем, что сейчас в переменной max
        // Если текущая дата больше (позже) - переписываем значение в max

        // Вычислить вычислить кол-во дней между этими датами (min, max)




    }
}
