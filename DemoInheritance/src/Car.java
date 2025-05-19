public class Car extends Machine {
  private Color color;
  private String maker;
  
  public void setMaker(String maker) {
    this.maker = maker;
  }
  public Car(Color color, String maker, int passQty) {
    super(passQty);
    this.color = color;
    this.maker = maker;
  }
  
  public String getMaker() {
    return this.maker;
  }
  
  public void main(String[] args) {
   Car car1 = new Car(Color.RED, "BMW", 5);
   Car car2 = new Car(Color.RED, "BMW", 5);
  }
}
