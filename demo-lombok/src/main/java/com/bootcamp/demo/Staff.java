package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Staff {
  private String name;
  private String hkId;
  private String email;
  private double weight;
  private double height;
  
  public static void main(String[] args) {
    Staff s1 = Staff.builder()
      .name("John")
      .hkId("H1234567")
      .email("john@gmail.com")
      .weight(59.6)
      .height(180)
      .build();
    System.out.println(s1);
  }
}
