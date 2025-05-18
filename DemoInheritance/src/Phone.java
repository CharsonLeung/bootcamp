public class Phone extends Machine {
  private double screenSize;

  public Phone(double screenSize, String status) {
    //super();
    this.screenSize = screenSize;
  }
  public double getScreenSize() {
    return this.screenSize;
  }
  @Override
  public void start() {
    System.out.println("Phone is starting ...");
    super.turnOn();
  }
  @Override
  public void stop() {
    System.out.println("Phone is stoping ...");
    super.turnOff();
  }
  @Override
  public String getStatus() {
    String status = super.isOn() ? "ON" : "OFF";
    return "Phone status: " + status;
  }
  public static void main(String[] args) {
    Phone p3 = new Phone(12, "Off");
    p3.start();
    System.out.println(p3.getStatus());
    p3.stop();
    System.out.println(p3.getStatus());
  }
  
}
