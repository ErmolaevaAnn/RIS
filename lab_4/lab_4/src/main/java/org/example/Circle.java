package org.example;

/**
 * дочерний класс Circle от интерфейса Figure
 *
 * @author Ермолаева А. А.
 */
public class Circle implements Figure {
    private double radius = 0;

    //метод getSquare рассчитывает площадь
    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    //расчет периметра
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
