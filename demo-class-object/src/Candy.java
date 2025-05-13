public class Candy {
  private static int count = 0;
  private static int countLimit = 20;
  public String color;
  public int number;
  public static Candy [] candy;
  
  // Candy has color, number
  // ....
  public void setColor(String color) {
    this.color = color;
  }
  public void setNumber(int number) {
    this.number = number;
  }

  public Candy(String color, int number) {
    count++;
    if (count < countLimit + 1) {
    this.color = color;
    number = count;
    this.number = number;
  }
}
  public String getColor() {
    return this.color;
  }
  public int getNumber() {
    return this.number;
  }


  
  public static void main(String[] args) {
    // Creation of Candy;
    Candy [] candy = new Candy[countLimit];
    for (int i = 0; i < candy.length; i++) {
      if (((i + 1) % 2 == 0 && (i + 1) % 3 > 0) && (i + 1) % 7 > 0) {
        candy[i] = new Candy("Red", count);
      } else if ((i + 1) % 3 == 0) {
        candy[i] = new Candy("Yellow", count);
      } else if ((i + 1) % 7 == 0) {
        candy[i] = new Candy("Blue", count);
      } else {
        candy[i] = new Candy("Green", count);
      }
      System.out.println(candy[i].color + " " + candy[i].number);
    }

    // Distribute 20 candy to 3 Students
Student [] candyReceiver = new Student[Student.scountLimit];
    candyReceiver[0] = new Student("Peter", Student.scount);
    candyReceiver[1] = new Student("Paul", Student.scount);
    candyReceiver[2] = new Student("Mary", Student.scount);
    System.out.println("We now have " + Student.scountLimit + " students to receive candys:");
    for (int i = 0; i < candyReceiver.length; i++) {
      System.out.println(candyReceiver[i].name + " " + candyReceiver[i].sid);
    }
    
  
    // Every Student has his own candies
    
    for (int i = 0; i < candy.length; i++) {
      if (i < 3) {
        candyReceiver[i].stuReceives(candy[i]);
        System.out.println(candyReceiver[i].name + " receives " + candy[i].color +" "+ candy[i].number);
      } else if (i >= 3) {
        for (int n = 1; n <= candy.length / 3; n++) {
          if (i >= 3 * n && i < 3 * (n + 1)) {
        candyReceiver[i % (3 * n)].stuReceives(candy[i]);
        System.out.println(candyReceiver[i % (3 * n)].name + " receives " + candy[i].color + " " + candy[i].number);
        
      
          } 
        }
      }
    }
       for (int i = 0; i < candyReceiver.length; i++) {
         System.out.println(candyReceiver[i].name + " has received " + candyReceiver[i].gotCandy() + " candys. ");
         // System.out.println(candyReceiver[i].name + candy[i].color + candy[i].number);

       }
    // print out the candy (color, number) of every students

    // Use loop to distribute candy. (for loop or while loop)

    // Teacher.java -> distribute
    // t1.distribute
    // Student finally hold candies
    // Student -> receive(Candy candy)
    // who owns the attribute, who has the resonsibility to modify.


  
    // warrior.attack(archer)
    // public void attack(Archer archer) {
    //    archer.deductHP(10)
    // }
} 
}
