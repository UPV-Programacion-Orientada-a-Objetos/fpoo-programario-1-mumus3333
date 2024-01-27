package edu.upvictoria.fpoo.ProblemaQuince;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaQUINCE {

    public double cobramee (double horas) {
        double tarifa = 15.0;
        return Math.ceil(horas) * tarifa;
    }

    public void problema15() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double tarifa = 15, horas, cobro;


        System.out.println("Ingrese la cantidad de horas que utilizó el estacionamiento:");
        entrada = bufer.readLine();
        horas = Double.parseDouble(entrada);

        cobro = (int) Math.ceil(horas) * tarifa;

        System.out.println("El cobro por utilizar el estacionamiento durante " + horas + " horas es: $" + cobro);
    }
}

