public class DemoOperator {
  public static void main(String[] args) {
    // +, -, *, /, %
    int x = 3;
    x = 6 + 9;

    int y = 5 + x - 10;
    System.out.println(y); //10

    // 9 + 2 first
    int a = y - 9 * 2;
    System.out.println(a); // -8

    int b = (y - 9) * 2;
    System.out.println(b); //2

    b = ((b - 10) + 2) * 2;
    System.out.println(b); //-22

    // divided by zero
    int r2 = 0 / 10;
    System.out.println(r2);

    // java: int / int -> int (no remainder, no decimals)
    int r3 = 10 / 3;
    System.out.println(r3); // 3
    System.out.println(5 / 2); // 2
    // double / int -> double / double -> double
    System.out.println(5.0 / 2); // 2.5

    int score1 = 71;
    int score2 = 82;
    // (int + int) / int -> int
    // ! (int + int) / double -> double
    double averageScore = (score1 + score2) / 2.0;
    System.out.println(averageScore);


    // Big problem
    double d5 = 0.1 + 0.2;
    System.out.println(d5); // 0.30000000000000004 (binary cannot do <1 accurately)

    double d6 = 0.2 + 0.3;
    System.out.println(d6); // 0.5

    // remainder (餘數) of 10 / 3
    int r8 = 10 % 3;
    System.out.println(r8); // 1

    int johnAge = 67;
    boolean isElderly = johnAge >= 65;
    System.out.println(isElderly); //false

    //boolean isMale = true; //must start with "is", "should", etc.

    // char
    // single quote ''
    // assign char value 'a' into char variable
    char c1 = 'a';
    System.out.println(c1); // a
    c1 = '#';
    c1 = '*';
    c1 = 'a';
    char c2 = 'A';
    System.out.println(c1 == c2); // false, because Java is case sensitive

    char lastName = '梁';
    System.out.println(lastName);
    // We cannot assign a bigger range of variable to smaller range of variable (by default)
    // Force assignment (by Vincent Lau)
    byte b40 = (byte) 129L;
    System.out.println(b40); // -127 (overflow)

    // + 1 and -1
    int t = 0;
    t++;
    ++t;
    t = t + 1;
    // "= t + " -> "+="
    t += 1;
    System.out.println(t); // 4

    int w = 0;
    w--;
    --w;
    w = w - 1;
    w -= 1;
    System.out.println(w);

    // +/- non 1 value
    int o = 3;
    o -= 4;
    o += 4;
    System.out.println(o); // 3

    int q = 3;
    q = q * 3;
    q *= 3; //q = q * 3
    System.out.println(q); // 27

    int v = 27;
    v /= 3;
    v = v / 3;
    System.out.println(v);  // 3

    int v1 = 4;
    v1 *= 4;
    System.out.println(v1); // 4

    // Comparison
    // >, <, >=, <=, ==, !=
    int score = 91;
    boolean isGradeA = score >= 90;
    System.out.println(isGradeA); // true

    char gender = 'F';
    boolean isFemale = gender != 'M';
    System.out.println(isFemale); // true


  }
  
}
