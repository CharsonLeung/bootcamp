package redAlert2;

import java.util.HashMap;

public enum Vehicles {
  Rhino("Rhino", "RhinoTank", 900),
  Flak("Flak", "FlakTrack", 500),
  Demolit("Demolit", "DemolitionTruck", 1300),
  Spider("Spider", "TerrorDrone", 500),
  V3("V3", "V3Rocket", 700),
  Tesla("Tesla", "TeslaTank", 1500),
  Miner("Miner", "WarMiner", 1400),
  Apoc("Apoc", "ApocalypseTank", 1750),
  MCV("MCV", "MovableConVeh", 3000),
  Kirov("Kirov", "KirovAirship", 2000),

  ;
  
  public String abbName;
  public String longName;
  public int price;

  private Vehicles(String abbName, String longName, int price) {
    this.abbName = abbName;
    this.longName = longName;
    this.price = price;
  }
  public String getName() {
    return this.abbName;
  }
  public String getLongName() {
    return this.longName;
  }
  public int getPrice() {
    return this.price;
  }

  public static void main(String[] args) {
    String s1 = "Rhino";
    System.out.println(Rhino.getPrice());
    System.out.println(Apoc.longName);
    Vehicles [] vehiclesArr = new Vehicles[]
  { Vehicles.Rhino,
  Vehicles.Flak,
  Vehicles.Demolit,
  Vehicles.Spider,
  Vehicles.V3,
  Vehicles.Tesla,
  Vehicles.Miner,
  Vehicles.Apoc,
  Vehicles.MCV,
  Vehicles.Kirov };
    //for (Vehicles vehicle : vehiclesArr) {
      //System.out.println(vehicle.longName);
    // }
    HashMap<Integer, Vehicles> vehiclesMap = new HashMap<>();
    HashMap<Integer, String> vehiclesMapLong = new HashMap<>();
    for (int i = 0; i < vehiclesArr.length; i++) {
    vehiclesMap.put(i, vehiclesArr[i]);
    vehiclesMapLong.put(i, vehiclesArr[i].longName);
    }
    
    System.out.println(vehiclesMapLong);
    System.out.println(vehiclesMap.get(0).price);
    for (Vehicles v : vehiclesArr) {
      System.out.println(v.longName);
    }
  }
}