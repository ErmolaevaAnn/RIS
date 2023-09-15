package org.example;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Bouquet implements Serializable {
    private List<Flowers> flowers = new ArrayList<>();
    private double accessoryCost;

    public void addFlower(Flowers flower) {
        flowers.add(flower);
    }

    public void addAccessoryCost(double cost) {
        accessoryCost += cost;
    }

    public double getTotalCost() {
        double flowerCost = flowers.stream().mapToDouble(Flowers::getPrice).sum();
        return flowerCost + accessoryCost;
    }
}
