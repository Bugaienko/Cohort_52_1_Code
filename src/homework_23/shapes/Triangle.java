package homework_23.shapes;

import lesson_21.Passenger;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.type = "Triangle";

        if (!isValidSides()) {
            // Стороны не правильные. Построить такой треугольник невозможно
            System.out.println("Построить треугольник с такими сторонами невозможно");
            // Todo Надо выбросить ошибку или закрыть конструктор
            // ЕУстанавливаем для сторон значения "по умолчанию"
            this.sideA = 3;
            this.sideB = 4;
            this.sideC = 5;
        }

//        if(isValidSides()) {
//            //правда
//        } else {
//            // не правда
//            // Код обработки не верных сторон
//        }
//
//        if( !true ) { // Если не правда
//            // В этом блоке, обрабатываю код, если метод вернул false
//        } else {
//            // Правда
//        }
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
