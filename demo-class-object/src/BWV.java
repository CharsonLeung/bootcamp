public class BWV {
  private int number;
  private String key;
  private String inst;

  public void setNumber(int number) {
    this.number = number;
  }
  public void setKey(String key) {
    this.key = key;
  }
  public void setInst(String inst) {
    this.inst = inst;
  }

  public int getNumber() {
    return this.number;
  }
  public String getKey() {
    return this.key;
  }
  public String getInst() {
    return this.inst;
  } 
  public static void main(String[] args) {
      // BWV 996 - BWV 1012
    //String looper = "b";
    int [] loop = new int[1012 - 996 + 1];
    for (int i = 0; i < 1012 - 996 + 1; i++) {
      loop[i] = i + 996;
      System.out.println("bwv" + loop[i]);
    // How to create new BWV with for loop, e.g. BWV bwvi = new BWV(); ?
    }
  }
}