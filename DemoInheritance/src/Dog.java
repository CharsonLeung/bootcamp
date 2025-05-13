public class Dog extends Animal {
  // age....
  private double weight;
  
  public Dog(double weight, int age) {
    super(age);
    this.weight = weight;
  }
  public double getWeight() {
    return this.weight;
  }

  public static void main(String[] args) {
    Dog dog = new Dog(3.5, 10);
    System.out.println(dog.getWeight());
    dog.aniColor('Y');
    System.out.println(dog.getColor());
  }
}
