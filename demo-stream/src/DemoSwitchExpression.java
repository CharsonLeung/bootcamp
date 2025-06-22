public class DemoSwitchExpression {
  public static void main(String[] args) {
    // switch is a bad idea:
    // 1) you have to remember to break
    // 2) no range checking
    // 3) eye ball check if all values has been covered
    
    Curruency curruency = Curruency.USD;
    if (curruency == Curruency.HKD) {

    } else if (curruency == Curruency.USD) {

    } else if (curruency == Curruency.CNY) {

    }

    // switch expression
    // 1) Avoid Duplicate case
    // 2) Java 21: missing case -> warning: Java 17: missing value -> error
    // 3) Default case is allowed, but you can ignore.
    // 4) Not allow to do "AND" events
    // 5) Switch is good for enum.


    Curruency amountCurruency = Curruency.USD;
    double amount = 10.0;
    double amountInHKD = switch (amountCurruency) {
      case HKD -> amount * 1.0; // return
      case USD -> amount * 7.85;
      case CNY -> amount * 1.13; 
  };

  double amountInHKD2 = switch (amountCurruency) {
      case HKD -> {
        System.out.println("No Conversion");
        yield amount * 1.0; // "yield" similar to "return"
      }
      case USD -> {
        System.out.println("Converting to USD ...");
        yield amount * 7.85;
      }
      case CNY -> {
        System.out.println("Converting to CNY ...");
        yield amount * 1.13; 
  }
};

  }
  public static enum Curruency {
    HKD, USD, CNY,;
    // 50 curruency
  }
}
