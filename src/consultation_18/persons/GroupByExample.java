package consultation_18.persons;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.11.2024
 */

public class GroupByExample {

    public static void main(String[] args) {

        /*
        groupingBy - предоставляет возможность различными способами группировать элементы потока.
        Map<K, List<T>> - как правило, результат будет в виде мапы
         */

        task1();
    }

    private static void task1() {
        List<Employee> employees = new ArrayList<>(
                List.of(
                        new Employee("Petr", 2500, 25, "developer", "IT"),
                        new Employee("Silvia", 1500, 22, "trainee", "IT"),
                        new Employee("Stefan", 2500, 30, "PM", "IT"),
                        new Employee("Olivia", 2700, 25, "manager", "Management"),
                        new Employee("Sebastian", 3500, 24, "chef", "Management"),
                        new Employee("Hanna", 1300, 35, "cleaner", "Cleaning"),
                        new Employee("John", 3200, 19, "chef", "IT")
                )
        );

        // Получить списки сотрудников по отделам. Сгруппировать сотрудников по какому-то полю класса
        // Ключом будет название отдела - значением, список сотрудников из этого отдела.
        // (Список сотрудников, у которых поле department = этому ключу)
        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Employee::getDepartment: ");
        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

        Map<String, Set<Employee>> map1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.toSet()));
        System.out.println("groupingBy(Employee::getDepartment, Collectors.toSet(): " + map1);
        Set<Employee> employeeSet = map1.get("IT");
        System.out.println("employeeSet: " + employeeSet);

        System.out.println("\n======== Количество сотрудников по отделам =============\n");
        // Количество сотрудников по отделам
        Map<String, Long> map2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));
        System.out.println(map2);

        System.out.println("\n======== Средняя зарплата по отделам =============\n");
        // Расчет средней зарплаты по отделу
        Map<String, Double> map3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("average: " + map3);

        // Средний возраст по отделу
        Map<String, Double> map4 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getAge)));
        System.out.println("age: " + map4);

        // Группировка сотрудников по отделам.
        // при этом я хочу получить список зарплат в каждом отделе
        Map<String, List<Integer>> map5 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                            Collectors.mapping(Employee::getSalary, Collectors.toList()))
                        );
        System.out.println("список зарплат по отделу: " + map5);

        // Суммарная статистика
        DoubleSummaryStatistics statistics = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("max: " + statistics.getMax());
        System.out.println("min: " + statistics.getMin());
        System.out.println("avg: " + statistics.getAverage());
        System.out.println("count: " + statistics.getCount());
        System.out.println("sum: " + statistics.getSum());
        System.out.println("statistics: " + statistics);

        System.out.println("\n======== Age ============== ");

        IntSummaryStatistics statistics1 = employees.stream()
                .collect(Collectors.summarizingInt(Employee::getAge));

        System.out.println(statistics1.getMax());
        System.out.println(statistics1.getMin());








    }




}
