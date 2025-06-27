package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.sameInstance;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class HamcrestTest {
  @Test
  void testString() {
    String s = "hello";
    //Junit
    // assertEquals(5, s.length());
    // Hamcrest
    assertThat(s.length(), is(equalTo(5)));
  }

  @Test
  void testMath() {
  int actualValue = 38;
  assertThat(actualValue, is(equalTo(38)));
  assertThat(actualValue, is(greaterThanOrEqualTo(30)));
  assertThat(actualValue, is(lessThanOrEqualTo(40)));
}

@Test
void testInstance() {
  String x1 = "hello";
  String x2 = "hello";

  assertThat(x1, sameInstance(x2));

  String x3 = new String("hello");
  assertThat(x1, is(not(sameInstance(x3))));
}

@Test
void testList() {
  List<String> fruits = new ArrayList<>();
  fruits.add("orange");
  fruits.add("apple");
  fruits.add("mango");
  assertThat(fruits, hasItem("mango"));
  assertThat(fruits, hasItems("apple", "orange"));

  // contains -> with ordering test
  assertThat(fruits, contains("orange", "apple", "mango"));
  // containsInAnyORder() -> without ordering test
  assertThat(fruits, containsInAnyOrder("apple", "orange", "mango"));
}
  
}
