package edu.upvictoria.fpoo.ProblemaSiete;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaSIETETest {

    @Test
    public void test1() {
        ProblemaSIETE p7 = new ProblemaSIETE();
        double resultado = p7.calcularGanancia(100, 10);
        Assert.assertEquals(264.200, resultado, 0.001);
    }

    @Test
    public void test2() {
        ProblemaSIETE p7 = new ProblemaSIETE();
        double resultado = p7.calcularGanancia(50, 5);
        Assert.assertEquals(66.050, resultado, 0.001);
    }

    @Test
    public void test3() {
        ProblemaSIETE p7 = new ProblemaSIETE();
        double resultado = p7.calcularGanancia(200, 8);
        Assert.assertEquals(422.721, resultado, 0.001);
    }

}