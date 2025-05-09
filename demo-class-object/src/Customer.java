// Customer has many orders
public class Customer {
  private long id;
  private String name;
  private Order[] order;
  private boolean isVip;

  // main()
  // John -> many Orders -> items
  public void setName(String name) {
    this.name = name;
  }
  public void setId(long id) {
    this.id = id;
  }

  public Customer(String name, long id) {
    this.name = name;
    this.id = id;
    this.order = new Order[0];
  }
  public void add(Order newOrder) {
    Order[] newOrders = new Order[this.order.length + 1];
    for (int i = 0; i < this.order.length; i++) {
      newOrders[i] = order[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.order = newOrders;
  }
  
  // IsVIP():
  // total amount of orders > 100_000

  public double totalAmount() {
    double total = 0.0;
    for (int i = 0; i < this.order.length; i++) {
      total += order[i].checkoutAmount();
    }
    return total;
  }

  public boolean isVip() {
     if (totalAmount() > 100_000) {
      return this.isVip = true;
     } else { return this.isVip = false;}
  }

  public static void main(String[] args) {
    
    Customer c1 = new Customer("John", 445634);

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

    c1.add(o1); // add o1 to John
    c1.add(o2);

    System.out.println(c1.name);
    System.out.println(c1.id);
    System.out.println(c1.totalAmount());
    System.out.println(c1.isVip());
  }
}
