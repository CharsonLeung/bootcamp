public class Tutor {
  public static void main(String[] args) {
    // object reference: a1, a2
    // "new" -> create an object of Account
    Account a1 = new Account();
    a1.setBalance(100.0);
    System.out.println(a1.getBalance());

    Account a2 = new Account();
    a2.setBalance(200.0);
    System.out.println(a2.getBalance());

    a2 = a1; // practical meaningless but an example to explain
    a2.setBalance(500.0);
    System.out.println(a1.getBalance()); // 500.0
    System.out.println(a2.getBalance()); // 500.0

    Account a3 = new Account("johnwong", 500.0); //no address, cannot be called
    System.out.println(a3.getuserId());

    //local variable
    String userId = "123";
    System.out.println(userId);

    Employee e1 = new Employee() {
      String 
    }


  }
  
}
