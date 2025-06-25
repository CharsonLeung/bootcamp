import java.util.ArrayList;
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
  
  public Stack<String> add(String element) {
    // ! step 1: loop move to 2nd stack
    // ! step 2: put the element into 1st stack
    // ! step 3: loop move back to 1st stack
    s1.clear();;
    s2.push(element);
    
      if (s2.size() > 0) {
      for (int i = s2.size() - 1; i >= 0; i--) {
        s1.push(s2.get(i));
      }
    return s1;
    } else {
      throw new IllegalStateException("Queue is empty.");
    }
  } 


  public String poll() { // (take away the first element from the queue)
    if (s1.size() > 0) {
      return s1.pop();
  } else {
    throw new IllegalStateException("Queue is empty.");
  }
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

// test method
public ArrayList<String> toArrayList() {
  ArrayList<String> output = new ArrayList<>();
  for (int i = 0; i < s1.size(); i++) {
  output.add(this.s1.elementAt(i)); 
  }
  return output;
}
public ArrayList<String> toArrayList2() {
  ArrayList<String> output = new ArrayList<>();
  for (int i = 0; i < s2.size(); i++) {
  output.add(this.s2.elementAt(i)); 
  }
  return output;
}
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
    System.out.println(sq1.toArrayList());
    System.out.println(sq1.toArrayList2());
    System.out.println(sq1.isEmpty());
    System.out.println(sq1.size());
    System.out.println(sq1.poll());
    System.out.println(sq1.size());
    System.out.println(sq1.poll());
    System.out.println(sq1.size());
    System.out.println(sq1.poll());
    System.out.println(sq1.size());
    System.out.println(sq1.isEmpty());
  }
  
}
