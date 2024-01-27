package edu.upvictoria.fpoo.ProblemaCinco;


import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaCINCOTest {
    @Test
    public void test1() {
        ProblemaCINCO p5 = new ProblemaCINCO();
        double resultado = p5.calcularAreaFigura(5, 10);

        assertEquals(75, resultado, 0.01);
    }

    @Test
    public void test2() {
        ProblemaCINCO p5 = new ProblemaCINCO();
        double resultado = p5.calcularAreaFigura(7.5, 8);

        assertEquals(90, resultado, 0.01);
    }



}