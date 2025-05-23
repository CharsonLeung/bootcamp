public class Dog {
  private String name;

  public Dog(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
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
  return this.name;
}
  
}
