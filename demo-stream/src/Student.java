public class Student { // ! Outer Class
  private Long id;

  public Student(Long id) {
    this.id = id;
  }

  // ! Not allowed
  //public String getBookName() {
  // return name;
  //}

  public void revision() {
    
    class Watch {
      private String value;
      // constructor
      // getter, setter, etc
    }
    new Watch(); // able to crete Watch Object within revision() method
  }

  public void write() {
    // new Watch();
  }

  public class Book {  // ! Inner Class
    private String name;

    public Book(String name) {
      this.name = name;
    }

    public Long getOwnerId() {
      return id;
    }
  }

  public static void main(String[] args) {
    Student s1 = new Student(1L);
    Book b1 = s1.new Book("ABC"); // each of them has its own address

    System.out.println(b1.getOwnerId());
  }
}
