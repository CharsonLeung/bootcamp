import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SuperQueue {
  private Stack<String> s1;
  private Stack<String> s2;

  // constructor
  public SuperQueue() {
    this.s1 = new Stack<>();
    this.s2 = new Stack<>();
  }
  
  public Stack<String> add(String word) {
    s1.push(word);
    s2.push(word);
    return this.s1;
  }
  public String poll() { // (take away the first element from the queue)
    this.s1.remove(0);
    String element = this.s2.getFirst();
    this.s2.remove(0);
    return element;
    
  }
  public int size() {
    return this.s1.size();
  }
  public boolean isEmpty() {
    return this.s1.isEmpty();
  }
  // 2 Stacks to implement SuperQueue (same as Queue)
  // 1. add
  // 2. poll
  // 3. size
  // 4. isEmpty

  public static void main(String[] args) {
    Queue<String> q1 = new LinkedList<>();
    q1.add("John");
    q1.add("Peter");
    q1.add("Oscar");
    System.out.println(q1.poll()); // John
    System.out.println(q1.size()); // 2
    System.out.println(q1.isEmpty()); // false

    SuperQueue sq1 = new SuperQueue();
    sq1.add("Alan");
    sq1.add("Bob");
    sq1.add("Candy");
    System.out.println(sq1.size());
    System.out.println(sq1.isEmpty());
    System.out.println(sq1.poll());
    System.out.println(sq1.size());
    System.out.println(sq1.poll());
    System.out.println(sq1.size());
    System.out.println(sq1.poll());
    System.out.println(sq1.size());
    System.out.println(sq1.isEmpty());
  }
  
}
