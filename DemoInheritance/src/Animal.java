// Inherit
public class Animal { 
  // Parent Class
  private int age;
  private char color;

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
    Animal animal = new Animal(13);
    Cat cat = new Cat("Peter", 13);
  }
  
}
