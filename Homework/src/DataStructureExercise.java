import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DataStructureExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    ArrayList<Integer> integers = new ArrayList<>();
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    for (int i = 1; i <= 5; i++ ) {
      integers.add(i * 10);
      }
    // 1c. Print all the elements in the list.
    System.out.println(integers);
    // 1d. Remove the number 30 from the list.
    integers.remove(3);
    // 1e. Print the size of the list.
    System.out.println(integers.size());

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");
    // 2b. Check if "Grapes" exists in the list.
    String checkFruit = "Grapes";
    // 2c. If it doesn’t exist, add it to the list.
    if (!fruits.contains(checkFruit)) {
      System.out.println("The ArrayList 'fruits' does not contain " + checkFruit);
      fruits.add(checkFruit);
      System.out.println(checkFruit + " is added into the ArrayList.");
    }
    // 2d. Update "Mango" to "Peach".
    fruits.set(fruits.indexOf("Mango"), "Peach");
    // 2e. Print the final list.
    System.out.println(fruits);

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(10);
    numbers.add(30);
    numbers.add(40);
    numbers.add(20);
    numbers.add(50);
    // 3b. Remove duplicates from the list using a HashSet.
    HashSet<Integer> numbersSet = new HashSet<>();
    for (int num : numbers) {
      if (numbersSet.add(num)) {
      }
    }
    // 3c. Print the list after removing duplicates.
    System.out.println(numbersSet);

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    HashSet<String> countrySet = new HashSet<>();
    countrySet.add("USA");
    countrySet.add("India");
    countrySet.add("China");
    countrySet.add("Japan");
    // 4b. Add "Canada" to the set.
    countrySet.add("Canada");
    // 4c. Add "India" again. Print the result.
    System.out.println(countrySet.add("India"));
    // 4d. Print all elements in the set.
    System.out.println(countrySet);
    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    HashSet<Double> numbersDSet = new HashSet<>();
    numbersDSet.add(1.1);
    numbersDSet.add(2.2);
    numbersDSet.add(3.3);
    numbersDSet.add(4.4);
    numbersDSet.add(5.5);
    // 5b. Check if the set contains the number 3.3
    numbersDSet.contains(3.3);
    // 5c. Remove the number 2.2 from the set.
    numbersDSet.remove(2.2);
    // 5d. Print the size of the set.
    System.out.println(numbersDSet.size());

//System.out.println(numbersDSet);

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    HashSet<Integer> Set1 = new HashSet<>();
    HashSet<Integer> Set2 = new HashSet<>();
    for (int i = 1; i <= 4; i++) {
      Set1.add(i * 10);
      Set2.add((i + 2) * 10);
    }
    // 6d. Find the common numbers of the two sets.
      System.out.println(Set1.containsAll(Set2));
      HashSet<Integer> commonSet = new HashSet<>(Set1);
      commonSet.retainAll(Set2);
    // 6e. Print the resulting set.
      System.out.println("The common numbers of two HashSets are: " + commonSet);

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
      HashSet<String> names = new HashSet<>();
      names.add("Cherry");
      names.add("Steve");
      names.add("Chole");
      names.add("Jenny");
      names.add("Vicky");
    // 7b. Convert the HashSet to an ArrayList.
      ArrayList<String> namesList = new ArrayList<>(names);
    // 7c. Print the converted list.
      System.out.println(namesList);
      
    
    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    ArrayList<Student> students = new ArrayList<>();
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    students.add(new Student(1, "Alice"));
    students.add(new Student(2, "Bob"));
    students.add(new Student(3, "Charlie"));
    // 8b. Iterate over the ArrayList and print each student's details.
    for (int i = 0; i < students.size(); i++) {
      System.out.println("Student name: " + students.get(i).getName()
                       + " Student ID: " + students.get(i).getId());
    }
    // 8c. Remove the student Bob.
    String removeName = "Bob";
    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).getName() == removeName) {
        students.remove(i);
        break;
      }
    }
    //for (int i = 0; i < students.size(); i++) {
    //System.out.println(students.get(i).getName());
    //}

    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
        HashMap<Integer, String> checker = new HashMap<>();
    for (int i = 0; i < students.size(); i++) {
      checker.put(students.get(i).getId(), students.get(i).getName());
      }
      System.out.println(checker);
      System.out.println(Student.getNameById(0));
      System.out.println(Student.getNameById(1));
      System.out.println(Student.getNameById(2));
      System.out.println(Student.getNameById(3));
      System.out.println(Student.getNameById(4));
      
    
    // 8e. Create another ArrayList to store student with name starts with 'A'
    ArrayList<String> nameA = new ArrayList<>();
    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).getName().charAt(0) == (char)'A') {
        nameA.add(students.get(i).getName());
      }
    }
    System.out.println(nameA);

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    
    HashSet<Student> student1 = new HashSet<>();
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    students.add(new Student(2, "Bob"));
    students.add(new Student(4, "David"));
    HashSet<Student> student2 = new HashSet<>();
    for (int i = 0; i <= 2; i++) {
    student1.add(students.get(i));
    student2.add(students.get(i + 1));
    }
    System.out.println(student1.toString());
    System.out.println(student2.toString());
    // 9b. Find the common students of the two sets
    HashSet<Student> commonStu = new HashSet<>();
    commonStu.addAll(student1);
    commonStu.retainAll(student2);
    // 9c. Print the result.
    System.out.println(commonStu);
  }

  public static class Student {
    private int id;
    private String name;
    
    

    // Constructor
    // getter, setter, etc.
    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }
    public void setId(int id) {
      this.id = id;
    }
    public void setName(String name) {
      this.name = name;
    }
    public int getId() {
      return this.id;
    }
    public String getName() {
      return this.name;
    }
    @Override
    public String toString() {
      return this.name;
    }
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".


    public static String getNameById(Integer checkId) {
      HashMap<Integer, String> checker = new HashMap<>();
      checker.put(1, "Alice");
      checker.put(3, "Charlie");
      if (checkId <= 0) {
        return "Student not found for Student ID: " + checkId;
      } else if (checker.get(checkId) != null) {
        return "Student ID: " + checkId + ", Student Name: " + checker.get(checkId);
      } else {
        return "Student not found for Student ID: " + checkId;
      }
  } 
}
 
}
