package edu.upvictoria.fpoo.ProblemaDiez;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaDIEZTest {

    @Test
    public void test1() {
        ProblemaDIEZ p10 = new ProblemaDIEZ();
        double resultado = p10.convertirMetrosAPulgadas(10);
        Assert.assertEquals(393.701, resultado, 0.001);
    }

    @Test
    public void test2() {
        ProblemaDIEZ p10 = new ProblemaDIEZ();
        double resultado = p10.convertirMetrosAPulgadas(5);
        Assert.assertEquals(196.85, resultado, 0.001);
    }

    @Test
    public void test3() {
        ProblemaDIEZ p10 = new ProblemaDIEZ();
        double resultado = p10.convertirMetrosAPulgadas(20);
        Assert.assertEquals(787.402, resultado, 0.001);
    }
}