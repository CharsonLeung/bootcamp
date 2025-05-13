package Planets;

public class Planet {
  private String name;
  private double radius;
  private boolean hasRing;
  private int moonQty;
  
  public Planet(String name) {
    this.name = name;
  }
  public Planet(double radius) {
    this.radius = radius;
  }
  public void setRadius(double radius) {
    this.radius = radius;
  }
  public void setHasRing(boolean hasRing) {
    this.hasRing = hasRing;
  }
  public void setMoonQty(int moonQty) {
    this.moonQty = moonQty;
  }
  public String getName() {
    return this.name;
  }
  public double getRadius() {
    return this.radius;
  }
  public double getVolume() {
    return 4 * Math.PI * Math.pow(this.radius, 3) / 3;
  }
  public String getHasRing() {
    if (this.hasRing == true) {return "Yes.";}
    else {return "No.";}
  }
  public int getMoonQty() {
    return this.moonQty;
  }
  public static void main(String[] args) {
    Planet p1 = new Planet("Mercury");
    p1.setRadius(2439.7);
    System.out.println(p1.getVolume());

    Saturn p6 = new Saturn(274, 29.4475);
    //p6.setMoonQty(274);
    System.out.println(p6.getMoonQty());
  }
  
}
