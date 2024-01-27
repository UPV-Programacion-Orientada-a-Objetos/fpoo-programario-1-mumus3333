package edu.upvictoria.fpoo.ProblemaOcho;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaOCHOTest {

    @Test
    public void test1() {
        ProblemaOCHO p8 = new ProblemaOCHO();
        double resultado = p8.calcularDistancia(3, 4);
        Assert.assertEquals(5.0, resultado, 0.001);
    }

    @Test
    public void test2() {
        ProblemaOCHO p8 = new ProblemaOCHO();
        double resultado = p8.calcularDistancia(5, 12);
        Assert.assertEquals(13.0, resultado, 0.001);
    }

    @Test
    public void test3() {
        ProblemaOCHO p8 = new ProblemaOCHO();
        double resultado = p8.calcularDistancia(7, 24);
        Assert.assertEquals(25.0, resultado, 0.001);
    }
}