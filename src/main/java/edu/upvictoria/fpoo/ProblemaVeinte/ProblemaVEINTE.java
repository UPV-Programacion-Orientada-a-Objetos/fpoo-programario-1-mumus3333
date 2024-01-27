package edu.upvictoria.fpoo.ProblemaVeinte;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaVEINTE {

    public double CostoLLamada(double a, double b) {
        return a*b;
    }

    public void problema20() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double tiem_llamada, costo_minuto, total;

        System.out.println("DAME LA DURACIÓN DE LA LLAMADA EN MINUTOS: ");
        entrada = bufer.readLine();
        tiem_llamada = Double.parseDouble(entrada);

        System.out.println("DAME EL COSTO POR MINUTO: ");
        entrada = bufer.readLine();
        costo_minuto = Double.parseDouble(entrada);

        total = costo_minuto*tiem_llamada;

        System.out.println("EL COSTO DE LA LLAMADA ACIENDE A : " + total);

    }
}
