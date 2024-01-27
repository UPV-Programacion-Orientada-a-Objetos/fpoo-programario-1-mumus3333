package edu.upvictoria.fpoo.ProblemaQuince;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaQUINCETest {

    @Test
    public void test1() {
        ProblemaQUINCE p15 = new ProblemaQUINCE();
        double cobro = p15.cobramee(3.5);
        Assert.assertEquals(60.0, cobro, 0.0);
    }

    @Test
    public void test2() {
        ProblemaQUINCE p15 = new ProblemaQUINCE();
        double cobro = p15.cobramee(2.25);
        Assert.assertEquals(45.0, cobro, 0.0);
    }

    @Test
    public void test3() {
        ProblemaQUINCE p15 = new ProblemaQUINCE();
        double cobro = p15.cobramee(5.75);
        Assert.assertEquals(90.0, cobro, 0.0);
    }
}