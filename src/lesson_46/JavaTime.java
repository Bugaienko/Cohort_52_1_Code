package lesson_46;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.11.2024
 */

public class JavaTime {

    public static void main(String[] args) {

        /*
        util.Date, +  util.Calendar + text.SimpleDateFormat
        Joda-Time

        java.time Java Time Api
         */

        // LocalDate - представляет дату (год, месяц, день) - без времени и часового пояса

        LocalDate date = LocalDate.now(); // возвращает текущую дату
        System.out.println("now: " + date);

        // прибавить 1 день к дате
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow: " + tomorrow);
        // объект LocalDate неизменяемы. Метод plusDays не изменяет объект, на котором он вызван
        System.out.println("date: " + date);

//        String text = "String init";
//        String anotherString = text.toLowerCase();
//        System.out.println(anotherString);
//        // text неизменный
//        System.out.println("text: " + text);

        System.out.println("plusWeeks: " + date.plusWeeks(4)); // плюс 4 недели к дате
        System.out.println("yesterday: " + date.minusDays(1)); // минус 1 день

        LocalDate date1 = LocalDate.of(2002, 2 , 15); // Установить дату (год, месяц, день)
        System.out.println("date1: " + date1);

        // Можно использовать Enum с названием месяца
        LocalDate date2 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println("date2: " + date2);

        // У объекта LD есть куча геттеров
        System.out.println("год: " + date2.getYear() + "; месяц: " + date2.getMonth() + "; месяц-цифра: " + date2.getMonthValue());
        System.out.println("число: " + date2.getDayOfMonth() + "; день недели: " + date2.getDayOfWeek() + "; день года: " +
                date2.getDayOfYear());
        // Класс представляющий день недели
        DayOfWeek dayOfWeek = date2.getDayOfWeek();
        System.out.println("номер дня недели: " + dayOfWeek.getValue());
        System.out.println("сколько дней в месяце: " + date2.lengthOfMonth() + "; дней в году: " + date2.lengthOfYear());

//        Month[] months = Month.values();
//        for (Month month : months) {
//            System.out.println(month);
//        }

        String dateString = "2000-10-25"; // Формат строки ISO-8601 - (год, месяц, число, разделенные тире)
        LocalDate date3 = LocalDate.parse(dateString);
        System.out.println(date3.getDayOfMonth() + ":" + date3.getMonthValue()+ ":" + date3.getYear() + ":" + date3.getDayOfWeek());

        System.out.println("\n ================= LocalTime ==================");
        //LocalTime - представляет время (часы, минуты, секунды, наносекунды)
        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("LocalTime.now(): " + time);

        LocalTime time1 = LocalTime.of(21, 33); // часы, минуты
        time1 = LocalTime.of(21, 33, 44);
        time1 = LocalTime.of(21, 33, 44, 54875);
        System.out.println(time1);

        System.out.println("time.plusHours(1): " + time.plusHours(1)); // добавляем 1 час к объекту времени (получаем новый объект времени)
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65));
        System.out.println("time.minusSeconds(30): " + time.minusSeconds(30));

        // геттеры
        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + ":" + time.getNano());
        String timeStr = "12:13:46";
        // формат iso9601 ("2001-01-14T08:15:45+01.00")
        LocalTime parseTime = LocalTime.parse(timeStr);
        System.out.println(parseTime + " : " + parseTime.getMinute());


        System.out.println("\n======== LocalDateTime ============== ");
        // LocalDateTime - представляет дату и время (ьез учета часового пояса)
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15, 31, 59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(dateTime);
        dateTime = LocalDateTime.of(2024, 12, 31, 23, 59);

        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfWeek().getValue());

        // Есть все методы из классов LocalDate + LocalTime
        System.out.println("dateTime.plusHours(1): " + dateTime.plusHours(1));
        System.out.println("dateTime.minusYears(1): " + dateTime.minusYears(1));

        System.out.println("\n============= ZoneDateTime =============");
        // ZoneDateTime - представляет дату и время с часовым поясом
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime + " | " + zonedDateTime.getZone());

        System.out.println("\n ==== isAfter, isBefore, until, equals ============");
        LocalDate date4 = LocalDate.of(2000, 10, 15);
        LocalDate date5 = LocalDate.of(2000, 6, 25);

        // isAfter, isBefore, until, equals  есть у всех объектов, представляющих дату и/или время
        // isAfter - проверяет, что текущий объект после (позже) указанного объекта
        boolean isAfter = date4.isAfter(date5);
        System.out.println("date4.isAfter(date5): " + isAfter);

        // isBefore - проверяет, что текущий объект до (раньше) указанного объекта
        System.out.println("date4.isBefore(date5): " + date4.isBefore(date5));

        // equals - проверяет объекты даты и/или времени на равенство
        System.out.println("date4.equals(date5): " + date4.equals(date5));

        // until - метод измеряет время между текущим и указанным объектом даты/времени
        // Мы можем выбрать в каких в каких единицах измерять разницу
        // возвращает он long
        long daysBetween = date4.until(date5, ChronoUnit.DAYS); // сколько дней между date4 и date 5
        System.out.println("date4.until(date5, ChronoUnit.DAYS): " + daysBetween);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.plusDays(15);
        System.out.println(dateTime2.until(dateTime1, ChronoUnit.SECONDS));

        // Универсальные методы minus, plus - ко всем объектам даты / времени
        LocalDateTime dateTime3 = dateTime1.minus(10, ChronoUnit.DAYS); // вычесть из даты 10 дней
        LocalDateTime dateTime4 = dateTime1.plus(5, ChronoUnit.YEARS); // прибавить 5 лет

        // метод between есть у каждого ChronoUnit
        // Если мне нужно узнать количество дней между датами
        long daysBetween2 = ChronoUnit.DAYS.between(dateTime3, dateTime4);
        System.out.println("daysBetween(dateTime3, dateTime4): " + daysBetween2);
        System.out.println(ChronoUnit.HOURS.between(dateTime3, dateTime4));

        System.out.println("\n========== Duration, Instant, Period =================\n");
        /*
        Duration - представляет продолжительность в секундах и наносекундах
        Instant - сколько прошло наносекунд с 1 января 1970 UTC

        Period - представляет период времени в годах, месяцах и днях между двумя объектами дат
         */

        System.out.println("\n ============== DateTimeFormatter ============ ");
        // DateTimeFormatter форматирование даты и времени
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:s");
        String formattedDate = now.format(formatter);
        System.out.println("StringDate: " + formattedDate);

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







    }
}



















