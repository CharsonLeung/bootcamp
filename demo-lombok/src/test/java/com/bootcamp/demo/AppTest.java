package com.bootcamp.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    
    @Test
    void testApp() {
        assertEquals(1, 1);
        assertEquals(2, 1 + 1);
        assertEquals(2, new Person().add(1, 1));
        assertEquals(3, new Person().add(1, 2));
    }
}
