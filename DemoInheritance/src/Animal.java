// Inherit
public abstract class Animal { // Parent Class: concrete class or abstract class 
  // Parent Class
  private int age;
  private char color;

  // ! Why abstract class still have constructor? 
  // For child class constructor to call.
  public Animal(int age) {
    this.age = age;
  }
  public void aniColor(char color) {
    this.color = color;
  }

  public int getAge() {
    return this.age;
  }
  public String getColor() {
    if (this.color == 'B') {
        return "Black";
    } else if (this.color == 'W') {
        return "White";
    } else if (this.color == 'Y') {
        return "Yellow";
    } else if (this.color == 'G') {
        return "Grey";
    } 
    
    else {return "Others";}
  }
  
  public static void main(String[] args) {
    Animal animal = new Cat(13);
    Cat cat = new Cat("Peter", 13);
    
    // Abstract class is not for object creation
    // Animal animal2 = new Animal(13);
  

    // ! Polymorphism (Runtime/Dynamic Polymorphism)
    // ! 1. instance method call is dstermined by object referene type (compile-time)
    // ! 2. the implementation of method is determined by actual object itself (runtime)
    Animal cat2 = new Cat ("John", 20);
    // "cat2" -> "object reference"
    // "Animal" -> "object reference type"
    // "new Cat("John", 20)" -> "Object" / "object reference value"

    cat2.getAge();
    cat2 = new Dog(10, 7); // Can change point
    System.out.println(cat2.getAge()); // -99
    //cat2.getName(); // Java cannot ensure cat2 is pointing to Cat Object, it may be Dog object.
    cat2 = new Cat("Peter", 80);
    System.out.println(cat2.getAge()); // 90

    // Common logic to work, but everytime adding one kind of animal, have to add else if
    // ! 組合skill: instanceof + downcast
    if (cat2 instanceof Cat) {
      Cat animal2 = (Cat) cat2;
      System.out.println(animal2.getName());
    } else if (cat2 instanceof Dog) {
      Dog animal3 = (Dog) cat2;
      System.out.println(animal3.getWeight()); // 10.0
    } 
    
    //((Cat) cat2).getName();
  }
  
}
