package lesson_17.objetsArray;

/**
 * @author Sergey Bugaenko
 * {@code @date} 02.10.2024
 */

public class PersonsApp {
    public static void main(String[] args) {

        Person garry = new Person("Garry", 31, "Photo");

        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Reading, music");

        System.out.println(john.toString());

        Person[] peoples = new Person[5];

        peoples[0] = garry;
        peoples[3] = john;
        peoples[1] = new Person("Tom", 5, "crying");

        System.out.println("=============== \n");

        System.out.println(peoples[0].toString());
        System.out.println("peoples[0].getName(): " + peoples[0].getName());

        peoples[0].setName("Peter");
        System.out.println("peoples[0]: " + peoples[0].toString());
        System.out.println("garry: " + garry.toString());


        System.out.println("\n ======================== For ============= \n");

        for (int i = 0; i < peoples.length; i++) {
            if (peoples[i] != null) {
                System.out.println(peoples[i].toString());
                System.out.println("peoples[i].getName(): " + peoples[i].getName());
            } else {
                System.out.println("Null!!!");
            }
        }

        System.out.println("==========================\n");
        Person test = new Person("Test", 50, "coding");
        peoples[2] = test;

        peoples[2].setName("Test1");
        test.setAge(52);
        System.out.println(test.toString());

        test = null;
        System.out.println("peoples[2].getHobby(): " + peoples[2].getHobby());

        test = peoples[1];


    }
}
