public class Employee { // An employee has name, age and email
  // Attributes
  private String name;
  private int age;
  private String email;

  // Object Method (Instance Method)
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }

  // Runtime
  public static void main(String[] args) {
    // Problem
    String employee1Name = "John";
    int employee1Age = 26;
    String employee1Email = "john@gmail.com";

    String employee2Name = "Steven";
    int employee2Age = 30;
    String employee2Email = "steven@gmail.com";

    // Solution - Class and Object
    Employee e1 = new Employee();
    e1.setName("John");
    e1.setAge(20);
    e1.setEmail("john@gmail.com");
    Employee e2 = new Employee();
    e2.setName("Steven");
    e2.setAge(21);
    e2.setEmail("steven@yahoo.com");

    System.out.println("Name: " + e1.getName() + ", Age: " + e1.getAge() + ", E-mail:" + e1.getEmail());
    System.out.println("Name: " + e2.getName() + ", Age: " + e2.getAge() + ", E-mail:" + e2.getEmail());

    // when e1 = e2: original e1 would be deleted since no path to reach
    // e1 = e2;
    System.out.println(e1.getName());

    e1.setEmail("john@gmail.com");
    System.out.println(e1.getName());
    System.out.println(e1.getEmail());


  }  

}
