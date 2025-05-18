public class Dog extends Animal {
  // age....
  private double weight; // kg
  
  public Dog(double weight, int age) {
    super(age);
    this.weight = weight;
  }
  
  public double getWeight() { // kg
    return this.weight;
  }
  // Presentation
  public double getWeightG() {
    return this.weight * 1000;
  }


  @Override
  public int getAge() {
    return -99;
  }

  public static void main(String[] args) {
    Dog dog = new Dog(3.5, 10);
    System.out.println(dog.getWeight());
    dog.aniColor('Y');
    System.out.println(dog.getColor());
    System.out.println(dog.getAge());
  }
}
