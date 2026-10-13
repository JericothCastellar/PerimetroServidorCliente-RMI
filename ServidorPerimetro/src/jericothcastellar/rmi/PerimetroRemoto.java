package jericothcastellar.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PerimetroRemoto extends Remote {

    double calcularPerimetro(double largo,
                             double ancho)
            throws RemoteException;
}