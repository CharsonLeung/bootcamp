public class Teacher {
  private Candy[] candies;

  public Teacher(Candy[] candies) {
    this.candies = candies;
  }

  public void distribute(Student [] students) {
    int count = candies.length;
    boolean completed = false;
    while (--count >= 0) {
      for (int i = 0; i < students.length; i++) {
        if (--count < 0) {
          completed = true;
          break;
        }
        distribute(students[i], candies[count]);
        this.candies[count] = null;
    }
    if (completed) {
      break;
    }
  }
}
  public void distribute(Student student, Candy candy) {
    student.receives(candies);
    //this.candies[count] = null;
  }
  public static void main(String[] args ) {
    Candy c1 = new Candy("RED", 3);
    Candy c2 = new Candy("BLUE", 4);
    Candy c3 = new Candy("YELLOW", 6);
    Candy c4 = new Candy("RED", 8);
    Candy c5 = new Candy("BLUE", 7);
    Candy c6 = new Candy("YELLOW", 9);
    Candy c7 = new Candy("RED", 11);
    Candy c8 = new Candy("BLUE", 12);
    Candy c9 = new Candy("YELLOW", 13);
    Candy c10 = new Candy("RED", 15);
    Candy c11 = new Candy("BLUE", 14);
    Candy c12 = new Candy("YELLOW", 17);
    Candy c13 = new Candy("RED", 18);
    Candy c14 = new Candy("BLUE", 14);
    Candy c15 = new Candy("YELLOW", 22);
    Candy c16 = new Candy("RED", 23);
    Candy c17 = new Candy("BLUE", 56);
    Candy c18 = new Candy("YELLOW", 63);
    Candy c19 = new Candy("RED", 43);
    Candy c20 = new Candy("BLUE", 53);
    Candy [] candies = new Candy[] {
      c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20};
    Teacher teacher = new Teacher(candies);

    Student2[] students = new Student2[] {new Student2(), new Student2(), new Student2(),};
    teacher.distributeCandy(students);
    }

  }
