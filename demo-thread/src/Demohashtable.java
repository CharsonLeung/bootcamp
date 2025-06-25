import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demohashtable {

  public static synchronized Map<String, Integer> plusOne(Map<String, Integer> map) {
    // ! 2 actions: getOrDefault and put
    map.put("bootcamp", map.getOrDefault("bootcamp", 0) + 1);
    return map;
  }

  public static void main(String[] args) {
    // Hashtable (Thread-safe) vs HashMap (non thread-safe)
    Map<String, Integer> demoMap0 = new HashMap<>(); // non thread-safe
    Map<String, Integer> demoMap = new Hashtable<>(); // thread-safe

    Runnable task = () -> {
    for (int i = 0; i < 100_000; i++) {
      plusOne(demoMap0); // pass by reference
    }
  };

  Thread worker1 = new Thread(task);
  Thread worker2 = new Thread(task);

  worker1.start();
  worker2.start();

  try {
    worker1.join();
    worker2.join();
  } catch (InterruptedException ex) {

  }
  System.out.println(demoMap0.get("bootcamp"));
  }
  
}
