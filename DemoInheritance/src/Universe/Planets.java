package Universe;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Planets  {
  Mercury(2439.7, 51.653), // km, million km
  Venus(6051.8, 108.79),
  Earth(6378, 151.36),
  Mars(3389.5, 249.91),
  Jupiter(69911, 767.01),
  Saturn(60268, 1433.7),
  Uranus(25362, 2920.5),
  Naptune(24622, 4471),
  ;
  private double radius;
  private double distFromSun;
  private Planets(double radius, double distFromSun) {
    this.radius = radius;
    this.distFromSun = distFromSun;
  }
  public double getRadius() {
    return this.radius;
  }
  public double getDistAU() {
    return BigDecimal.valueOf(this.distFromSun)
          .divide(BigDecimal.valueOf(Planets.Earth.distFromSun), 4, RoundingMode.HALF_UP).doubleValue();
  }
  public static void main(String[] args) {
    System.out.println(Planets.Venus);
    System.out.println(Planets.Venus.getDistAU());
  }
}
