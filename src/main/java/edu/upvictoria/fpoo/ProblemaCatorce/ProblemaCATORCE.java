package edu.upvictoria.fpoo.ProblemaCatorce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProblemaCATORCE {

    public int calcularEdad(String fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ISO_LOCAL_DATE);
        Period periodo = Period.between(fechaNac, fechaActual);
        return Math.abs(periodo.getYears());
    }

    public void problema14() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        String año_actual, año_born;

        System.out.println("DAME TU FECHA DE NACIMIENTO:");
        entrada = bufer.readLine();
        año_born = entrada;

        LocalDate fecha_actual = LocalDate.now();//Obtenemos la fecha de actual de la computadora

        LocalDate fecha_born= LocalDate.parse(año_born, DateTimeFormatter.ISO_LOCAL_DATE);//Obtenemos la fecha de nacimiento y le da el formato de fecha al texto que inregsamos

        Period interseccion_fechas = Period.between(fecha_actual, fecha_born); //con between obtenemos el periodo entre las fechas
        int edad = Math.abs(interseccion_fechas.getYears());//aqui solo estamos pidiendo los años del periodo para que no nos de los dias y los meses

        System.out.println("TIENES " +edad +" AÑOS DE EDAD");

    }
}
