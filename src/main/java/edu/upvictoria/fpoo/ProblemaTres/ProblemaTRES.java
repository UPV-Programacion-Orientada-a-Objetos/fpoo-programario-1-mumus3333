package edu.upvictoria.fpoo.ProblemaTres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaTRES {

    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    public void problema3() throws IOException {

        double base =0, altura =0, area=0;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("DAME EL TAMAÑO DE LA BASE: ");
        entrada = bufer.readLine();
       base = Double.parseDouble(entrada);

        System.out.println("DAME LA ALTURA : ");
        entrada = bufer.readLine();
       altura = Double.parseDouble(entrada);


        area = (base*altura);

        System.out.println("EL AREA DEL RECTANGULO ES: "+ area);
    }

    }


