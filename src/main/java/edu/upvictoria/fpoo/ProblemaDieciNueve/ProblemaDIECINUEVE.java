package edu.upvictoria.fpoo.ProblemaDieciNueve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDIECINUEVE {

    public double calcularTiempo(double velocidad, double distancia) {
        return distancia / velocidad;
    }
    public void practica19() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double velocidad, distancia, tiempo;

        System.out.println("DAME LA VELOCIDAD: ");
        entrada = bufer.readLine();
        velocidad = Double.parseDouble(entrada);

        System.out.println("DAME LA DISTANCIA: ");
        entrada = bufer.readLine();
        distancia = Double.parseDouble(entrada);

        tiempo = distancia/velocidad;

        System.out.println("EL TIEMPO DE LA DISTANCIA RECORRIDA ES: " + tiempo);

    }
}
