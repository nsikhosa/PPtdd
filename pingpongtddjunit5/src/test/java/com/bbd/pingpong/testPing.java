package com.bbd.pingpong;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testPing {
    @Test
    public void testNumber1() {
        assertEquals(1,RomanConverter.Convert("I"));
    }
    @Test
    public void testNumber2() {
        assertEquals(2,RomanConverter.Convert("II"));
    }
    @Test
    public void testNumber5() {
        assertEquals(5,RomanConverter.Convert("V"));
    }

    @Test
    public void testToCheckDifferentNumbersAdditive() {
        assertEquals(6,RomanConverter.Convert("VI"));
    }

    @Test
    public void testLowercase10()
    {
        assertEquals(10,RomanConverter.Convert("x"));
    }

    @Test
    public void testNumber10() {
        assertEquals(10,RomanConverter.Convert("X"));
    }
    @Test
    public void testNumber100() {
        assertEquals(100,RomanConverter.Convert("C"));
    }

    @Test
    public void testNumber50() {
        assertEquals(50,RomanConverter.Convert("L"));
    }

    @Test
    public void testNumber605() {
        assertEquals(605,RomanConverter.Convert("DCV"));
    }

    @Test
    public void testNumber500() {
        assertEquals(500,RomanConverter.Convert("D"));
    }

    @Test
    public void testNumber1000() {
        assertEquals(1000,RomanConverter.Convert("M"));
    }
    @Test
    public void testNumber105() {
        assertEquals(105,RomanConverter.Convert("CV"));
    }

    @Test
    public void testToCheckDifferent4() {
        assertEquals(4,RomanConverter.Convert("IV"));
    }

    @Test
    public void testToCheck1000() {
        assertEquals(404,RomanConverter.Convert("CDIV"));
    }

    @Test
    void testNumberOver1000ThrowsException() {
        Throwable exception = assertThrows(RuntimeException.class,
                () -> {
                    RomanConverter.Convert("MI");
                });
        assertEquals("Number over 1000", exception.getMessage());
    }
    @Test
    void testForIlligalCharactersThrowsException() {
        Throwable exception = assertThrows(RuntimeException.class,
                () -> {
                    RomanConverter.Convert("ert");
                });
        assertEquals("Illegal Character", exception.getMessage());
    }
    @Test
    void testForWrongFormat() {
        Throwable exception = assertThrows(RuntimeException.class,
                () -> {
                    RomanConverter.Convert("VIIII");
                });
        assertEquals("Wrong format", exception.getMessage());
    }

}