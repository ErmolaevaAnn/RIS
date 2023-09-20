package org.example;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FlowerService extends Remote {
    double calculateBouquetCost(Bouquet bouquet) throws RemoteException;
}