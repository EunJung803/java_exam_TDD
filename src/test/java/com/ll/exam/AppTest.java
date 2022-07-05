package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기() {
        int rs = Calculator.run("1 + 1");

        assertEquals(2, rs);
    }

    @Test
    public void 더하기2() {
        int rs = Calculator.run("1 + 2");

        assertEquals(3, rs);
    }


    @Test
    public void 빼기() {
        int rs = Calculator.run("1 - 2");

        assertEquals(-1, rs);
    }

    @Test
    public void 곱하기() {
        int rs = Calculator.run("1 * 2");

        assertEquals(2, rs);
    }

    @Test
    public void 나누기() {
        int rs = Calculator.run("4 / 2");

        assertEquals(2, rs);
    }

    @Test
    public void 더하기3() {
        int rs = Calculator.run("1 + 2 + 3");

        assertEquals(6, rs);
    }

    @Test
    public void 더하기_곱하기() {
        int rs = Calculator.run("1 + 2 * 3");

        assertEquals(7, rs);
    }

    @Test
    public void 괄호계산() {
        int rs = Calculator.run("(1 + 2) * 3");

        assertEquals(9, rs);
    }
}
