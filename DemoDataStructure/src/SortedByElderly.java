import java.util.Comparator;

public class SortedByElderly implements Comparator<Person> {
  @Override
  public int compare(Person p1, Person p2) {
    if (p1.isElderly())
      return -1;
    if (p2.isElderly())
      return 1;
    if (p1.getAge() > p2.getAge())
    return -1;
     return 1;
  }
}
