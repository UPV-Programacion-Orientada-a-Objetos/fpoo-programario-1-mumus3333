package edu.upvictoria.fpoo.ProblemaVeintiCinco;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaVEINTICINCOTest {

    @Test
    public void test1() {
        ProblemaVEINTICINCO p25 = new ProblemaVEINTICINCO();
        double costoTotal = p25.Pacas_billetes(5, 80.0, 25.0);
        Assert.assertEquals(1025.0, costoTotal, 0.0);
    }

    @Test
    public void test2() {
        ProblemaVEINTICINCO p25 = new ProblemaVEINTICINCO();
        double costoTotal = p25.Pacas_billetes(7, 120.0, 35.0);
        Assert.assertEquals(1785.0, costoTotal, 0.0);
    }

    @Test
    public void test3() {
        ProblemaVEINTICINCO p25 = new ProblemaVEINTICINCO();
        double costoTotal = p25.Pacas_billetes(3, 100.0, 30.0);
        Assert.assertEquals(690.0, costoTotal, 0.0);
    }
}