import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    // Queue
    // 1. add() -> addLast()
    Queue<String> fruits = new LinkedList<>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("lemon");
    System.out.println(fruits.poll()); // apple (take away the first element from the queue)
    System.out.println(fruits.size()); // 2
    System.out.println(fruits.peek()); // orange (Take a look on the first element)
    System.out.println(fruits.size()); // 2
    // no get() method in Queue

    // The most common logic to use a queue.
    while (!fruits.isEmpty()) {
      System.out.println(fruits.poll());
    }
    if (fruits.contains("lemon")) {

    }

    // ! why queue? arraylist is also with ordering
    // 1. Queue has less methods to use (specific usage), while list is more general for more scenario.

    // ! The difference between LinkedList and ArrayDeque, while using Queue interface
    // 1. The underlying data structure.

    // ! Deque: add and remove from first element and last element
    Deque<String> fruits2 = new LinkedList<>();
    fruits2.addLast("appple");
    fruits2.addFirst("orange");
    fruits2.addFirst("lemon");
    fruits2.addLast("waterlemon");
    System.out.println(fruits2); // [lemon, orange, apple, waterlemon]
    System.out.println(fruits2.size());
    if (fruits2.contains("Orange")) {
      
    }


    //List<String> fruits3 = new List<>();
  }
}
