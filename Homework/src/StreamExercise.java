import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise {
  public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [100, 64, 36, 16, 4]
    List<Integer> output1 = numbers.stream()
                            .filter(n -> n % 2 == 0)
                            .collect(Collectors.toList());
    Integer m = 0;
    List<Integer> numbersSq = new ArrayList<>();
    for (int i = output1.size() - 1; i >= 0; i--) {
      m = output1.get(i) * output1.get(i);
      numbersSq.add(m);
    }
    System.out.println(numbersSq);
    //System.out.println(numbersSq.stream().sorted().toList());

    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    // Output: [Alice, Annie, Alex]
    List<String> namesA = names.stream()
                          .filter(name -> name.startsWith("A"))
                          .collect(Collectors.toList());
    System.out.println(namesA);

    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    // Output: Max: 30
    // Output: Min: 5
    // Comparator<Integer> numbers2Sorted =
    //    (number1, number2) -> number1.intValue() < number2.intValue() ? -1 : 1;
     List<Integer> numbersSorted = numbers2.stream()
                                  .sorted().collect(Collectors.toList());
    System.out.println("Max: " + numbersSorted.getLast());
    System.out.println("Min: " + numbersSorted.getFirst());
    
    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)
    List<Integer> wordsLength = words.stream()
                                .map(w -> w.length())
                                .collect(Collectors.toList());
    System.out.println(wordsLength);
    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    List<String> words2 = Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4
    long counter = words2.stream().filter(w -> w.length() > 3).count();
    System.out.println(counter);

    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
     // //Output: [15, 20]
    List<Integer> numbersSetp = numbers3.stream()
                                  .filter(n -> n > 10)
                                  .collect(Collectors.toList());
    Set<Integer> numbersSet = new HashSet<>();
    numbersSet = numbersSetp.stream()
                 .collect(Collectors.toSet());
    System.out.println(numbersSet);

    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.

    // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)

    // Output: {Alice=85, Bob=75}
    List<Student> students = new ArrayList<>();
    students.add(new Student("Alice", 85));
    students.add(new Student("Bob", 75));
    Comparator<Student> sortbyScore = 
        (student1, student2) -> student1.getScore() > student2.getScore() ? -1 : 1;
    List<Student> studentsDes = students
                                .stream().sorted(sortbyScore)
                                .collect(Collectors.toList());
    System.out.println(studentsDes);
    HashMap<String, Integer> studentsMap = new HashMap<>();
    for (Student s : studentsDes) {
    studentsMap.put(s.getName(), s.getScore());
    }
    System.out.println(studentsMap); // fail to order.
    
    

    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)
    List<Employee> employees = new ArrayList<Employee>();
      employees.add(new Employee("John", 65000));
      employees.add(new Employee("Jane", 55000));
      employees.add(new Employee("Doe", 40000));
      List<String> employeeF = employees.stream()
                                  .filter(e -> e.getSalary() > 50000)
                                  .map(e -> e.getName())
                                  .collect(Collectors.toList());
    // Output: [John, Jane]
    System.out.println(employeeF);

    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Alice", 30));
    persons.add(new Person("Bob", 25));
    persons.add(new Person("Charlie", 30));
    HashMap<Integer, List<String>> ageMap = new HashMap<>();
    int ageReq = 30;
    List<String> personAgeR1 = new ArrayList<>();
    personAgeR1 = persons.stream()
                  .filter(p -> p.getAge() == ageReq)
                  .map(p -> p.getName()).collect(Collectors.toList());
    ageMap.put(ageReq, personAgeR1);
    int ageReq2 = 25;
    List<String> personAgeR2 = new ArrayList<>();
    personAgeR2 = persons.stream()
                  .filter(p -> p.getAge() == 25)
                  .map(p -> p.getName()).collect(Collectors.toList());
    ageMap.put(ageReq2, personAgeR2);
    // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)
    System.out.println(ageMap);

    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    List<Staff> staffs = new ArrayList<>();
    staffs.add(new Staff("Alice", Gender.Female));
    staffs.add(new Staff("Bob", Gender.Male));
    staffs.add(new Staff("Charlie", Gender.Male));
    HashMap<Boolean, List<String>> result = new HashMap<>();
    List<String> maleStaffs = staffs.stream()
                            .filter(s -> s.getGender() == true).map(s -> s.getName())
                            .collect(Collectors.toList());
    List<String> femaleStaffs = staffs.stream()
                              .filter(s -> s.getGender() == false).map(s -> s.getName())
                              .collect(Collectors.toList());
    result.put(true, maleStaffs);
    result.put(false, femaleStaffs);
    System.out.println(result);

    // Output: {false=[Alice], true=[Bob, Charlie]} (Map)

    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
    List<Integer> numbers4F = numbers4.stream()
                              .filter(n -> n >= 10).map(n -> n * 2)
                              .collect(Collectors.toList());
    System.out.println(numbers4F);
    // Output: [30, 40, 60]

    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

    List<String> namesQ12 = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;
    HashMap<String, Integer> nameMap = new HashMap<>();
    List<Person> namesA12 = new ArrayList<>();
    for (int i = 0; i < namesQ12.size(); i++) {
      nameMap.put(namesQ12.get(i), defaultAge);
      namesA12.add(new Person(namesQ12.get(i), defaultAge));
      }
    List<String> namesA12F = namesA12.stream()
                              .map(p -> p.toString())
                              .collect(Collectors.toList());
    System.out.println(namesA12F);
    
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]

    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    List<String> wordsQ13 = Arrays.asList("hello", "world", "java");
    List<String> wordsA13 = wordsQ13.stream()
                            .map(w -> w.toUpperCase())
                            .collect(Collectors.toList());
    Deque<String> wordsA13F = new LinkedList<>();
    for (String word : wordsA13) {
      wordsA13F.add(word);
    }
    System.out.println(wordsA13F);

    // Output: [HELLO, WORLD, JAVA] (Deque)

    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    List<Integer> numbersQ14 = Arrays.asList(1, 2, 3, 4);
    Integer [] numbersA14 = new Integer[numbersQ14.size()];
    
    List<Integer> numbersQ14a = numbersQ14.stream()
                              .map(n -> n * n).collect(Collectors.toList());
    Integer[] numbersA14b = new Integer[numbersQ14.size()];
    System.out.println(numbersQ14a.stream().toArray());
    //numbersA14[0] = numbersQ14a.get(0);
                              
    for (int i = 0; i < numbersQ14a.size(); i++) {
    numbersA14[i] = numbersQ14a.get(i);
    }
    System.out.println(Arrays.toString(numbersA14));
    // Output: [1, 4, 9, 16]

    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.


    // Create Product Class
    List<Product> products = new ArrayList<>();
     products.add(new Product("Book", 10));
     products.add(new Product("Pen", 5));
     products.add(new Product("Notebook", 7));

     int productsPriceSum = products.stream()
                          .map(p -> p.price())
                          .collect(Collectors.toList()).stream()
                          .reduce(0, (a, b) -> a + b);
     System.out.println(productsPriceSum);
     
    // Output: 22

    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    List<Worker> workers = Arrays.asList(
      new Worker("Alice", "HR"),
      new Worker("Bob", "IT"),
      new Worker("Charlie", "HR"),
      new Worker("David", "IT")
    );

    List<String> hr = workers.stream().filter(w -> w.dept() == "HR")
          .map(w -> w.name()).collect(Collectors.toList());
    List<String> it = workers.stream().filter(w -> w.dept() == "IT")
          .map(w -> w.name()).collect(Collectors.toList());
    HashMap<String, List<String>> map = new HashMap<>();
    map.put("HR", hr);
    map.put("IT", it);
    System.out.println(map);

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}

    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sum = numbers5.parallelStream().mapToInt(n -> n.intValue()).sum();
    System.out.println(sum);
    // Output: 55


    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

    List<List<Integer>> listOfIntegers = Arrays.asList( //
        Arrays.asList(1, 2, 3), //
        Arrays.asList(4, 5, 6), //
        Arrays.asList(7, 8, 9) //
    );
    // Output: [6, 7, 8, 9]

    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits =
        Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    // Output: [apple, banana, grape, orange]

    // 20. Partitioning By
    // Task: Given a list of Childrens with their scores, partition the Childrens into passing and
    // failing
    // groups (pass if score >= 50).
    // Create Student first.

    // Create Children Class
    // new Children("Alice", 45)
    // new Children("Bob", 55)
    // new Children("Charlie", 40)
    // new Children("David", 70)

    // Output: {false=[Alice, Charlie], true=[Bob, David]}

    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.

    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
    // Output: "Java, Python, Rust, R, Go"

    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);

    // Output: 9

    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.

    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [4, 5, 6, 7, 8]

    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.

    List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]

    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.

    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");
    // Output: Optional[tiger]

    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    // Output: Optional.empty

    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates

    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
    // Output: [1, 2, 3, 4, 5, 6] (Set)

    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.

    List<String> keywords =
        Arrays.asList("stream", "filter", "map", "sorted", "collect");
    // Output: 28
  }

    // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)


public static class Student {
  
  private String name;
  private Integer score;

  public Student(String name, Integer score) {
    this.name = name;
    this.score = score;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setScore(Integer score) {
    this.score = score;
  }
  public String getName() {
    return this.name;
  }
  public Integer getScore() {
    return this.score;
  }
}
// Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)
public static class Employee {
  private String name;
  private Integer salary;

  public Employee(String name, Integer salary) {
    this.name = name;
    this.salary = salary;
  }
  public String getName() {
    return this.name;
  }
  public Integer getSalary() {
    return this.salary;
  }
}
// Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)
  public static class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
      this.name = name;
      this.age = age;
    }
    public String getName() {
      return this.name;
    }
    public Integer getAge() {
      return this.age;
    }
    //Person(name=Alice, age=30)
    @Override
    public String toString() {
      return "Person(name=" + this.name + ", age=" + this.age + ")";
    }
  }
      // Create Staff Class
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)
    public static class Staff {
      private String name;
      private Gender gender;

      public Staff(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
      }
      public String getName() {
        return this.name;
      }
      public Boolean getGender() {
        if (this.gender == Gender.Male)
        return true;
        else
        return false;
      }
    }
    public enum Gender {
      Male, Female;
    }
    // Create Product Class
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)
    public record Product(String name, int price) {
    }
    public record Worker(String name, String dept) {
    }
}