public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    String target = "c";

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...
    if (str.contains(target)) {
      System.out.println("Found.");
      System.out.println(str.lastIndexOf(target));
    } else {System.out.println("Not Found.");}
  }
}
