public class Staff {
  private long id;

  public Staff(long id) {
    this.id = id;
  }

  public long getId() {
    return this.id;
  }
  // equals() -> String, Integer, Double

  public boolean equals(Staff1 staff) {
    if (this.id == staff.getId()) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Staff1 s1 = new Staff1(1L); // Objects
    
    // asking if the staff Id = 1;
    if (s1.getId() == 1) {}  
  

  if (s1.equals(new Staff1(1L))) { 
    // suppose true, but false now (if we do not rewrite equals() method)
// ! by default, Java implicity say that equals() checking object's address

// after rewriting the equals method, new Staff(1) equals new Staff(1)
}
System.out.println(s1.equals(new Staff1(1L)));
//String str = "hello";
  //if (str.equals("hello")) {
  //}
  

  } 
}
