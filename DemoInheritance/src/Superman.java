public class Superman extends Human implements Flyable, Living {
  
  public Superman(String name) {
    super(name);
  }
  @Override
  public void fly() {
    System.out.println("I am flying ...");
  }
  @Override
  public void eat() {
    System.out.println("I am eating ...");
  }
  @Override
  public void drink() {
    System.out.println("I am drinking ...");
  }
  @Override
  public void walk() {
    System.out.println("I am walking ...");
  }

  // ! You can override or NOT override speak()
  @Override
  public void speak() {
    System.out.println("Superman is speaking...");
  }
  public static void main(String[] args) {
    Superman s1 = new Superman("Kant");
    s1.fly();
    s1.eat();
    s1.drink();

    Flyable something = new Superman("Peter");
    something.fly(); // Polymorhpism
    
    // hide the method of eat()
    // something.eat();
    // something.drink();
    Superman s2 = (Superman) something;
    s2.eat();

    Living s3 = new Superman("Steven");
    s3.eat();
    s3.drink();
    // s3.fly(); Living points to s3 but not Flying, therefore can't fly
    // s3.walk();
  }
}
