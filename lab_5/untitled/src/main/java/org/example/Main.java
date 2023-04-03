package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * lab 5
 * @author ErmolaevaAnn
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - добавить элемент");
            System.out.println("2 - удалить элемент");
            String choice = scanner.nextLine();
            System.out.println("");
            switch (choice) {
                case "1":
                    addToHashSet(hashSet, scanner);
                    break;
                case "2":
                    removeFromHashSet(hashSet, scanner);
                    break;
                default:
                    System.out.println("Неверно. Введите заново: ");
                    break;
            }
        }
    }

    private static void removeFromHashSet(HashSet<String> hashSet, Scanner scanner) {
        System.out.println("Удалить элемент: ");
        String element = scanner.nextLine();
        hashSet.remove(element);
        System.out.println("Обновленный список элементов: " + hashSet);
    }

    private static void addToHashSet(HashSet<String> hashSet, Scanner scanner) {
        System.out.println("Новый элемент: ");
        String element = scanner.nextLine();
        hashSet.add(element);
        System.out.println("Обновленный список элементов: " + hashSet);
    }
}

