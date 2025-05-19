// JVM creates enum objects by your constructor
public enum Currency {
  HKD(1, "Hong Kong Dollar"), //
  USD(2, "US Dollar"), //
  CNY(3, "Chinese Yuen"), //
  JPY(4, "Japanese Yan"), //
  ; 
  
  private int value;
  private String description;

  private Currency(int value, String description) {
    this.value = value;
    this.description = description;
  }
  public int getValue() {
    return this.value;
  }
  public String getDescription() {
    return this.description;
  }
  public static void main(String[] args) {
    System.out.println(Currency.USD.getValue());
    System.out.println(Currency.USD.getDescription());
  }
}
