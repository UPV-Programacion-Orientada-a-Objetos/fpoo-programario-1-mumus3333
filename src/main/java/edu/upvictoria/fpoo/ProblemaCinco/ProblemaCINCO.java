package edu.upvictoria.fpoo.ProblemaCinco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCINCO {

    public double calcularAreaFigura(double base, double altura) {
        return (base * altura) + ((base * altura) / 2);
    }

    public void problema5() throws IOException {
        double b, a, area;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;


        System.out.println("DAME LA ALTURA MAXIMA DE LA FIGURA: ");
        entrada = bufer.readLine();
        a = Double.parseDouble(entrada);

        System.out.println("DAME LA BASE DE LA FIGURA: ");
        entrada = bufer.readLine();
        b = Double.parseDouble(entrada);

        area = (b*a)+((b*a)/2);

        System.out.println("EL AREA DE LA FIGURA = " + area);
    }
}
