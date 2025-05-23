package redAlert2;

import java.util.ArrayList;

public class WarFactory {
  private static Integer fund = 10000;
  private Vehicles abbName;
  private static ArrayList<Vehicles> tanks = new ArrayList<Vehicles>();
  

  public static String buildTank(Vehicles abbName) {
    //this.abbName = abbName;
    if (fund > abbName.getPrice()) {
    tanks.add(abbName);
    fund = fund - abbName.getPrice();
     return "Building ... Unit Ready, You have " + fund;
    } else {
      return "Insufficient fund.";
    }
    //int pay = Vehicles.;
    //fund = fund - Vehicles.
  }

  public static String getMine() {
    fund = fund + 1000;
    return "You have " + fund;
  }
  public static String reCycle(Vehicles abbName) {
    if (tanks.contains(abbName)) {
    tanks.remove(abbName);
    fund = fund + abbName.getPrice();
    return "You have " + fund;
  } else {
    return "You have no " + abbName + " to be recycled.";
    }
  }
  

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
    String EVA = buildTank(Vehicles.Apoc); 
    System.out.println(EVA);
  }
    String EVA = buildTank(Vehicles.Miner);
    System.out.println(EVA);
    EVA = getMine().toString();
    System.out.println(EVA);
    EVA = buildTank(Vehicles.Miner);
    System.out.println(EVA);
    System.out.println(tanks);
    for (int i = 0; i < 10; i++) {
      EVA = getMine().toString();
    }
    System.out.println(fund);
    EVA = buildTank(Vehicles.MCV);
    System.out.println(EVA);
    System.out.println(tanks);
    for (int i = 0; i < 5; i++) {
    EVA = buildTank(Vehicles.Flak); }
    System.out.println(EVA);
    System.out.println(tanks);
    System.out.println(tanks.size());
    EVA = reCycle(Vehicles.Apoc);
    System.out.println(EVA);
    System.out.println(tanks);
    EVA = reCycle(Vehicles.Spider);
    System.out.println(EVA);
    EVA = buildTank(Vehicles.Rhino);
    System.out.println(EVA + tanks);
  }
  
}