package edu.upvictoria.fpoo.ProblemaDoce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDOCE {

    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public void problema12() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double base, altura, area;

        System.out.println("DAME LA BASE DEL TRIANGULO:  ");
        entrada = bufer.readLine();
        base = Double.parseDouble(entrada);

        System.out.println("DAME LA ALTURA DEL TRIANGULO:  ");
        entrada = bufer.readLine();
        altura = Double.parseDouble(entrada);

        area = (base*altura)/2;

        System.out.println("EL AREA DEL TRIANGULO ES:  "+area);

    }
}
