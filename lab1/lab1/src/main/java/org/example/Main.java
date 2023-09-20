package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Flowers rose = new Flowers("Rose", 9.0);
        Flowers tulip = new Flowers("Tulip", 7.0);

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rose);
        bouquet.addFlower(tulip);
        bouquet.addAccessoryCost(5.0);

        // Сериализация объекта
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("bouquet.ser"))) {
            outputStream.writeObject(bouquet);
            System.out.println("Serialization completed");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация объекта
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("bouquet.ser"))) {
            Bouquet deserializedBouquet = (Bouquet) inputStream.readObject();
            System.out.println("Deserialization completed");
            System.out.println("Total cost: " + deserializedBouquet.getTotalCost());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}