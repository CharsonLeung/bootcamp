public class SmallerThan1 {
  public static void main(String[] args) {
    double k = 42.195 * 100;
    int m = 4 * 10;
    double s = 15;
    double ml = 6;
    double minSec = (s / ml);
    System.out.println(minSec);
    System.out.println(m + minSec);
    System.out.println("Running time for");
    System.out.println(k / 100);
    double result = (k * (m + minSec)*10)/10000;
    //double resultSec = 
    System.out.println(result); //wanted: 10km * 4:30 = 45 mins
  }
}
