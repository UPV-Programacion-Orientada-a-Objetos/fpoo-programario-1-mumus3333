package edu.upvictoria.fpoo.ProblemaTrece;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaTRECE {

    public double calcularConversionDolares(double monedaMexicana, double dolar) {
        return monedaMexicana / dolar;
    }

    public void problema13() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double moneda_mexicana, dolar, conversion;

        System.out.println("DAME LA CANTIDAD DE PESOS MEXICANOS: ");
        entrada = bufer.readLine();
        moneda_mexicana = Double.parseDouble(entrada);

        System.out.println(" DAME EL VALOR DEL DOLAR EN PESOS MEXICANOS: ");
        entrada = bufer.readLine();
        dolar = Double.parseDouble(entrada);

        conversion = (moneda_mexicana/dolar);

        System.out.println(" CANTIDAD DE DOLARES ADQUIRIDOS:  " +conversion);

    }
}
