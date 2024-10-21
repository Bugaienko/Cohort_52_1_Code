package lesson_28.equals;


import java.util.Objects;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.10.2024
 */

public class Employee {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Ссылки ссылаются на один и тот же объект
        if (!(obj instanceof Employee)) return false; // Проверка на возможность привести к Employee
        Employee employee = (Employee) obj;

        // При таком сравнение возможно появление NPE
        // firstName.equals(employee.firstName);
        // null.equals(employee.firstName); -> аварийное завершение программы
        // Objects.equals(null, employee.firstName) -> просто вернет false

        // При сравнении любого объекта с null должно возвращаться false

        // Безопасное сравнение объектов, учитывая возможность null значений
        return Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(dateOfBirth, employee.dateOfBirth);
    }




    @Override
    public int hashCode() {
        int result = Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
