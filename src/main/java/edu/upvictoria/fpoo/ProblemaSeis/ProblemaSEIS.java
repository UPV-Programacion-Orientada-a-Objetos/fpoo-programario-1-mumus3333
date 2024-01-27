package edu.upvictoria.fpoo.ProblemaSeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaSEIS {

    public double calcularAreaFigura(double hipotenusa, double radio) {
        return (((radio * 2) * hipotenusa) / 2) + ((3.1416 * (radio * radio)) / 2);
    }

    public void problema6() throws IOException {

        double area, h, r;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("DAME LA HIPOTENUSA: ");
        entrada = bufer.readLine();
        h = Double.parseDouble(entrada);

        System.out.println("DAME EL RADIO: ");
        entrada = bufer.readLine();
        r = Double.parseDouble(entrada);

        area= (((r*2)*h)/2) + ((3.1416*(r*r))/2);

        System.out.println("AREA DE LA FIGURA: " + area);

    }
}
