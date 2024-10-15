package consultation_10.singletone;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    private Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.type = "Triangle";

    }

    public static Triangle createTriangle(double sideA, double sideB, double sideC) {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            return new Triangle(sideA, sideB, sideC);
        }

        return null;
    }



    private boolean isValidSides(){
        return  sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    @Override
    public double area() {
        // sqrt ( p2 * (p2 - a) * (p2 - b) * (p2 - c))
        // Полупериметр
        double p2 = perimeter() / 2;

        double area = Math.sqrt(p2 * (p2 - sideA) * (p2 - sideB) * (p2 - sideC));
        return area;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
