package edu.upvictoria.fpoo.ProblemaVeintiDos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaVEINTIDOS {

    public double calcularPago(double consumoKW, double costoKW) {
        return consumoKW * costoKW;
    }
    public void problema22() throws IOException {

        double pago, consumoKW, costoKW;
        String entrada;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dame el consumo en kilowatts:");
        entrada = bufer.readLine();
        consumoKW=Double.parseDouble(entrada);

        System.out.println("Dame el costo por kilowatt: ");
        entrada = bufer.readLine();
        costoKW=Double.parseDouble(entrada);

        pago = consumoKW * costoKW;

        System.out.println("El pago por el consumo es: " + pago);

    }

    }

