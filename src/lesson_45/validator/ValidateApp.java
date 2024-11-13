package lesson_45.validator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.11.2024
 */

public class ValidateApp {

    public static void main(String[] args) {

        // Получаем email от пользователя (Сканером, из другого слоя приложения).
        String email = "te!st@email.com";
        String password = "123456";

        // Валидация email
        try {
            EmailValidator.isEmailValid(email);
            // Если мы дойдем до этой строчки кода,
            // значит email валидный
            System.out.println("Email прошел проверку");
            // User user = new User(email, password)
        } catch (EmailValidateException e) {
            // email не прошел проверку.
            // Запросить у пользователя другой ввод
            System.out.println("Email is not valid");
            String message = e.getMessage();
            System.out.println(message);
        }

        // Когда

    }
}
