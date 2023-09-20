package org.example;
import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            FlowerService flowerService = (FlowerService) Naming.lookup("rmi://localhost/FlowerService");

            Flowers rose = new Flowers("Rose", 5.0);
            Flowers tulip = new Flowers("Tulip", 3.0);

            Bouquet bouquet = new Bouquet();
            bouquet.addFlower(rose);
            bouquet.addFlower(tulip);
            bouquet.addAccessoryCost(2.0);

            double totalCost = flowerService.calculateBouquetCost(bouquet);
            System.out.println("Общая стоимость букета на сервере: " + totalCost);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}