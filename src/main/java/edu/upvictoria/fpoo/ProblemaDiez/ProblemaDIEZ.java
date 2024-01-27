package edu.upvictoria.fpoo.ProblemaDiez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDIEZ {

    public double convertirMetrosAPulgadas(double metros) {
        return metros / 0.0254;
    }

    public void problema10() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double metros, pulgadas;

        System.out.println("DAME LOS METROS DE TELA: ");
        entrada = bufer.readLine();
        metros = Double.parseDouble(entrada);

        pulgadas = metros/0.0254;

        System.out.println("LAS PULGADAS A PEDIR DE TELA SON LAS SIGUIENTES: " + pulgadas);

    }
}
