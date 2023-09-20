package org.example;
import java.io.Serializable;
public class Flowers implements Serializable {
    private String name;
    private double price;

    public Flowers(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
