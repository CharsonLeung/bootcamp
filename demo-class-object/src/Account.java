public class Account {
  // Attributes
  private String userId;
  private double balance;
  
  // ! Can be more than 1 constructors
  // Constructor (empty constructor): nothing in the ()
  public Account() { // ! empty constructor (no parameter) when there is no constructors
    // empty constructor implicity exists
    this.balance = 10.0; // (default value: 0.0)
  }

  // Technically OK to have only 1 constructor

  // All arguments constructor (All parameters)
  
  public Account(String userId, double balance) {
    this.userId = userId;
    this.balance = balance;
  }
  // ! write
  public void setuserId(String userId) {
    this.userId = userId;
  }
  public void setBalance(double balance) { //void: because nothing to return, so write void, but have to put into ()
    this.balance = balance;
  }

  // ! read

  public String getuserId() {
    return this.userId;
  }
  public double getBalance() {
    return this.balance;
  }

  public static void main(String[] args) {
    Account [] accounts = new Account[3]; // create Account Array Object
    Account a1 = new Account();
    Account a2 = new Account();
    Account a3 = new Account();
    a2.setBalance(900.0);
    accounts[0] = a1;
    accounts[1] = a2;
    accounts[2] = a3;

    System.out.println(accounts[1].getBalance());

    // object reference: a1, a2
    // "new" -> create an object of Account
    //Account a1 = new Account();
    a1.setBalance(100.0);
    System.out.println(a1.getBalance());

    //Account a2 = new Account();
    a2.setBalance(200.0);
    System.out.println(a2.getBalance());

    //a2 = a1; // practical meaningless but an example to explain
    //a2.setBalance(500.0);
    System.out.println(a1.getBalance()); // 500.0
    System.out.println(a2.getBalance()); // 500.0

    //Account a3 = new Account("johnwong", 500.0); //no address, cannot be called
    System.out.println(a3.getuserId());


  }
  
}
