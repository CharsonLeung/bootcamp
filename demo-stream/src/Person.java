public class Person {
  private Long id; // Use wrapped class
  private Double height; // primitive cannot present "null" when transferring data.
  private Double weight; // Use primitive when doing calcuations

  public static Builder builder() {
    return new Builder();
  }

  public Person(Builder builder) {
    this.id = builder.id;
    this.height = builder.height;
    this.weight = builder.weight;
  }
  
  // getter, setter

  public static class Builder {
  private Long id; // Use wrapped class
  private Double height; // primitive cannot present "null" when transferring data.
  private Double weight; // Use primitive when doing calcuations
    
  public Builder id(Long id) {
      this.id = id;
      return this;
    }

    public Builder height(Double height) {
      this.height = height;
      return this;
    }

    public Builder weight(Double weight) {
      this.weight = weight;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }


    public static void main(String[] args) {
      // ! Traditional builder
      // Person p1 = new Person(1L, 1.76, 75.0);

      // ! Builder Pattern
      Person p2 = Person.builder()
          .id(1L) //
          .height(1.76) //
          .weight(75.0) //
          .build(); //

      // ! Adventages:
      // 1. Easy to place value and review the mapping
      // 2. Easy to manage null values for initial object

        }
  }

