package com.itacademy.java.oop.basics.task1;

public class Square extends Shape {

    double area;
    double perimeter;

    @Override
    void calculateArea(double a) {
        double area = a*a;
        System.out.println(area);
    }

    @Override
    void calculatePerimeter(double a) {
        double perimeter = 4*a;
        System.out.println(perimeter);
    }


}
