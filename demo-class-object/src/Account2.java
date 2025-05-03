public class Account2 {
    // Attributes
    private String userId;
    private double balance;

    public Account() {}
    
    public Account(String userId, double balance) {
      this.userId = userId;
      this.balance = balance;
    }
    public static void main(String[] args) {
    // ! Can be more than 1 constructors
    // Constructor (empty constructor): nothing in the ()
    //public Account() // ! empty constructor (no parameter) when there is no constructors
      // empty constructor implicity exists
      //this.balance = 10.0; // (default value: 0.0)

  
    // Technically OK to have only 1 constructor
  
    // All arguments constructor (All parameters)
    

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
  
      System.out.println(accounts[1].getBalance()); // 900.0
      System.out.println(accounts[0].getBalance()); //
  
      String[] names = new String[3];
      String s1 = "John";
      String s2 = "Peter";
      String s3 = "Sally";
      //names[0] = 
}
    }
  }
