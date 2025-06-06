public class DemoRecursion {
  public static void main(String[] args) {
    int n = 10;
    // 1+2+3+4+5+...+10
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += 1;
    }
    // recursion
    System.out.println(sum(5));
    // even numbers
    System.out.println(sumEvenNumber(11));
  }
  
  public static int sum(int n) {
    // Step 1: Base case (exit criteria)
    if (n == 1) {
      return 1;
    }
    // Step 2: call itself
    return n = sum(n - 1);
  }
  // 5 + sum(4)
  // 4 + sum(3)
  // 3 + sum(2)
  // 2 + sum(1)
  // n == 1 finally

  // result = 1+2+3+4+5

  // 2. given n, sum up all even numbers starting from 1
  public static int sumEvenNumber(int n) {
    if (n % 2 == 1)
      n--;
      return n + sum2(n);    
  }

  // sequence: 2 + 4 + 6 + 2n
  public static int sum2(int n) {
    if (n == 2) {
      return 2;
    }
    return n + sum2(n - 2);
  }
}
