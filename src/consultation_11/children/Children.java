package consultation_11.children;

import java.lang.reflect.Method;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.10.2024
 */

public class Children {
    public static void main(String[] args) throws Exception {

        Parent link = new Child();

        // Не могу вызвать метод класса Child из-за "узкого" типа ссылки
        // link.child();

        // Получить реальный класс объект link
        Class<?> clazz = link.getClass();

        // Получить доступ к методу
        Method method = clazz.getMethod("child", String.class);

        // Вызываем метод child на объекте link
        method.invoke(link, "Пример строки");

    }
}
