package edu.upvictoria.fpoo.ProblemaOnce;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaONCETest {

    public void test1() {
        ProblemaONCE p11 = new ProblemaONCE();
        double metrosCubicos = p11.calcularMetrosCubicos(10, 5, 2);
        double litrosCubicos = p11.calcularLitrosCubicos(metrosCubicos);
        double total = p11.calcularTotal(metrosCubicos);

        Assert.assertEquals(100, metrosCubicos, 0.001);
        Assert.assertEquals(100000, litrosCubicos, 0.001);
        Assert.assertEquals(10000, total, 0.001);
    }

    @Test
    public void test2() {
        ProblemaONCE p11 = new ProblemaONCE();
        double metrosCubicos = p11.calcularMetrosCubicos(15, 6, 3);
        double litrosCubicos = p11.calcularLitrosCubicos(metrosCubicos);
        double total = p11.calcularTotal(metrosCubicos);

        Assert.assertEquals(270, metrosCubicos, 0.001);
        Assert.assertEquals(270000, litrosCubicos, 0.001);
        Assert.assertEquals(27000, total, 0.001);
    }

    @Test
    public void test3() {
        ProblemaONCE p11 = new ProblemaONCE();
        double metrosCubicos = p11.calcularMetrosCubicos(20, 8, 4);
        double litrosCubicos = p11.calcularLitrosCubicos(metrosCubicos);
        double total = p11.calcularTotal(metrosCubicos);

        Assert.assertEquals(640, metrosCubicos, 0.001);
        Assert.assertEquals(640000, litrosCubicos, 0.001);
        Assert.assertEquals(64000, total, 0.001);
    }
}