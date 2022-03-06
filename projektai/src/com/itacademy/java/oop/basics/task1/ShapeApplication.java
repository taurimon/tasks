package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {
    public static void main(String[] args) {
        Shape square = new Square();
        square.calculatePerimeter(5);
        square.calculateArea(5);

        Shape circle = new Circle();

        circle.calculateArea(3);
        circle.calculatePerimeter(4);



    }
}
