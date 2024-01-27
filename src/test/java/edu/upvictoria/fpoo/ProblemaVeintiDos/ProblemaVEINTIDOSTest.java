package edu.upvictoria.fpoo.ProblemaVeintiDos;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaVEINTIDOSTest {
    @Test
    public void test1() {
        ProblemaVEINTIDOS p22 = new ProblemaVEINTIDOS();
        double pago = p22.calcularPago(100, 0.5);
        Assert.assertEquals(50.0, pago, 0.0);
    }


}