package edu.upvictoria.fpoo.ProblemaNueve;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaNUEVETest {

    @Test
    public void test1() {
        ProblemaNUEVE p9 = new ProblemaNUEVE();
        double resultado = p9.calcularSueldoSemanal(8, 10, 5);
        Assert.assertEquals(400.0, resultado, 0.001);
    }

    @Test
    public void test2() {
        ProblemaNUEVE p9 = new ProblemaNUEVE();
        double resultado = p9.calcularSueldoSemanal(7, 12, 6);
        Assert.assertEquals(504.0, resultado, 0.001);
    }

    @Test
    public void test3() {
        ProblemaNUEVE p9 = new ProblemaNUEVE();
        double resultado = p9.calcularSueldoSemanal(6, 15, 4);
        Assert.assertEquals(360.0, resultado, 0.001);
    }
}