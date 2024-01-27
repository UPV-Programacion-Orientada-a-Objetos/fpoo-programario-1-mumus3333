package edu.upvictoria.fpoo.ProblemaTrece;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaTRECETest {

    @Test
    public void test1() {
        ProblemaTRECE p13 = new ProblemaTRECE();
        double conversion = p13.calcularConversionDolares(1000, 20);
        Assert.assertEquals(50, conversion, 0.001);
    }

    @Test
    public void test2() {
        ProblemaTRECE p13 = new ProblemaTRECE();
        double conversion = p13.calcularConversionDolares(1500, 25);
        Assert.assertEquals(60, conversion, 0.001);
    }

    @Test
    public void test3() {
        ProblemaTRECE p13 = new ProblemaTRECE();
        double conversion = p13.calcularConversionDolares(2000, 30);
        Assert.assertEquals(66.6667, conversion, 0.001);
    }
}