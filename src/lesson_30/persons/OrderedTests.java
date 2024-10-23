package lesson_30.persons;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.10.2024
 */

// Порядок запуска тестовых методов в классе будет определяться аннотацией @Order
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(10)
    void firstTest() {
        System.out.println("First Test");
    }

    @Test
    @Order(20)
    void secondTest() {
        System.out.println("Second Test");
    }

    @Test
    @Order(30)
    void thirdTest() {
        System.out.println("Third Test");
    }

    @Test
    @Order(15)
    void betweenTest(){
        System.out.println("Between Test");
    }

    @Test
    void randomTest(){
        System.out.println("Random Test");
    }

    @Test
    void randomTest2(){
        System.out.println("Random Test2");
    }
}
