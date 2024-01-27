package edu.upvictoria.fpoo.ProblemaDieciSiete;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDIECISIETE {

    public double calcularHipotenusa(double a, double b) {
        return Math.sqrt((a * a) + (b * b));
    }

    public void problema17() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double a,b, Hipotenusa;

        System.out.println("DAME EL TAMAÑO DEL CATETO A");
        entrada = bufer.readLine();
        a = Double.parseDouble(entrada);

        System.out.println("DAME EL TAMAÑO DEL CATETO B");
        entrada = bufer.readLine();
        b = Double.parseDouble(entrada);
        Hipotenusa = Math.sqrt((a*a)+(b*b));

        System.out.println("EL TAMAÑO DE LA HIPOTENUSA ES : "+ Hipotenusa);
    }
}
