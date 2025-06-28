package com.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class SubtractTest {

	@Test
    public void testSubtract() {
        Subtract calc = new Subtract();
        int result = calc.sub(40, 30);
        assertEquals(1, result);
    }

}
