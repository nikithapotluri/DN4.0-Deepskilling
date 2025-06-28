package com.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        assertEquals(2, 2 + 20);


        assertTrue(3 > 1);


        assertFalse(6 < 1);


        assertNull(null);


        assertNotNull(new Object());
    }
}
