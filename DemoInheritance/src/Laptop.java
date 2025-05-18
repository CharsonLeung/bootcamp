// ! Concrete class has to terminate abstract methods
public class Laptop extends Machine {
  private int ram;

  public Laptop(int ram, String isOn) {
    super(); // ! implicity calling parent class constructor
    this.ram = ram;
  }
  public int getRam() {
    return this.ram;
  }

  @Override
  public void start() {
    System.out.println("Laptop is starting ...");
    super.turnOn();
  }
  @Override
  public void stop() {
    System.out.println("Laptop is stoping ...");
    super.turnOff();
  }
  @Override
  public String getStatus() {
    String status = super.isOn() ? "ON" : "OFF";
    return "Laptop status: " + status;
  }
}
