package org.example;

/**
 * дочерний класс Triangle от интерфейса Figure
 *
 * @author Ермолаева А. А.
 */
public class Triangle implements Figure {
    //переменные a, b, c - стороны треугольника
    private double a = 0;
    private double b = 0;
    private double c = 0;

    //метод getSquare рассчитывает площадь треугольника
    @Override
    public double getSquare() {
        return Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }

    // рассчитывает периметр треугольника
    public double getPerimeter() {
        return a + b + c;
    }

    public Triangle(double a, double b, double c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
