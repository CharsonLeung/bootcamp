import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dog extends Animal implements Comparable<Dog> {
  private String name;

  public Dog(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  // this (-1) vs dog (1)
  @Override
  public int compareTo(Dog dog) {
    return this.name.compareTo(dog.getName()) > 0 ? -1 : 1;
  }
  // ! You should override equal(),
  // ! so that list.remove() able to remove this same dog (your definition)
@Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Dog))
      return false;
    Dog dogs = (Dog) obj;
    return this.name == dogs.getName();
  }
@Override
public String toString() {
  return "Dog(" + "names: " + this.name
                + ")"; 
}
  public static void main(String[] args) {
    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("Mary"));
    dogs.add(new Dog("Alex"));
    dogs.add(new Dog("Paul"));
    

    // Comparable Approach: as long as Dog implement comparable
    // Disadvantage: every class has one sorting formula ONLYm but Comparator approach can be more formula for a runtime
    Collections.sort(dogs); // where is the formula?
    System.out.println(dogs);
  }
}
