package homework_30;

import lesson_30.persons.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.10.2024
 */

public class PersonTestHW {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp(){
        person = new Person(startEmail, startPassword);
    }

    /*
    1. Берем валидный email
    2. Устанавливает сеттером валидный email person-у
    3. Мы ожидаем: что у person в поле email будет валидный email, который мы установили на шаге 2
    4. Проверить равенство person.getEmail() c валидным email, который мы устанавливали
     */

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);
        System.out.println("getEmail: " + person.getEmail());

        Assertions.assertEquals(validEmail, person.getEmail());
    }

    /*
    1. Берем не валидный email
    2. Устанавливаем сеттером не валидный email person-у
    3. Ожидаем результат: Email установлен не будет.
    1) Т.е. значение email у person не будет равно не валидному email
    2) Значение поля email у person останется прежним
    4.
     */

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.ne.t",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "test@mail.?net",
                "@testmail.net",
                "1test@mail.net",
                "_test@mail.net",
                "-t@mail.net",
                ".est@mail.net",
                "test+1@mail.net"

        );
    }


    /*
    Требование к паролю:
1. длина >= 8
2. Должна быть мин 1 цифра
3. Должна быть мин 1 маленькая буква
4. Должна быть мин 1 большая буква
5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)
     */
    @ParameterizedTest
    @ValueSource(strings = {"qwerty1Q!", "1FDSAAAAa$", "sad %Der0", "парольП4%"})
    void testValidPasswordSet(String validPassword) {

//        char ch = 'ы';
//        System.out.println(Character.isAlphabetic(ch));
//        System.out.println(Character.isDigit(ch));
//        System.out.println(Character.isLetter(ch));
//        System.out.println(Character.isLowerCase(ch));

        person.setPassword(validPassword);

        Assertions.assertNotNull(person.getPassword());
        Assertions.assertEquals(validPassword, person.getPassword());
    }



    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    void testInvalidPasswordSet(String invalidPassword) {
        person.setPassword(invalidPassword);
        Assertions.assertNotEquals(invalidPassword, person.getPassword());
        Assertions.assertEquals(startPassword, person.getPassword());
    }

    static Stream<String> invalidPasswordData() {
        return Stream.of(
                "qwer!1Q", // короткий
                "asdfg1%df", // без большой буквы
                "RTRLTR@1", // без маленькой буквы
                "fghrTR@!gg", // без цифры
                "fgtyRRR121" // без спец.символа
        );
    }

    @Disabled
    @Test
    void assertNulEquals(){
        // При сравнеие на равенство null с null - assertEquals выдает true
        String string = null;
        Assertions.assertEquals(null, string);
    }

}

 /*
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки - done
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */