package edu.upvictoria.fpoo.ProblemaDieciOcho;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaDIECIOCHOTest {

    @Test
    public void test1() {
        ProblemaDIECIOCHO p18 = new ProblemaDIECIOCHO();
        double costoTotal = p18.costo_boleto(100.0, 10.0);
        Assert.assertEquals(1000.0, costoTotal, 0.0);
    }

    @Test
    public void test2() {
        ProblemaDIECIOCHO p18 = new ProblemaDIECIOCHO();
        double costoTotal = p18.costo_boleto(150.0, 8.5);
        Assert.assertEquals(1275.0, costoTotal, 0.0);
    }

    @Test
    public void test3() {
        ProblemaDIECIOCHO p18 = new ProblemaDIECIOCHO();
        double costoTotal = p18.costo_boleto(75.5, 12.25);
        Assert.assertEquals(924.875, costoTotal, 0.0);
    }
}