package edu.upvictoria.fpoo.ProblemaDieciOcho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaDIECIOCHO {

    public double costo_boleto(double km, double costo_km) {
        return km * costo_km;
    }

    public void practica18() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double total, km, costo_km;

        System.out.println("DAME LOS KM POR RECORRER: ");
        entrada = bufer.readLine();
        km = Double.parseDouble(entrada);

        System.out.println("DAME EL COSTO POR KM: ");
        entrada = bufer.readLine();
        costo_km = Double.parseDouble(entrada);

        total = km*costo_km;

        System.out.println("EL COSTO DEL BOLETO DE UN VIAJE SENCILLO ES: "+ total);
    }
}
