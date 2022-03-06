package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape {

    double area;
    double perimeter;

    @Override
    void calculateArea(double a) {
        double area = 3.14*a*a;
        System.out.println(area);
    }

    @Override
    void calculatePerimeter(double a) {
        double perimeter = 2*3.14*a;
        System.out.println(perimeter);
    }


}
