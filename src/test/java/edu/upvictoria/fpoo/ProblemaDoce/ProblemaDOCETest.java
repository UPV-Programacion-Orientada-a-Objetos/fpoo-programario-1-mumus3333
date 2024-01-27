package edu.upvictoria.fpoo.ProblemaDoce;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaDOCETest {

    @Test
    public void test1() {
        ProblemaDOCE p12 = new ProblemaDOCE();
        double area = p12.calcularAreaTriangulo(5, 4);
        Assert.assertEquals(10, area, 0.001);
    }

    @Test
    public void test2() {
        ProblemaDOCE p12 = new ProblemaDOCE();
        double area = p12.calcularAreaTriangulo(7, 3);
        Assert.assertEquals(10.5, area, 0.001);
    }

    @Test
    public void test3() {
        ProblemaDOCE p12 = new ProblemaDOCE();
        double area = p12.calcularAreaTriangulo(8, 6);
        Assert.assertEquals(24, area, 0.001);
    }
}