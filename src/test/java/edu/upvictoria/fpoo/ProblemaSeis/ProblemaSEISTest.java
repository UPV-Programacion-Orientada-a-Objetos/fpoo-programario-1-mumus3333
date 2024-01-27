package edu.upvictoria.fpoo.ProblemaSeis;


import org.junit.Assert;
import org.junit.Test;

public class ProblemaSEISTest {

    @Test
    public void test1() {
        ProblemaSEIS p6 = new ProblemaSEIS();
        double resultado = p6.calcularAreaFigura(5, 3);

        Assert.assertEquals(29.0, Math.round(resultado), 0);
    }

    @Test
    public void test2() {
        ProblemaSEIS p6 = new ProblemaSEIS();
        double resultado = p6.calcularAreaFigura(7.5, 4);

        Assert.assertEquals(55, Math.round(resultado), 0);
    }

    @Test
    public void test3() {
        ProblemaSEIS p6 = new ProblemaSEIS();
        double resultado = p6.calcularAreaFigura(3, 2.5);

        Assert.assertEquals(17, Math.round(resultado), 0);
    }
}
