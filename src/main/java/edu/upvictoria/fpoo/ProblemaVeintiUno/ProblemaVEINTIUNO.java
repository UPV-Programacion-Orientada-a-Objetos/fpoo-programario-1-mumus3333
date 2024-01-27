package edu.upvictoria.fpoo.ProblemaVeintiUno;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVEINTIUNO {

    public double calcularMetrosCubicos(double largo, double ancho, double profundidad) {
        return largo * ancho * profundidad;
    }

    public double calcularLitrosCubicos(double metrosCubicos) {
        return metrosCubicos * 1000;
    }

    public double calcularTotal(double metrosCubicos) {
        return metrosCubicos * 100;
    }


    public void problema21() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double largo, ancho, profundidad, litros_cubicos, metros_cubicos, total;

        System.out.println("DAME EL LARGO DE LA ALBERCA:  ");
        entrada = bufer.readLine();
        largo = Double.parseDouble(entrada);

        System.out.println("DAME EL ANCHO DE LA ALBERCA:  ");
        entrada = bufer.readLine();
        ancho = Double.parseDouble(entrada);

        System.out.println("DAME LA PROFUNDIDAD DE LA ALBERCA:  ");
        entrada = bufer.readLine();
        profundidad = Double.parseDouble(entrada);

        metros_cubicos= (largo*ancho*profundidad);
        litros_cubicos= (largo*ancho*profundidad) * 1000;

        System.out.println("METROS CUBICOS DE AGUA:  " + metros_cubicos);
        System.out.println("LITROS CUBICOS DE AGUA:  " + litros_cubicos);

        total=(metros_cubicos*100);

        System.out.println("CANTIDAD A PAGAR:  " + total);

    }
}
