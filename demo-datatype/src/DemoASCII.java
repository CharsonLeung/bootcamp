public class DemoASCII {
  public static void main(String[] args) {
    // convert char to int
    char c = 'a'; // 97 in ascii
    int x = c; // safe
    System.out.println(x); // 97

    int y = 65;
    char c2 = (char) y; //during compite time, variable y is not safe. 
    // convert from in to char un-safe. java doesn't care what value y is. Therefore, unsafe
    System.out.println(c2); // 'A'

    // ! char 0-65535
    System.out.println((char) 65610); // J (ASCII: 74)

    int x1 = 128;
    byte b1 = (byte) x1; // overflow
    System.out.println(b1); // -128

    // byte -> short -> int -> long -> float -> double
    // char -> int
    float f1 = 10L;
    System.out.println(f1); // 10.0
    double d1 = 100.25;
    System.out.println(d1); // 100.25

    long l2 = (long) 10.9;
    System.out.println(l2); // 10

    int x8 = 33000;
    short s3 = (short) x8;
    System.out.println(s3); // -32536

  }
}
