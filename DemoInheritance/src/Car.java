public class Car extends Machine {
  private String maker;
  
  public void setMaker(String maker) {
    this.maker = maker;
  }
  public Car(String maker, int passQty) {
    super(passQty);
    this.maker = maker;
  }
  
  public String getMaker() {
    return this.maker;
  }
  
  public void main(String[] args) {
   Car car1 = new Car("BMW", 5);
  }
}
