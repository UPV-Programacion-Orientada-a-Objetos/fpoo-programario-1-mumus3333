package edu.upvictoria.fpoo.ProblemaDos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDOS {

    public double p2ts(double calificaciones, double promedio){
        return  promedio = ((calificaciones*promedio)/promedio);
    }

    public void problema2() throws IOException {
        double calificaciones = 0, promedio=4;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;


        System.out.println("DAME LAS CALIFICACIONES DE LAS CUATRO MATERIAS: ");
        entrada = bufer.readLine();
        calificaciones = Double.parseDouble(entrada);

        promedio = ((calificaciones*promedio)/promedio);

        System.out.println("EL PROMEDIO OBTENIDO ES: " +promedio);

    }

}
