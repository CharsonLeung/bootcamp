public abstract class Human {
  private String name;

  public Human(String name) {
    this.name = name;
  }

  // concrete method
  public void speak() {
    System.out.println("Speaking ...");
  }
  // abstract method
  abstract void walk();
  
}
