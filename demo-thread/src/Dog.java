// package demo-thread.src;

public class Dog {
  private int x;

  // ! locking the method (static or instance)
  // only one commander can ask this dog to sleep
  public synchronized void sleep() {
    this.x = this.x + 1;
  }

  public int getX() {
    return this.x;
  }
  public static void main(String[] args) { // main thread
    Dog dog = new Dog();

    Runnable task1 = () -> {
      for (int i = 0; i < 100_000; i++) {
        dog.sleep();
      }
    };

    // main Thread, main Thread is like the manager
    Thread worker1 = new Thread(task1); // created thread 1
    Thread worker2 = new Thread(task1); // created thread 2

    worker1.start(); // inform worker 1 to start working
    worker2.start(); // inform worker 2 to start working

    try {
      worker1.join(); // main thread wait worker 1 here, until worker 1 completed the task  
      worker2.join(); // main thread wait worker 2 here, until worker 2 completed the task
     } catch(InterruptedException e) {

    }

    System.out.println(dog.getX()); // 200000
  }
}
