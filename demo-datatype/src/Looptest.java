public class Looptest {
  public static void main(String[] args) {
    // 1/1 + 1/(1*2) + 1/(2*3) + 1/(2*3*4) + 1/(2*3*4*5) + ...
    
    
    // t ^ n
    int t = 2; // change this value to be powered
    int t1 = t;
    int n1 = t;
    int pw = 12; // select the power to
    for (int i = 0; i < pw - 1; i++ ) {
      //n += n;
      
      t = t * n1 ;
      
        }
    System.out.println(t1 + "^" + pw + " = " + t);

    // 1(n+1)(n+2)(n+3)...(factorial)
    int i;
    int n = 1;
    int ff = 7;
   
    for ( i = 0; i <= ff - 1 ; i++) {
      // n2 = 1(2), n3 = 2(3), n4 = 6(4), n5 = 24(5), n = 120(6), ...
       n = n * (i+1);
      //System.out.println(n);
     
    } System.out.println(ff + "! = " + n);

    System.out.println("=================================");
    // 1 + (1 * 2) + (1 * 2 * 3) + (1 * 2 * 3* 4) + ...
    long m = 1;
    long m1 = 0;
    int fact = 7; // change this value for result
    for (i = 0; i <= fact - 1 ; i++) {
      m = m * (i + 1);
      m1 = m1 + m;
      
      System.out.println(i+1 + "! = " + m);
      
    } 
    System.out.println("Sum of factorials of above is " + m1);
    System.out.println("=======================================");

// 1/1 + 1/(1*2) + 1/(2*3) + 1/(2*3*4) + 1/(2*3*4*5) + ...
    m = 1;
    m1 = 0;
    float m2 = 1;
    double e;
    fact = 5;
    for (i = 0; i <= fact - 1; i++) {
      m = m * (i + 1);
      m1 = m1 + m;
      m2 = m2 + 1/m;
      m2 = m2 * 1000000;
     
  }  
  if (m >= 0) {
  System.out.println(m);} else {System.out.println("ERROR");}
  e = m2 / 1000000;
  System.out.println(m1);
  System.out.println(e);
  System.out.println("=================================");
  int a = 9; // a ^ ap
  int ap = 4;
  int b = a;
  for (i = 0; i < ap - 1; i++) {
    a = a * b;
  }
  System.out.println(a);
  
    if ( a % 2 == 0 ) {System.out.println("The number is even.");} else 
    {System.out.println("The number is odd.");}
  


  }

}