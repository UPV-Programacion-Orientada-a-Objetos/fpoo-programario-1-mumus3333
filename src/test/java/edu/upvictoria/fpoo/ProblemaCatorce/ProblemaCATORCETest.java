package edu.upvictoria.fpoo.ProblemaCatorce;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaCATORCETest {

    @Test
    public void test1() {
        ProblemaCATORCE p14 = new ProblemaCATORCE();
        int edad = p14.calcularEdad("1990-01-01");
        Assert.assertEquals(34, edad);
    }

    @Test
    public void test2() {
        ProblemaCATORCE p14 = new ProblemaCATORCE();
        int edad = p14.calcularEdad("1985-05-15");
        Assert.assertEquals(38, edad);
    }

    @Test
    public void test3() {
        ProblemaCATORCE p14 = new ProblemaCATORCE();
        int edad = p14.calcularEdad("2000-12-31");
        Assert.assertEquals(23, edad);
    }
}