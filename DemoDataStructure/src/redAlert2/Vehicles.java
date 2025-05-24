package redAlert2;

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
  { Rhino,
  Flak,
  Demolit,
  Spider,
  V3,
  Tesla,
  Miner,
  Apoc,
  MCV,
  Kirov, 
    };
    for (int i = 0; i < vehiclesArr.length; i++) {
    System.out.println(vehiclesArr[i].longName);
    }
  }
}