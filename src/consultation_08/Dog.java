package consultation_08;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.10.2024
 */
/*
Написать класс Собака (Dog).

Каждая Собака обязательно должна иметь имя и высоту прыжка ++

Должна уметь прыгать и должна уметь тренироваться. ++

За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров ++

Максимальная высота прыжка, которую может натренировать собака, не может быть больше, чем двукратная высота первоначального прыжка. ++

Также должен быть метод взять jumpBarrier.
В параметрах метод принимает высоту барьера.

Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
Если да -> идем тренироваться -> берет барьер
 */

public class Dog {
    private String name;
    private int jumpHeight;
    private final int maxJumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    public boolean jumpBarrier(int barrier) {
        if (jumpHeight >= barrier) {
            // Текущий прыжок позволяет взять барьер. Прыгаем
            jump();
            return true;
        }

        if (maxJumpHeight >= barrier) {
            // Собака может натренироваться
            // Надо тренироваться и потом прыгать

            while (jumpHeight < barrier) {
                train();
            }

            System.out.println("Перепрыгиваю барьер " + barrier + "! Текущий прыжок: " + jumpHeight + " (" + name + ")");
            jump();
            return true;

        } else {
            System.out.println("Барьер высотой " + barrier + " взять не могу! Текущий прыжок: " + jumpHeight + " (" + name + ")");
            return  false;
        }

    }

    public void train() {
        jumpHeight += 10;

        if (jumpHeight > maxJumpHeight) {
            jumpHeight = maxJumpHeight;
        }
    }

    public void jump() {
        System.out.println(name + " -> Jumping...");
    }

    public String toString() {
        return String.format("Dog %s; current jump height is %d", name, jumpHeight);
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
}
