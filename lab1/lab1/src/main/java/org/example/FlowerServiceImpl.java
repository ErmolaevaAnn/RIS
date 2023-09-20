package org.example;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;

public class FlowerServiceImpl extends UnicastRemoteObject implements FlowerService {
    protected FlowerServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public double calculateBouquetCost(Bouquet bouquet) throws RemoteException {
        return bouquet.getTotalCost();
    }

    public static void main(String[] args) {
        try {
            FlowerService flowerService = new FlowerServiceImpl();
            Naming.rebind("FlowerService", flowerService);
            System.out.println("Сервер RMI запущен.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
