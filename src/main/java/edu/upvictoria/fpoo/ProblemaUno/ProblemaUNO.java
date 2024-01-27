package edu.upvictoria.fpoo.ProblemaUno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaUNO {
    public double suma(double n1, double n2) {
        return n1 + n2;
    }

    public void problema1() throws IOException {
        double total,a,b;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("DAME EL VALOR DEL PRIMER NÚMERO: ");
        entrada = bufer.readLine();
        a = Double.parseDouble(entrada);

        System.out.println("DAME EL VALOR DEL SEGUNDO NÚMERO: ");
        entrada = bufer.readLine();
        b = Double.parseDouble(entrada);

        total = a + b;

        System.out.println("LA SUMA DE LOS DOS NUMEROS ES: " + total);
    }

}
