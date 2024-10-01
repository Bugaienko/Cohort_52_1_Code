package consultation_07;

/**
 * @author Sergey Bugaenko
 * {@code @date} 01.10.2024
 */

public class Teacher {
    String name;
    int age;
    String department;
    String[] groups;


    public Teacher(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
        groups = new String[5];
    }

    public void teaching() {
        System.out.println("Teacher " + name + " is teaching");
    }





}
