import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height, weight
  private String name;
  private Double height;
  private Double weight;
  private Double BMI;
  private Boolean isOverweight;

  public void setName(String name) {
    this.name = name;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
  public void setBody(String name, double height, double weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
  }

  public String getName() {
    return this.name;
  }
  public double getHeight() {
    return this.height;
  }
  public double getWeight() {
    return this.weight;
  }
  // ! methods
  // BMI -> double
  public double getBMI() {
    return this.BMI = BigDecimal.valueOf(this.weight)
                      .divide(BigDecimal.valueOf(Math.pow(this.height, 2)), 2, RoundingMode.HALF_UP).doubleValue();
  }
  // isOverweight -> boolean (BMI > 25)
  public boolean getIsOverweight() {
    if (this.BMI > 25) {
      return this.isOverweight = true;
    } else {
      return this.isOverweight = false;
    }
}
  public String getAll() {
    return "Name: ".concat(this.name.concat(" Weight: ")
                    .concat(this.weight.toString())).concat(" Height: ")
                    .concat(this.height.toString()).concat(" Body Mass Index: ")
                    .concat(this.BMI.toString().concat(" Overweight? ")
                    .concat(this.isOverweight.toString()));

  }

  //main
public static void main(String[] args) {
  //person[] -> p1, p2, p3

  Person [] person = new Person[3];


  Person p1 = new Person();
  person[0] = p1;
  p1.setName("Peter");
  p1.setWeight(89);
  p1.setHeight(1.75);
  p1.getBMI();
  p1.getIsOverweight();

  Person p2 = new Person();
  person[1] = p2;
  p2.setBody("Paul", 1.53, 76);
  p2.getBMI();
  p2.getIsOverweight();

  Person p3 = new Person();
  person[2] = p3;
  p3.setBody("Mary", 1.50, 50);
  p3.getBMI();
  p3.getIsOverweight();
  
  // for loop () -> array -> pritn out their bmi and weight status

    for (Integer i = 0; i < person.length; i++) {
      System.out.println(person[i].getAll());
    }
  }
}