package jericothcastellar.servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import jericothcastellar.rmi.PerimetroRemoto;
import jericothcastellar.rmi.PerimetroRemotoImpl;

public class Servidor {

    public static void main(String[] args) {

        try {

            Registry registro =
                    LocateRegistry.createRegistry(1099);

            PerimetroRemoto servicio =
                    new PerimetroRemotoImpl();

            registro.rebind(
                    "PerimetroService",
                    servicio);

            System.out.println(
                    "Servidor RMI iniciado correctamente");

            System.out.println(
                    "Servicio registrado: PerimetroService");

        } catch (Exception e) {

            System.out.println(
                    "Error en el servidor: "
                    + e.getMessage());

            e.printStackTrace();
        }
    }
}