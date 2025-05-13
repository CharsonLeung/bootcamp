package Planets;

public class Earth extends Planet {
  private char hasLife;

  public Earth(String name, char hasLife) {
    super(name);
    this.hasLife = hasLife;
  }
  public boolean ifHasLife() {
    if (this.hasLife == '1') {return true;} 
    else {return false;}
  }
  public static void main(String[] args) {
    Earth p3 = new Earth("Earth", '1');
    System.out.println(p3.getName());
    System.out.println(p3.ifHasLife());
    p3.setRadius(6378);
    System.out.println(p3.getVolume());

  }
  
}
