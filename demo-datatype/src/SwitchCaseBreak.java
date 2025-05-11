public class SwitchCaseBreak {
  public static void main(String[] args) {
    int a = 9;
    int b = 8;
    int x = a;
    for (int i = 0; i < b; i++) { // a^b
       x = x * a;
    
       if (x % 2 == 0) {
        System.out.println(x);
      } else if (x % 3 == 0) {
        System.out.println(x);
        
      } 
    } break
    
    System.out.println(x);
  }
  
}
