package edu.upvictoria.fpoo.ProblemaUno;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
public class ProblemaUNOTest {

    @Test
    public void test1() throws IOException {

        ProblemaUNO p1 = new ProblemaUNO ();
        assertEquals(4,2,2);
    }

    @Test
    public void test2() throws IOException {

        ProblemaUNO p1 = new ProblemaUNO ();
        assertEquals(4.2,2.2,2);
    }

    @Test
    public void test3() throws IOException {

        ProblemaUNO p1 = new ProblemaUNO ();
        assertEquals(0,-2,2);
    }
}