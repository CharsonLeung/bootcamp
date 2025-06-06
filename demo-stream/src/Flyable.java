import java.util.LinkedList;
import java.util.List;

public interface Flyable {
  void fly();


  // ! we need to create a class to implement Flyable (how to fly),
  // ! so that we can use the object of the class to invoke fly() method.
  public static void main(String[] args) {
    // ! Create an object, that is able to invoke fly implementation without explicity writting a class.
    Flyable superman = new Flyable() {
      // private String name = "John";

      @Override
      public void fly() {
        System.out.println("Superman is flying ..."  this.name);
      }
    };

    // this object is for one off usage,
    // Not intend to reuse it.
    superman.fly();

    Flyable superman2 = new Flyable() {
      @Override
      public void fly() {
        System.out.println("Superman is flying...");
      }
    };
    superman2.fly();

    // ! Nromally
    List<Flyable> flyableobjects = new LinkedList<>();
    flyableobjects.add(superman);
    flyableobjects.add(superman2);

  }
}
