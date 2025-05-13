  // ! Cat is a kind of "Animal"
// ! After "extends", Cat is a child class, while Animal is a parent class
// ! 1. Inherit all attribute from parent class
// ! 2. Cannot inherit constructor from Parent class, but we can call the Parent constructor by "super"
// ! 3. Inherit instance from parent class. (Not exactly, inherit.)
public class Cat extends Animal {
  // private int age;
  private String name;
  
  public Cat(String name, int age) {
    super(age);
    this.name = name;
  }
  public Cat(char color) {
    super(color);
  }
  public String getName() {
    return this.name;
  }
  
  public int getAge() {
    return super.getAge() + 10;
  }
  public int getAge2() {
    return super.getAge();
  }
  
  public static void main(String[] args) { // static cannot call "this."
    Cat cat = new Cat("Peter", 13);
    System.out.println(cat.getAge()); // 23
    System.out.println(cat.getAge2()); // 13
    Cat cat2 = new Cat("John", 12);
    System.out.println(cat.getName());
    System.out.println(cat.getAge());
    
    cat.aniColor('W');
    cat2.aniColor('B');
    System.out.println(cat.getName() + " is " + cat.getColor());
    System.out.println(cat2.getName() + " is " + cat2.getColor());
    
  }
}
