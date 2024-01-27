package edu.upvictoria.fpoo.ProblemaVeintiTres;

import junit.framework.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class ProblemaVEINTITRESTest {

    @Test
    public void test1() {
        ProblemaVEINTITRES p23 = new ProblemaVEINTITRES();
        double total = p23.calcularTotal(100.0);
        Assert.assertEquals(95.0, total, 0.0);
    }

    @Test
    public void test2() {
        ProblemaVEINTITRES p23 = new ProblemaVEINTITRES();
        double total = p23.calcularTotal(50.0);
        Assert.assertEquals(47.5, total, 0.0);
    }

    @Test
    public void test3() {
        ProblemaVEINTITRES p23 = new ProblemaVEINTITRES();
        double total = p23.calcularTotal(200.0);
        Assert.assertEquals(190.0, total, 0.0);
    }
}