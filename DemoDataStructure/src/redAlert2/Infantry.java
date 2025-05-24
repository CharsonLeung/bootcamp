package redAlert2;

public enum Infantry {
  Conscript("Conscript", 100),
  AttackDog("Dog", 200),
  FlakTrooper("Flak", 300),
  Engineer("Engineer", 500),
  TeslaTrooper("Tesla", 500),
  ;
  private String infName;
  private int value;
  

  private Infantry(String infName, int value) {
    this.infName = infName;
    this.value = value;
  }
  public String getName() {
    return this.infName;
  }
  public int getValue() {
    return this.value;
  }

  public static void main(String[] args) {
    Infantry [] infantryArr = new Infantry [] 
  {Conscript,
  AttackDog,
  FlakTrooper,
  Engineer,
  TeslaTrooper
  };
  }
}
