public class Child {
  // ! static -> common attribute, NOT belongs to any object
  // ! but all objects can access the static variable
  private static int counter = 0; // if no static, every children has a counter, but with static

  // Every Child object has id, firstName and lastName. But no counter. (not belong to object)
  // Attribute (Instance variable)
  // Instance = object
  private long id;
  private String firstName;
  private String lastName;

  // constructor
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  //public void hkId(String hkId) {
    //this.hkId = hkId;
  //}
  public Child(String firstName, String lastName) {
    counter++;
    this.id = counter;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  // getter
  public long getId() {
    return this.id;
  }
  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }
  //public String gethkId() {
    //return this.hkId;
  //}
  
  // ! Describe the definition of Child in your world.
  public boolean equals(Child child) {
    return this.id == child.getId();
  }
  public static void main(String[] args) {
    // approach 1
    Child c1 = new Child("Leo", "Chan");
    if (c1.getFirstName().equals("Leo") && c1.getLastName().equals("Chan")) {
      System.out.println("He is Leo Chan.");
    }
    System.out.println(c1.equals(new Child("Vincent", "Chan"))); // true
    System.out.println(c1.equals(new Child("Vincent", "Lau")));
    System.out.println(c1.equals(new Child("Leo", "Chan")));
    System.out.println(c1.equals(new Child("Leo", "Lau")));

    Child c2 = new Child("Leo", "Wong");
    System.out.println(c2.getId());
    System.out.println(c2.equals(new Child("Leo", "Wong"))); // new Child -> counter++
    System.out.println(c2.firstName.equals("Leo") && c2.lastName.equals("Wong"));
    System.out.println(c2.getId());
  }
  
}
