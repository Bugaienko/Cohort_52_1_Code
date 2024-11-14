package homework_45.validator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.11.2024
 */

public class PasswordValidateException extends Exception{

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception | " + super.getMessage();
    }
}
