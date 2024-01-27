package edu.upvictoria.fpoo.ProblemaOcho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaOCHO {

    public double calcularDistancia(double distancia_x, double distancia_y) {
        return Math.sqrt((distancia_x * distancia_x) + (distancia_y * distancia_y));
    }

    public void problema8() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double distancia_x, distancia_y, distancia_p;

        System.out.println("DAME LA DISTANIA ENTRE EL PUNTO X1 - X2");
        entrada = bufer.readLine();
        distancia_x = Double.parseDouble(entrada);

        System.out.println("DAME LA DISTANIA ENTRE EL PUNTO Y1 - Y2");
        entrada = bufer.readLine();
        distancia_y = Double.parseDouble(entrada);
        distancia_p = Math.sqrt((distancia_x*distancia_x)+(distancia_y*distancia_y));

        System.out.println("LA DISTANICA ENTRE P1 - P2 ES: "+ distancia_p);
    }
}
