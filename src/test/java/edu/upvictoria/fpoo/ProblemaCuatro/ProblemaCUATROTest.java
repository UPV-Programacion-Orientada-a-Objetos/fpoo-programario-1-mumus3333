package edu.upvictoria.fpoo.ProblemaCuatro;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaCUATROTest {

    @Test
    public void test1() {
        ProblemaCUATRO p4 = new ProblemaCUATRO();
        double resultado = p4.calcularAreaCircunferencia(5);

        Assert.assertEquals(78.54, resultado, 0.01);
    }

    @Test
    public void test2() {
        ProblemaCUATRO p4 = new ProblemaCUATRO();
        double resultado = p4.calcularAreaCircunferencia(7.5);

        Assert.assertEquals(176.71, resultado, 0.01);
    }

    @Test
    public void test3() {
        ProblemaCUATRO p4 = new ProblemaCUATRO();
        double resultado = p4.calcularAreaCircunferencia(3);

        Assert.assertEquals(28.27, resultado, 0.01);
    }
}