package lesson_42;

import java.util.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.11.2024
 */

public class PersonApp {

    public static void main(String[] args) {

        Person person = new Person("Max", 25, "Java developer");
        Person person1 = new Person("John", 45, "SEO");
        Person person2 = new Person("Hanna", 18, "tester");
        Person person3 = new Person("Julia", 23, "HR");
        Person person4 = new Person("Sebastian", 50, "Cleaner");

        Map<Integer, Person> mapPersons = new HashMap<>();

        mapPersons.put(person.getId(), person);
        mapPersons.put(person1.getId(), person1);
        mapPersons.put(person2.getId(), person2);
        mapPersons.put(person3.getId(), person3);
        mapPersons.put(person4.getId(), person4);

        System.out.println(mapPersons);

        // Из какой-то части приложения (например из слоя view приходит id person.
        // И мне нужно его найти в моем "хранилище"
        int id = 3;

        Person personFromMap = mapPersons.get(id);
        System.out.println(personFromMap);

        System.out.println(mapPersons.get(1000));



        // Есть метод, нужно выдать список персонов с возрастом больше 25

        List<Person> personsByAge = new ArrayList<>();

        Collection<Person> people = mapPersons.values();

        for (Person p : people) {
            if (p.getAge() > 25) {
                personsByAge.add(p);
            }
        }

        // возвращаю заполненную коллекцию
        System.out.println("personsByAge: " + personsByAge);




    }


}
