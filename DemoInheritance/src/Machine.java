public abstract class Machine {
  // attribute
  private boolean isOn; // default: false
  private int prodYear;
  private String whereMade;
  private double power;
  private int passQty;
  // constructor
  public Machine() {
    this.isOn = false; // ! implicity calling parent class constructor
  }
  public void setProdYear(int prodYear) {
    this.prodYear = prodYear;
  }
  public void setWhereMade(String whereMade) {
    this.whereMade = whereMade;
  }
  public void setPower(double power) {
    this.power = power;
  }
    public void setPassQty(int passQty) {
    this.passQty = passQty;
  }
   public Machine(int passQty) {
    this.passQty = passQty;
   }
  // get
  public int getProdYear() {
    return this.prodYear;
  }
  public String getWhereMade() {
    return this.whereMade;
  }
  public double getPower() {
    return this.power;
  }
  public int getPassQty() {
    return this.passQty;
  }
  //public boolean getStatus() {
  //  return this.isOn;
  //}
  // getter
  public boolean isOn() {
    return this.isOn;
  }
  public void turnOn() {
    this.isOn = true;
  }
  public void turnOff() {
    this.isOn = false;
  }
  // child extend Machine
  
  // abstract method
  public abstract String getStatus();

  public abstract void start();

  public abstract void stop();
  
  // main (Polymorphism)
  public static void main(String[] args) {
    Machine phone = new Phone(17.5, "off");
    phone.start();
    phone.stop();
    System.out.println(phone.getStatus());

    Laptop laptop = new Laptop(32, "On");
    System.out.println(laptop.getRam());

    Phone p2 = new Phone(10.5, "off");
    System.out.println();
    System.out.println(p2.getStatus());
    Laptop l2 = new Laptop(24, "off");
    System.out.println(l2.getStatus());
  }
}
