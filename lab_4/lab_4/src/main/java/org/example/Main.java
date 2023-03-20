package org.example;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println(circle.getSquare());
        System.out.println(circle.getPerimeter());
        System.out.println();

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.getPerimeter());
        System.out.println();

        Triangle triangle = new Triangle(2, 5, 4);
        System.out.println(triangle.getSquare());
        System.out.println(triangle.getPerimeter());
        System.out.println();

        Ellipse ellipse = new Ellipse(10, 10);
        System.out.println(ellipse.getSquare());
        System.out.println(ellipse.getPerimeter());
        System.out.println();

    }
}