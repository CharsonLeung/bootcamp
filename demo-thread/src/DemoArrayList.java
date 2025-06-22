import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoArrayList {

  public static void main(String[] args) {
    // Problem: ArrayList's behavior is not atomic
    // Solution: Vector
    // ! For Data Structure, we can just change the implementation. (Polymorphism)
    List<Integer> integers = new Vector<>();
    List<Integer> integers2 = new ArrayList<>();

  // Task add 1 into list 100_000 times
  Runnable task = () -> {
  for (int i = 0; i < 100_000; i++) {
    integers.add(1);
    }
  };
  Runnable task2 = () -> {
  for (int i = 0; i < 100_000; i++) {
    integers2.add(1);
    // System.out.println(integers2.size());
  }
};
long before = System.currentTimeMillis();
Thread worker1 = new Thread(task);
Thread worker2 = new Thread(task);
Thread worker3 = new Thread(task2);
Thread worker4 = new Thread(task2);

worker1.start();
worker2.start();

try {
      worker1.join(); // main thread wait worker 1 here, until worker 1 completed the task  
      worker2.join(); // main thread wait worker 2 here, until worker 2 completed the task
     } catch(InterruptedException e) {

    }

// list size() -> 200_000
long after = System.currentTimeMillis();
// ! For "time used", Victor has lower performance, because all of its behavior are synchronized.
// ! ArrayList has error. Because underlying data structure is array, so the copt array process may hit error.
System.out.println("Time used: " + (after - before));
System.out.println(integers.size()); // < 200_000 if the object is ArrayList
before = System.currentTimeMillis();  
  worker3.start();
  worker4.start();
  worker3.interrupt();
  worker4.interrupt();

while (integers2.size() != 200_000) {
  worker3.run();
  worker4.run();
  try {
      worker3.join(); // main thread wait worker 1 here, until worker 1 completed the task  
      worker4.join(); // main thread wait worker 2 here, until worker 2 completed the task
     } catch(InterruptedException e) {

    }
      worker3.interrupt();
      worker4.interrupt();
      System.out.println(integers2.size());
      if (integers2.size() == 200_000) {
        after = System.currentTimeMillis();
        System.out.println(integers2.size());
        System.out.println("Time used: " + (after - before));
      } else {
  integers2.clear();
      }
} 
//System.out.println(integers2.size());
  }
}
