package org.example;

/**
 * дочерний класс Rectangle от интерфейса Figure
 *
 * @author Ермолаева А. А.
 */
public class Rectangle implements Figure {
    private double a1 = 0;
    private double a2 = 0;

    //метод getSquare рассчитывает площадь
    @Override
    public double getSquare() {
        return a1 * a2;
    }

    //расчет периметра
    public double getPerimeter() {
        return 2 * (a1 + a2);
    }

    public Rectangle(double a1, double a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }
}
