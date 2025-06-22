public class SuperOptional<T> {
  private T object; // null

  public SuperOptional(T object) {
    this.object = object;
  }

  public T get() {
    return this.object;
  }
  public static void main(String[] args) {
    // A box may contian integer
    SuperOptional<Integer> integer = new SuperOptional<>(null);
    System.out.println(integer.get());

  }
}
