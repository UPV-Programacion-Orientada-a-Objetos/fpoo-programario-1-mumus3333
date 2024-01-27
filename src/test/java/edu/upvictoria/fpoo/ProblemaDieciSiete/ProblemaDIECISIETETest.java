package edu.upvictoria.fpoo.ProblemaDieciSiete;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaDIECISIETETest {

    @Test
    public void test1() {
        ProblemaDIECISIETE p17 = new ProblemaDIECISIETE();
        double hipotenusa = p17.calcularHipotenusa(3.0, 4.0);
        Assert.assertEquals(5.0, hipotenusa, 0.0);
    }

    @Test
    public void test2() {
        ProblemaDIECISIETE p17 = new ProblemaDIECISIETE();
        double hipotenusa = p17.calcularHipotenusa(5.0, 12.0);
        Assert.assertEquals(13.0, hipotenusa, 0.0);
    }

    @Test
    public void test3() {
        ProblemaDIECISIETE p17 = new ProblemaDIECISIETE();
        double hipotenusa = p17.calcularHipotenusa(7.0, 24.0);
        Assert.assertEquals(25.0, hipotenusa, 0.0);
    }
}