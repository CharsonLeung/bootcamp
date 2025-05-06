public class BWV {
  private Integer number;
  private String key;
  private boolean isMajor;
  private String keyFull;
  private String inst;

  public void setNumber(int number) {
    this.number = number;
  }
  public void setKey(String key) {
    this.key = key;
  }
  public void setIsMajor(boolean isMajor) {
    this.isMajor = isMajor;
  }
  public void setKeyFull(String keyFull) {
    this.keyFull = keyFull;
  }
  public void setInst(String inst) {
    this.inst = inst;
  }
  public void setBWV(int number) {
    this.number = number;
  }
  public String getBWV() {
    String verzeichnis = "BWV ";
    return verzeichnis.concat(this.number.toString());
  }
  public String getKey() {
    return this.key;
  }
  public boolean getIsMajor() {
    if ((int)this.key.charAt(0) >= 65 && (int)this.key.charAt(0) <= 71) {
      return this.isMajor = true;
    } else {
      return this.isMajor = false;
    }
  }
  public String getKeyFull() {
    if (this.isMajor) {
      return
      this.keyFull = this.key.concat(" Major");
    } else {
      return this.keyFull = this.key.concat(" minor");
    }
  }
  public String getInst() {
    return this.inst;
  } 
  public String getAll() {
    return getBWV().concat(" ").concat(getInst()).concat(" in ").concat(getKeyFull());
  }
  public static void main(String[] args) {
      // BWV 996 - BWV 1012
  int bwvStart = 995;
  int bwvEnd = 1012;
  BWV [] bwv = new BWV[bwvEnd - bwvStart + 1];
  //BWV b1 = new BWV();
    for (int i = 0; i < bwv.length; i++) {
      bwv[i] = new BWV();
      bwv[i].setNumber(i + bwvStart);
    }
   //bwv[0].setNumber(996);
   
   //System.out.println(bwv[0].getBWV());
   //System.out.println(bwv[0].getIsMajor());
   //System.out.println(bwv[0].getKeyFull());
   //System.out.println(bwv[0].getInst());

   for (int i = 0; i < 6; i++) {
    bwv[i].setInst("Suite for Lute");
    bwv[i + 6].setInst("Sonatas and Partitas for solo Violin");
    bwv[i + 6 + 6].setInst("Suite for Cello");
   }
   bwv[0].setKey("g"); // 995
   bwv[1].setKey("e");
   bwv[2].setKey("c");
   bwv[3].setKey("Eb");
   bwv[4].setKey("c");
   bwv[5].setKey("g"); // 1000
   bwv[5 + 1].setKey("g"); // 1001
   bwv[5 + 2].setKey("b");
   bwv[5 + 3].setKey("a");
   bwv[5 + 4].setKey("d");
   bwv[5 + 5].setKey("C");
   bwv[5 + 6].setKey("E"); // 1006
   bwv[5 + 6 + 1].setKey("G"); // 1007
   bwv[5 + 6 + 2].setKey("d");
   bwv[5 + 6 + 3].setKey("C");
   bwv[5 + 6 + 4].setKey("Eb");
   bwv[5 + 6 + 5].setKey("c");
   bwv[5 + 6 + 6].setKey("D"); // 1012
   
   for (int i = 0; i < bwv.length; i++) {
    bwv[i].getKey();
    bwv[i].getIsMajor();
    bwv[i].getKeyFull();
    System.out.println(bwv[i].getAll());
   }

    // How to create new BWV with for loop, e.g. BWV bwvi = new BWV(); ?
    }
  }
