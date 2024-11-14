package homework_45.validator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.11.2024
 */

public class ValidateApp {

    public static void main(String[] args) {

        // Получаем email от пользователя (Сканером, из другого слоя приложения).
        String email = "test@email.com";
        String password = "qwertyqwwq";

        // Валидация email
        try {
            UserValidator.isEmailValid(email);
            // Если мы дойдем до этой строчки кода,
            // значит email валидный
            System.out.println("Email прошел проверку");

            // Если email прошел проверку - проверяем пароль (если email не прошел, то пароль, возможно, проверять не нужно)
            // Базовая валидация.
//            UserValidator.isPasswordValid(password);

            //Вариант 2
            UserValidator2.isPasswordValid(password);

            System.out.println("Пароль прошел валидацию");

            // Можем создать пользователя, с проверенным email и паролем
            // User user = new User(email, password)
            //service.createUser(email, password);
        } catch (EmailValidateException e) {
            // email не прошел проверку.
            // Запросить у пользователя другой ввод
            System.out.println("Email is not valid");
            String message = e.getMessage();
            System.out.println(message);
        } catch (PasswordValidateException ex) {
            // Пароль не прошел проверку (возник объект исключения
            System.out.println("Password is not valid");
            System.out.println(ex.getMessage());
        }

        // Когда

    }
}
