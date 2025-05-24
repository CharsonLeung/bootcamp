package redAlert2;

import java.util.ArrayList;
import java.util.Scanner;

public class Training {
  private static Integer fund = 10000;
  private Vehicles abbName;
  private static ArrayList<Infantry> soldier = new ArrayList<Infantry>();
  private static ArrayList<Vehicles> unit = new ArrayList<Vehicles>();
  
  public static String trainInv(Infantry infName) {
    if (fund >= infName.getValue()) {
      soldier.add(infName);
      fund = fund - infName.getValue();
      return "Training ... Unit ready. You have " + fund;
    } else {
      return "Insufficient fund.";
    }
  }

  public static String buildTank(Vehicles abbName) {
    //this.abbName = abbName;
    if (fund > abbName.getPrice()) {
    unit.add(abbName);
    fund = fund - abbName.getPrice();
     return "Building ... Unit Ready. You have " + fund;
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
  public static String stealCash() {
    fund = fund + 10000;
    return "You have " + fund;
  }
  public static String reCycle(Vehicles abbName) {
    if (unit.contains(abbName)) {
    unit.remove(abbName);
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
    System.out.println(unit);
    for (int i = 0; i < 10; i++) {
      EVA = getMine().toString();
    }
    System.out.println(fund);
    EVA = buildTank(Vehicles.MCV);
    System.out.println(EVA);
    System.out.println(unit);
    for (int i = 0; i < 5; i++) {
    EVA = buildTank(Vehicles.Flak); }
    System.out.println(EVA);
    System.out.println(unit);
    System.out.println(unit.size());
    EVA = reCycle(Vehicles.Apoc);
    System.out.println(EVA);
    System.out.println(unit);
    EVA = reCycle(Vehicles.Spider);
    System.out.println(EVA);
    EVA = buildTank(Vehicles.Rhino);
    System.out.println(EVA + unit);
    EVA = buildTank(Vehicles.Kirov);
    EVA = trainInv(Infantry.Conscript);
    System.out.println(EVA + soldier);
    //System.out.println(fund / Infantry.TeslaTrooper.getValue());
    int limit = fund / Infantry.TeslaTrooper.getValue();
    for (int i = 0; i < limit; i++) {
    EVA = trainInv(Infantry.TeslaTrooper);
    System.out.println(EVA);
    System.out.println(soldier);
      }
    EVA = stealCash();
    System.out.println(EVA);
    System.out.println("1. Infantry, 2. Vehicles");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    if (input == 1) {
      System.out.println(Infantry.Conscript.getName() + " " +
      Infantry.AttackDog.getName() + " " +
      Infantry.Engineer.getName() + " " +
      Infantry.FlakTrooper.getName() + " " +
      Infantry.TeslaTrooper.getName());
    } else if (input == 2) {
      System.out.println(Vehicles.Rhino.getLongName() + " " +
      Vehicles.Miner.getLongName() + " " +
      Vehicles.Flak.getLongName() + " " +
      Vehicles.Spider.getLongName() + " " +
      Vehicles.Demolit.getLongName() + " " +
      Vehicles.Tesla.getLongName() + " " +
      Vehicles.MCV.getLongName() + " " +
      Vehicles.V3.getLongName() + " " +
      Vehicles.Apoc.getLongName() + " " +
      Vehicles.Kirov.getLongName());
    }
    System.out.println(soldier.get(2));
    System.out.println(unit.get(1));

  }
  
}