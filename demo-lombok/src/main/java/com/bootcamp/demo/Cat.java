package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Cat extends Animal{
  private String name;
  private int age;
  
  // constructor
  public Cat(String name, int age, double weight) {
    super(weight);
    this.name = name;
    this.age = age;
  }
  public String sum1(String name, int x, int y) {
    return name + sum2(x, y);
  }

  public int sum2 (int x, int y) {
    return x + y;
  }
  // getter, setter

  // equals, hashCode, toString
  public static void main(String[] args) {
    Cat cat1 = new Cat("John", 2);
    Cat cat2 = new Cat();

    System.out.println(cat1.getAge());
    System.out.println(cat1.getName());
    System.out.println(cat1);

    cat2.setAge(7);

    Cat cat3 = new Cat("John", 2);
    System.out.println(cat1.equals(cat3)); // true, override equals()
    System.out.println(cat1.hashCode() == cat3.hashCode()); // true, override 

    Cat cat4 = new Cat("Mary", 8, 6.7);
    Cat cat5 = new Cat("Mary", 8, 6.7);
    System.out.println(cat4.equals(cat5));
    System.out.println(cat4.hashCode());
    System.out.println(cat5.hashCode());

  }
}
