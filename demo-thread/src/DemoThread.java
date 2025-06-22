// package demo-thread.src;

import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread {
  // ! Solution 2: AtomicInteger
  private int x;
  private AtomicInteger y = new AtomicInteger(0); // for counting

  // ! Solution 1: synchronized (For method use)
  // ! locking the method (static or instance)
  // only one commander can ask this dog to sleep
  // public synchronized void sleep() {}
  public synchronized void addOne() {
    this.x = this.x + 1; // read + write (2 operations)
  }

  public void eat() {
    y.getAndIncrement(); // revise itself
  }

  public int getX() {
    return this.x;
  }
  public int getY() {
    return this.y.get();
  }
  public static void main(String[] args) { // main thread
    DemoThread demoThread = new DemoThread();

    Runnable task1 = () -> {
      for (int i = 0; i < 100_000; i++) {
        demoThread.addOne();
      }
    };

    // main Thread
    Thread worker1 = new Thread(task1); // created thread 1
    Thread worker2 = new Thread(task1); // created thread 2

    worker1.start(); // inform worker 1 to start working
    worker2.start(); // inform worker 2 to start working

    try {
      worker1.join(); // main thread wait worker 1 here, until worker 1 completed the task  
      worker2.join(); // main thread wait worker 2 here, until worker 2 completed the task
     } catch(InterruptedException e) {

    }

    System.out.println(demoThread.getX()); // 200000
    
    // Solution 2:
    DemoThread dog2 = new DemoThread();
    Runnable task2 = () -> {
      for (int i = 0; i < 100_000; i++) {
        dog2.eat();
      }
    };
    Thread worker3 = new Thread(task2); // created thread 3 send email
    Thread worker4 = new Thread(task2); // created thread 4 send SMS

    worker3.start(); // inform worker 3 to start working
    worker4.start(); // inform worker 4 to start working
    
    System.out.println(dog2.getY());
  
  }
}
