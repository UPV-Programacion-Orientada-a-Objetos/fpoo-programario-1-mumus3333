package edu.upvictoria.fpoo.ProblemaDieciSeis;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDIECISEIS {

    public double calcularm2(double largo, double ancho, double costo) {
        double m2 = largo * ancho;
        return m2 * costo;
    }

    public void problema16() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double largo, ancho, costo, total, m2;

        System.out.println("Dame el ancho en metros: ");
        entrada = bufer.readLine();
        ancho = Double.parseDouble(entrada);

        System.out.println("Dame el largo en metros: ");
        entrada = bufer.readLine();
        largo = Double.parseDouble(entrada);

        m2 = largo*ancho;

        System.out.println("CANTIDAD DE METROS CUADRADOS: "+ m2);

        System.out.println("Dame el costo del metro cuadrado: ");
        entrada = bufer.readLine();
        costo = Double.parseDouble(entrada);

        total = costo*m2;

        System.out.println("TOTAL A COBRAR:  "+ total);
    }
}
