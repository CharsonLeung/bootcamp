public class Kangaroo extends Animal {
  private char gender;
  private double hopDist;

  public Kangaroo(int age, char gender, double hopDist) {
    super(age);
    this.gender = gender;
    this.hopDist = hopDist;
  }
  public String getGender() {
    if (this.gender == 'M') {
      return "Male";
    } else {return "Female";}
  }

  public double getHopDist() {
    return this.hopDist;
  }
  public static void main(String[] args) {
    Kangaroo k1 = new Kangaroo(10, 'M', 5.5);
    k1.aniColor('G');
    System.out.println(k1.getAge());
    System.out.println(k1.getGender());
    System.out.println(k1.getHopDist());
    System.out.println(k1.getColor());
    }

  }
