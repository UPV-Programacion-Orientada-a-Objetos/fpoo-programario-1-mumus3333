package edu.upvictoria.fpoo.ProblemaVeinte;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaVEINTETest {

    @Test
    public void test1() {
        ProblemaVEINTE p20 = new ProblemaVEINTE();
        double total = p20.CostoLLamada(10.0, 0.5);
        Assert.assertEquals(5.0, total, 0.0);
    }

    @Test
    public void test2() {
        ProblemaVEINTE p20 = new ProblemaVEINTE();
        double total = p20.CostoLLamada(15.0, 0.75);
        Assert.assertEquals(11.25, total, 0.0);
    }

    @Test
    public void test3() {
        ProblemaVEINTE p20 = new ProblemaVEINTE();
        double total = p20.CostoLLamada(5.0, 0.3);
        Assert.assertEquals(1.5, total, 0.0);
    }
}