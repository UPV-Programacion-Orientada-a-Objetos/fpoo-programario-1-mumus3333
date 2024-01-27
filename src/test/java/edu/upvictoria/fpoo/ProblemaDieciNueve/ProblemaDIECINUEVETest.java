package edu.upvictoria.fpoo.ProblemaDieciNueve;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaDIECINUEVETest {

    @Test
    public void test1() {
        ProblemaDIECINUEVE p19 = new ProblemaDIECINUEVE();
        double tiempo = p19.calcularTiempo(60.0, 120.0);
        Assert.assertEquals(2.0, tiempo, 0.0);
    }

    @Test
    public void test2() {
        ProblemaDIECINUEVE p19 = new ProblemaDIECINUEVE();
        double tiempo = p19.calcularTiempo(80.0, 200.0);
        Assert.assertEquals(2.5, tiempo, 0.0);
    }

    @Test
    public void test3() {
        ProblemaDIECINUEVE p19 = new ProblemaDIECINUEVE();
        double tiempo = p19.calcularTiempo(100.0, 300.0);
        Assert.assertEquals(3.0, tiempo, 0.0);
    }
}