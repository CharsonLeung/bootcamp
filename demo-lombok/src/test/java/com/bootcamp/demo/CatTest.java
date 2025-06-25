package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CatTest {
  @Test
  void testCatGetter() {
    // getter
    Cat c1 = new Cat("John", 13);
    assertEquals(13, c1.getAge());
    assertEquals("John", c1.getName());
  }
    @Test
    void testCatSetter() {
      Cat c1 = new Cat("John", 13);
      assertEquals(13, c1.getAge());
      c1.setAge(10);
      assertEquals(10, c1.getAge());
    }

    @Test
    void testCatArgConstructor() {
      Cat c1 = new Cat("John", 13);
      assertEquals(13, c1.getAge());
      assertEquals("John", c1.getName());
    }

    @Test
    void testCatHashCode() {
      Cat c1 = new Cat("John", 13);
      Cat c2 = new Cat("John", 13);
      assertEquals(true, c1.hashCode() == c2.hashCode());
      }
      @Test
      void testCatEquals() {
        Cat c1 = new Cat("John", 13);
        Cat c2 = new Cat("John", 13);
        assertEquals(true, c1.equals(c2));
      }
    }
