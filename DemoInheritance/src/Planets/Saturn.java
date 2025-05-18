package Planets;

import java.math.BigDecimal;

public class Saturn extends Planet {
  private Double yearLong;

  public void setYearLong(Double yearLong) {
    this.yearLong = yearLong;
  }
  public Saturn(int moonQty, Double yearLong) {
    super(moonQty);
    this.yearLong = yearLong;
  }
  public String getYearLong() {
    return "One Saturn year is equal to "
            .concat(BigDecimal.valueOf(this.yearLong)
            .multiply(BigDecimal.valueOf(365.25)).toString()
            .concat(" Earth Days."));
  }

  public static void main(String[] args) {
    Saturn p6 = new Saturn(274, 29.4475);
    System.out.println(p6.getMoonQty());
    System.out.println(p6.getYearLong());
  }
  
}
