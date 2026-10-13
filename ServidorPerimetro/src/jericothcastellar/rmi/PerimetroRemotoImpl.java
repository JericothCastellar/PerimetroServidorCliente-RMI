package jericothcastellar.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PerimetroRemotoImpl
        extends UnicastRemoteObject
        implements PerimetroRemoto {

    public PerimetroRemotoImpl()
            throws RemoteException {
        super();
    }

    @Override
    public double calcularPerimetro(double largo,
                                    double ancho)
            throws RemoteException {

        return 2 * (largo + ancho);
    }
}