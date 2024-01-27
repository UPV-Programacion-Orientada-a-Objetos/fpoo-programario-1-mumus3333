package edu.upvictoria.fpoo.ProblemaVeintiCuatro;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaVEINTICUATROTest {

    @Test
    public void test1() {
        ProblemaVEINTICUATRO p24 = new ProblemaVEINTICUATRO();
        double ahorroAnual = p24.AnuelAA(100.0);
        Assert.assertEquals(720.0, ahorroAnual, 0.0);
    }

    @Test
    public void test2() {
        ProblemaVEINTICUATRO p24 = new ProblemaVEINTICUATRO();
        double ahorroAnual = p24.AnuelAA(200.0);
        Assert.assertEquals(1440.0, ahorroAnual, 0.0);
    }

    @Test
    public void test3() {
        ProblemaVEINTICUATRO p24 = new ProblemaVEINTICUATRO();
        double ahorroAnual = p24.AnuelAA(300.0);
        Assert.assertEquals(2160.0, ahorroAnual, 0.0);
    }
}