package edu.upvictoria.fpoo.ProblemaDos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaDOSTest {


    @Test
    public void test1() {
        ProblemaDOS p2 = new ProblemaDOS();
        double resultado = p2.p2ts(100, 4);

        Assert.assertEquals(100, resultado, 0.001);
    }

    @Test
    public void test2() {
        ProblemaDOS p2 = new ProblemaDOS();
        double resultado = p2.p2ts(95, 4);

        Assert.assertEquals(95, resultado, 0.001);
    }

    @Test
    public void test3() {
        ProblemaDOS p2 = new ProblemaDOS();
        double resultado = p2.p2ts(95.5, 4);

        Assert.assertEquals(95.5, resultado, 0.001);
    }

}