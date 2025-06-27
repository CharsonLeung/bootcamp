package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CatTest {
 
  // ! Fake Object (But wihtout real implementation)
  @Mock
  private Dog dog;

  @InjectMocks
  private Cat cat;

  @Test
  void testCatGetter() {
    // getter
    Cat c1 = new Cat("John", 13, 16);
    assertEquals(13, c1.getAge());
    assertEquals("John", c1.getName());
  }
    @Test
    void testCatSetter() {
      Cat c1 = new Cat("John", 13, 16);
      assertEquals(13, c1.getAge());
      c1.setAge(10);
      assertEquals(10, c1.getAge());
    }

    @Test
    void testCatArgConstructor() {
      Cat c1 = new Cat("John", 13, 16);
      assertEquals(13, c1.getAge());
      assertEquals("John", c1.getName());
    }

    @Test
    void testCatHashCode() {
      Cat c1 = new Cat("John", 13, 16);
      Cat c2 = new Cat("John", 13, 16);
      assertEquals(true, c1.hashCode() == c2.hashCode());
      }
      @Test
      void testCatEquals() {
        Cat c1 = new Cat("John", 13, 16);
        Cat c2 = new Cat("John", 13, 16);
        assertEquals(true, c1.equals(c2));
      }
      // ! From Unit test perspective,
      // ! subtract() should not be wrong because fail of sum()
      @Test
      void testSubtract() {
        // ! Making assumption...
        Mockito.when(this.dog.sum(3, 4)).thenReturn(100);
        // Cat cat = new Cat("John", 10, this.dog);
        // ! Start testing...
        int actualresult = cat.subtract(10, 3, 4);
        // test case
        assertEquals(-90, actualresult);
        Mockito.verify(this.dog, times(1)).sum(3, 4); // call method only once
      }
    }
