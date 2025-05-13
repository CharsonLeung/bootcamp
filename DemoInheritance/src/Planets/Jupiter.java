package Planets;

public class Jupiter extends Planet{
  private int hasVolcano;

  public void setHasVolcano(int hasVolcano) {
    this.hasVolcano = hasVolcano;
  }
  public Jupiter(double radius, int hasVolcano) {
    super(radius);
    this.hasVolcano = hasVolcano;

  }
  public boolean getHasVolcano() {
    if (this.hasVolcano > 0) {return true;}
    else {return false;}
  }
  public static void main(String[] args) {
    Jupiter p5 = new Jupiter(69911, 0);
    System.out.println(p5.getVolume());
    System.out.println(p5.getHasVolcano());
  }
  
}
