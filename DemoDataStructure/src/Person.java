import java.util.PriorityQueue;
import java.util.Queue;

public class Person {
  private int age;
  
  public Person(int age) {
    this.age = age;
  }
  public boolean isElderly() {
    return this.age > 65;
  }
   public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Queue<Person> persons = new PriorityQueue<>(new SortedByElderly());
    persons.add(new Person(55));
    persons.add(new Person(10));
    persons.add(new Person(23));
    persons.add(new Person(18));

    for (Person p : persons) {
      System.out.println(p.getAge());
    }
    System.out.println(persons.poll().getAge()); // 55
    System.out.println(persons.poll().getAge()); // 23
    System.out.println(persons.poll().getAge()); // 18
    persons.add(new Person(13));
    persons.add(new Person(67));
    persons.add(new Person(66));
    System.out.println(persons.poll().getAge()); // 66
    System.out.println(persons.poll().getAge()); // 67
    System.out.println(persons.poll().getAge()); // 13

    // ! sorting during add() or poll() ?
    // Answer: poll()

    Queue<Person> persons2 = new PriorityQueue<>(new SortedByElderly());
    persons2.add(new Person(2));
    persons2.add(new Person(4));
    persons2.add(new Person(3));
    persons2.add(new Person(1));
    while (!persons2.isEmpty()) {
      System.out.println(persons2.poll().getAge()); // 4, 3, 2, 1
    }
  }
}
