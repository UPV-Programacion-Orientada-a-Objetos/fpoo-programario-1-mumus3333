package edu.upvictoria.fpoo.ProblemaSiete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaSIETE {

    public double calcularGanancia(double litros, double precio_litro) {
        double galones = litros / 3.785;
        return precio_litro * galones;
    }

    public void problema7() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double litros, precio_litro, galones, total;

        System.out.println("DAME EL TOTAL DE LITROS PRODUCIDOS AL DIA: ");
        entrada = bufer.readLine();
        litros = Double.parseDouble(entrada);

        System.out.println("-----------------------------------------------------------");

        galones = (litros/3.785);

        System.out.println( litros + " Litros de leche equivalen a " + galones + " Galones de leche");
        System.out.println("-----------------------------------------------------------");

        System.out.println("DAME EL PRECIO DEL GALON:  ");
        entrada = bufer.readLine();
        precio_litro= Double.parseDouble(entrada);

        total = (precio_litro*galones);

        System.out.println("LA VENTA DE LOS " + litros+ " LITROS DE LECHE A GENERADO UNA GANANCIA DE: " + total + "EN MONEDA NACIONAL");



    }
}
