public class DemoLoop {
  public static void main(String[] args) {
    int x = 2;
    x = x * 2;
    x = x * 2;
    // 2^3

    // 2^10
    // ! for loop
    // for (initialization; condition; modifier)
    // step 1: i = 0
    // step 2: check if i < 3
    // step 3: yes, print hello
    // step 4: i + 1
    // step 5: check if i < 3
    // step 6: yes, print hello
    // step 7: i + 1
    // step 8: check if i < 3
    // step 9: yes, print hello
    // step 10: i + 1
    // step 11: check if i < 3
    // step 12: No -> exit loop
    for (int i = 0; i < 3; i++) { // i = 0, 1, 2, ... (always starts with i = 0)
      System.out.println("hello");
    }

    // 2^10
    int y = 2;
    for (int i = 0; i < 9; i++) { // i = 0,1,2,3,4,5,6,7,8,9
      y = y * 2;
    }
    System.out.println(y); // 1024

    // for + if
    // print even number between 0 - 10
    // even number -> x % 2 == 0
    int ev = 0;
    for (int i = 0; i < 11; i++) {
      ev = ev+1;
      if (ev % 2 == 0) {
      System.out.println(ev);

    }

  }

    //for + if
    // Print the char index of 'm', if found, print the index, if not found, print -1
    String s2 = "monk";
    //boolean isFound = false;
    int index = -1;
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == 'm') {
        index = i;
        //isFound = true;
      }
     } 
    System.out.println(index);
      
    
 }
}
