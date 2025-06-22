public class DemoRecord {

  public static void main(String[] args) {
    Staff1 staff1 = new Staff1("John", 25);
    // Staff staff2 = new Staff(); // The constructor Staff() is undefined

    System.out.println(staff1.age()); // 25
    System.out.println(staff1.name()); // John

    // equals()
    Staff1 staff2 = new Staff1("John", 25);
    System.out.println(staff1.equals(staff2)); // true

    // hashCode()
    System.out.println(staff1.hashCode() == staff2.hashCode()); // true

    // toString()
    System.out.println(staff1.toString());
  }

  
}
