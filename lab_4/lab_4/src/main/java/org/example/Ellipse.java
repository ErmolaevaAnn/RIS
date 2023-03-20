package org.example;

/**
 * дочерний класс Ellipse от интерфейса Figure
 *
 * @author Ермолаева А. А.
 */
public class Ellipse implements Figure {
    //переменные a, b - полуоси эллипса
    private double b = 0;
    private double a = 0;

    //метод getSquare рассчитывает площадь
    @Override
    public double getSquare() {
        return Math.PI * b * a;
    }

    //расчет периметра
    public double getPerimeter() {
        return 4 * ((Math.PI * a * b + (a - b)) / (a + b));
    }

    public Ellipse(double b, double a) {
        this.b = b;
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double h) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
