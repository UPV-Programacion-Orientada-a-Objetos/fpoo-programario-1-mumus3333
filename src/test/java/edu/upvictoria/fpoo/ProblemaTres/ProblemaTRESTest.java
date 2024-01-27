package edu.upvictoria.fpoo.ProblemaTres;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemaTRESTest {


        @Test
        public void test1() {
            ProblemaTRES p3 = new ProblemaTRES();
            double resultado = p3.calcularArea(5, 10);

            assertEquals(50, resultado, 0.001);
        }

        @Test
        public void test2() {
            ProblemaTRES p3 = new ProblemaTRES();
            double resultado = p3.calcularArea(7.5, 8);

            assertEquals(60, resultado, 0.001);
        }

        @Test
        public void test3() {
            ProblemaTRES p3 = new ProblemaTRES();
            double resultado = p3.calcularArea(3, 4.5);

            assertEquals(13.5, resultado, 0.001);
        }
    }
