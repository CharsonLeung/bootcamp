public class Exercise {
  public static void main(String[] args) {
    System.out.println("Exercise!");
    int a = 4;
    int b = 6;
    int c = a + b;
    int d = (a + b) + c;
    System.out.println(d);
    double a1 = 5.12;
    double a2 = 6.28;
    System.out.println(a1 * a2);
    double a3 = a1 + d;
    System.out.println(a3);
    double pi = 3.14159;
    int n = 4;
    double nPi = n * pi;
    System.out.println("multiple of pi is ");
    System.out.println(nPi);
    double e;
    e = 2.71828;
    System.out.println(e);
    System.out.println(pi / e);
    char name;
    name = 4;
    System.out.println(name);
    boolean logic;
    logic = 1 < 2;
    System.out.println(logic);
    boolean logik = 3 < 2.9999;
    System.out.println(logik);
    byte bz;
    bz = 1;
    System.out.println(bz);
    byte bzz = 102;
    System.out.println(bzz);


    double distKm = 42.195 * 100;
    System.out.println("Distance to run:");
    System.out.println(distKm / 100);
    int paceMin = 4 * 10;
    System.out.println("pace in minutes:");
    System.out.println(paceMin / 10);
    double paceSec = 15;
    System.out.println("pace in seconds:");
    System.out.println(paceSec);
    double lengthMin = 6;
    double paceSecDeci;
    paceSecDeci = (paceSec / lengthMin);
    System.out.println(paceSecDeci);
    double pace = paceMin + paceSecDeci;
    System.out.println(pace);
    double time = (distKm * pace) / 1000;
    System.out.println(time);
  }
}
