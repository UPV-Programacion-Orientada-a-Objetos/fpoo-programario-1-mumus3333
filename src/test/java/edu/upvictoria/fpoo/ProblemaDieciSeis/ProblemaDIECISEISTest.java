package edu.upvictoria.fpoo.ProblemaDieciSeis;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaDIECISEISTest {

    @Test
    public void test1() {
        ProblemaDIECISEIS p16 = new ProblemaDIECISEIS();
        double total = p16.calcularm2(10.0, 15.0, 20.0);
        Assert.assertEquals(3000.0, total, 0.0);
    }

    @Test
    public void test2() {
        ProblemaDIECISEIS p16 = new ProblemaDIECISEIS();
        double total = p16.calcularm2(20.5, 30.0, 25.0);
        Assert.assertEquals(15375.0, total, 0.0);
    }

    @Test
    public void test3() {
        ProblemaDIECISEIS p16 = new ProblemaDIECISEIS();
        double total = p16.calcularm2(15.75, 12.25, 18.0);
        Assert.assertEquals(3472.875, total, 0.0);
    }
}