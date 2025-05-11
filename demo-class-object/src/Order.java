public class Order {
  // checkoutAmount
  // private double[] prices; // 99, 14, 150
  // private int[] quantities; // 2, 3, 2

  // Alternative
  private Item[] items;
  private Customer customer;

  public Order() {
    this.items = new Item[0]; //no volumne, but useful, add room in the future
      }


  
  public void add(Item newItem) {
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = items[i];
    }
    newItems[newItems.length - 1] = newItem;
    this.items = newItems; // 
  }
  // ! Item.java owns pries & quantity (attribute), so Item has to present prie and quantity.
  public double checkoutAmount() {
    double total = 0.0;
    for (int i = 0; i < this.items.length; i++) {
      total += items[i].subtotal();
    }
    return total;
  }
  public String getCustofOrder() {
    return customer.toString();
  }

  public static void main(String[] args) {
    Order order = new Order(); // array length = 0

    Item itemA = new Item(99, 2);
    order.add(itemA);
    
    Item itemB = new Item(14, 3);
    order.add(itemB); // array length = 2

    Order o1 = new Order();
    Item itemC = new Item(1000, 5);
    o1.add(itemC);
    Item itemD = new Item(6000, 2);
    o1.add(itemD);

    Order o2 = new Order();
    Item rice = new Item(90, 100);
    Item noodles = new Item(10, 1000);
    Item wine = new Item(10000, 8);
    o2.add(rice);
    o2.add(noodles);
    o2.add(wine);



    System.out.println(o1.checkoutAmount()); // 240.0
  }

}
