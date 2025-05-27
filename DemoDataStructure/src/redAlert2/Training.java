package redAlert2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Training {
  private static Integer fund = 10000;
  private static Integer counter = 0;
  private Vehicles abbName;
  private static ArrayList<Infantry> soldier = new ArrayList<Infantry>();
  private static ArrayList<Vehicles> unit = new ArrayList<Vehicles>();
  
  public static String trainInv(Infantry infName) {
    if (fund >= infName.getValue()) {
      soldier.add(infName);
      fund -= infName.getValue();
      return "Training ... Unit ready. You have " + fund;
    } else {
      return "Insufficient fund.";
    }
  }

  public static String buildTank(Vehicles abbName) {
    //this.abbName = abbName;
    if (fund >= abbName.getPrice()) {
    unit.add(abbName);
    fund -= abbName.getPrice();
     return "Building ... Unit Ready. You have " + fund;
    } else {
      return "Insufficient fund.";
      }
    //int pay = Vehicles.;
    //fund = fund - Vehicles.
  }


  public static int vehCounter(Vehicles vehicle) {
    counter = 0;
    for (int i = 0; i < unit.size(); i++) {
      if (unit.get(i) == vehicle) {
        counter++;
        } 
    } return counter; 
  }
  public static int infCounter(Infantry infantry) {
    counter = 0;
    for (int i = 0; i < soldier.size(); i++) {
      if (soldier.get(i) == infantry) {
        counter++;
      }
    } return counter;
    }

  public static String reportInf() {
    return " You have infantries: " + soldier.size() + " " + soldier;
  }
  public static String reportVeh() {
    return " You have vehicles: " + unit.size() + " " + unit;
  }
  public static String getMine() {
    if (!unit.contains(Vehicles.Miner)) {
      return "You have no miners.";
    } else {
    fund += 1000 * vehCounter(Vehicles.Miner);
    return "You have " + fund;
    }
  }
  public static String stealCash() {
    if (!soldier.contains(Infantry.Spy)) {
      return "You have to train Spy first.";
    } else {
    fund += 10000;
    soldier.remove(Infantry.Spy);
    return "Building infilterated, cash stolen. You have " + fund;
  }
}
  public static String reCycle(Vehicles abbName) {
    if (unit.contains(abbName)) {
    unit.remove(abbName);
    fund += abbName.getPrice();
    return "Unit sold. You have " + fund + reportVeh();
  } else {
    return "You have no " + abbName + " to be recycled.";
    }
  }
    public static String reCycleInf(Infantry Infantry) {
    if (soldier.contains(Infantry)) {
      soldier.remove(Infantry);
      fund += Infantry.getValue();
      return "Unit sold. You have " + fund + reportInf();
    } else {
      return "You have no " + Infantry + " to be recycled.";
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
    System.out.println(soldier.contains(Infantry.Spy));
    buildTank(Vehicles.Miner);
    buildTank(Vehicles.Miner);
    System.out.println(unit.contains(Vehicles.Miner));
    System.out.println(vehCounter(Vehicles.Miner));
    System.out.println(getMine());
    // Cheating or initializing
    fund = 10000;
    
    
    System.out.println("****Establishing battlefield control, Standy By!****");
    while (fund >= 0) {
    System.out.println("Fund: " + fund);
    System.out.println("Select what you want to do:");
    System.out.println("1. Train Infantry, 2. Building Vehicles, 3. Recycle units, 4. Get fund, 5. Abort.");

    EVA = "";
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
                Infantry [] infantryArr = new Infantry[]
      { 
      Infantry.Conscript,
      Infantry.AttackDog,
      Infantry.Engineer,
      Infantry.FlakTrooper,
      Infantry.TeslaTrooper,
      Infantry.Yuri,
      Infantry.Spy,
      };
      HashMap<Integer, Infantry> infantryMap = new HashMap<>();
      for (int i = 0; i < infantryArr.length; i++) {
        infantryMap.put(i, infantryArr[i]);
      }
      Vehicles [] vehiclesArr = new Vehicles[]
      { 
      Vehicles.Rhino,
      Vehicles.Flak,
      Vehicles.Demolit,
      Vehicles.Spider,
      Vehicles.V3,
      Vehicles.Tesla,
      Vehicles.Miner,
      Vehicles.Apoc,
      Vehicles.MCV,
      Vehicles.Kirov,
    };
    //for (Vehicles vehicle : vehiclesArr) {
      //System.out.println(vehicle.longName);
    // }
    HashMap<Integer, Vehicles> vehiclesMap = new HashMap<>();
    HashMap<Integer, String> vehiclesMapLong = new HashMap<>();
    for (int i = 0; i < vehiclesArr.length; i++) {
    vehiclesMap.put(i, vehiclesArr[i]);
    vehiclesMapLong.put(i, vehiclesArr[i].longName);
    }
    
    if (input == 1) {
      for (int i = 0; i < infantryArr.length; i++) {
        System.out.println(infantryArr[i] + " : " + infantryArr[i].getValue());
      }
      System.out.println(infantryMap);
      input = scanner.nextInt();
      Infantry input1 = infantryMap.get(input);
      EVA = trainInv(input1);
      System.out.println(EVA);
      System.out.println(reportInf());

    } else if (input == 2) {
      for (int i = 0; i < vehiclesArr.length; i++) {
        System.out.println(vehiclesArr[i].longName + " : " + vehiclesArr[i].price);
      }
      System.out.println(vehiclesMapLong);
      input = scanner.nextInt();
      Vehicles input2 = vehiclesMap.get(input);
      EVA = buildTank(input2);
      System.out.println(EVA);
      if (input2 == Vehicles.Demolit && fund >= Vehicles.Demolit.price) {
        System.out.println("My truck is loaded!");
      } else if (input2 == Vehicles.Kirov && fund >= Vehicles.Kirov.price) {
        System.out.println("Kirov Reporting!");
      }
      System.out.println(reportVeh());
    }  else if (input == 3) {
          System.out.println("To recycle 1. Infantries, 2. Vehicles, 3. All units ? ");
           input = scanner.nextInt();
              if (input == 1) {
          System.out.println(reportInf());
          System.out.println(infantryMap);
          int inputGrind = scanner.nextInt();
              if (soldier.contains(infantryMap.get(inputGrind))) {
              EVA = reCycleInf(infantryMap.get(inputGrind));
              } else {
                System.out.println("You have no such unit to recycle.");
              } } else if (input == 2) {
          System.out.println(reportVeh());
          System.out.println(vehiclesMap);
          int inputGrind = scanner.nextInt();
              if (unit.contains(vehiclesMap.get(inputGrind))) {
              EVA = reCycle(vehiclesMap.get(inputGrind));
              } else {
            System.out.println("You have no such unit to recycle.");
          }
          } else if (input == 3) {
             for (int i = 0; i < soldier.size(); i++) {
              fund = fund + soldier.get(i).getValue(); }
             for (int i = 0; i < unit.size(); i++) {
              fund = fund + unit.get(i).getPrice();
             }
             soldier.removeAll(soldier);
             unit.removeAll(unit);
             System.out.println(reportInf());
             System.out.println(reportVeh());
             System.out.println("Units sold. You have " + fund);
          }  System.out.println(EVA);
        } else if (input == 4) {
          System.out.println("Which way would you want to get fund?");
          System.out.println("1. Mining, 2. Steal from enemy");
           input = scanner.nextInt();
          if (input == 1) {
            EVA = getMine();
          } else if (input == 2) {
            EVA = stealCash();
          } System.out.println(EVA); 
        } else if (input == 5) {
           System.out.println("****Remote control terminated.****");
           System.out.println("Fund: " + fund);
           System.out.println(reportVeh());
           System.out.println(reportInf());
           break;
      }

  }
 }
}