package edu.upvictoria.fpoo.ProblemaNueve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaNUEVE {

    public double calcularSueldoSemanal(double horas_trabajadas, double sueldo_baseHoras, double dias_trabajados) {
        return horas_trabajadas * sueldo_baseHoras * dias_trabajados;
    }

    public void problema9() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double horas_trabajadas, sueldo_baseHOras, dias_trabajados, total;

        System.out.println("DAME LAS HORAS TRABAJADAS POR DIA: ");
        entrada = bufer.readLine();
        horas_trabajadas = Double.parseDouble(entrada);

        System.out.println("DAME LA CANTIDAD DE DINERO QUE EL TRABAJADOR GANA POR HORA: ");
        entrada = bufer.readLine();
        sueldo_baseHOras = Double.parseDouble(entrada);


        System.out.println("DAME LA CANTIDAD DE DIAS TRABAJADOS A LA SEMANA: ");
        entrada = bufer.readLine();
        dias_trabajados = Double.parseDouble(entrada);


        total = ((horas_trabajadas * sueldo_baseHOras) * dias_trabajados);

        System.out.println("EL SUELDO SEMANAL DEL TRABAJADOR EQUIVALE A: " + total);


    }
}
