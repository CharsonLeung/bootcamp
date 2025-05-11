public class Student {
  public static int scount = 0;
  public static int scountLimit = 3;
  public String name;
  public long sid;
  private Candy[] stuCandys;
  public static Student [] candyReceiver;

  public Student(String name, long sid) {
    scount++;
    if (scount < scountLimit + 1) {
    this.name = name;
    sid = scount;
    this.sid = sid;
    this.stuCandys = new Candy[0];
    }
  }
  public void stuReceives(Candy disNumber) {
    Candy[] newStuCandys = new Candy[this.stuCandys.length + 1];
    for (int i = 0; i < this.stuCandys.length; i++) {
      newStuCandys[i] = stuCandys[i];
    }
    newStuCandys[newStuCandys.length - 1] = disNumber;
    this.stuCandys = newStuCandys;
  }
  public int gotCandy() {
    int total = 0;
    for (int i = 0; i < this.stuCandys.length; i++) {
      total++;
    }
    return total;
  }


  public static void main(String[] args) {
    Student [] candyReceiver = new Student[scountLimit];
    candyReceiver[0] = new Student("Peter", scount);
    candyReceiver[1] = new Student("Paul", scount);
    candyReceiver[2] = new Student("Mary", scount);
    System.out.println("We now have " + scountLimit + " students to receive candys:");
    for (int i = 0; i < candyReceiver.length; i++) {
      System.out.println(candyReceiver[i].name + " " + candyReceiver[i].sid);
    }
    //System.out.println(Candy.candy[0].number);
    

  }


}
