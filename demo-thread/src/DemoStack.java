import java.util.List;
import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    // Queue: first in first out
    // Stack: first in last out
    Stack<String> s1 = new Stack<>();
    s1.push("John");
    s1.push("Peter");
    s1.push("Vincent");
    System.out.println(s1.pop()); /// Vincent
    System.out.println(s1.size()); // 2
    System.out.println(s1.pop()); // Peter
    System.out.println(s1.size()); // 1
    
    // undo redo
    

    // Hot interview Qusetion: Using 2 Stacks implement a Queue

  }
  
}
