// ! Java 16 record
public record Staff1(String name, int age) {
  private static String animal = "Pig";
  //private String name;
  //private int age; // DOB

  //public Staff(String name, int age) {
    //this.name = name;
    //this.age = age;
  //}

  //public String getName() {
    //return this.name;
  //}
  //public int getAge() {
    //return this.age;
  //}

  // No Setter (do not need to change data once created)

  // Scanario: Get data from database, and then send it over to your client

  // Customer instance method
  public String nichname() {
    return animal + this.name;
  }
  public static int sum(int x, int y) {
    return x + y;
  }
}
