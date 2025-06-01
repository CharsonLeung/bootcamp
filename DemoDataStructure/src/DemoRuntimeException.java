import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.naming.NameNotFoundException;

public class DemoRuntimeException {
  public static void main(String[] args) {
    // ! 1. NullPointerException (NPE)
    String userInput = "123";
    if (userInput != null) { // avoidable program issue.
    getStringLength(userInput);
  } else {
    System.out.println("GoodBye");
  }
    // ! 2. ArrayIndexOutOfBoundException
  int[] arr = new int[] {3, 8, -1};
  for (int i = 0; i < arr.length; i++) { // avoidable program issue (arrayIndexOutOfBound)
    System.out.println(arr[i]);
  }

  // StringIndexOutOfBound (s.charAt(3)), which is avoidable.

  // Unavoidable + Forseeable Exception
  String number = "13";
  try {
    Integer converted = Integer.parseInt(number); // java.lang.NumberFormatException
    System.out.println(converted);
    } catch (NumberFormatException ex) { // catch the issue.
      System.out.println("GoodBye");
  } 
    
  // try + catch -> normal flow + exception flow (line 19 -> line 22, skip line 20)
  // if + else -> either if or else program flow

  // wrong handling for NPE, because if + else is able to handle NPE
  try {
    String s2 = null;
    s2.length();
  } catch (NullPointerException ex) {
    System.out.println("GoodBye");
  }

  // ! divided by 0
  int quantity = 3;
  double averageScore = (3 + 8 + 10) / 3.0;
  averageScore = (3 + 8 + 10) / quantity;
  System.out.println(averageScore);

  // caller -> method
  try {
    getStringLength(null);
  } catch (IllegalArgumentException ex) {
    System.out.println(ex.getMessage());
  }

  System.out.println(isAdult(new Staff(18)));

}

public static class Staff {
  private int age;

  public Staff(int age) {
    this.age = age;
  }
  public int getAge() {
    return this.age;
  }
}

// ! You have 2 ways to handle "checked" exception
  // 1. try + catch
  // 2. Method Signature -> throws
public static Staff searchStaffByAge(List<Staff> staffs, int age) 
    throws NameNotFoundException {
      int count = 0;
      boolean isTooOld = false;
      Staff target = null;
  for (Staff staff : staffs) {
    if (staff.getAge() >= 65)
    isTooOld = true;
    if (staff.getAge() == age)
      target = staff;
  }
  if (isTooOld)
    throw new StaffTooOldException();
  if (taget != null)
    throw new NotFoundException(SysError.STAFF_NOT_FOUND);
    return target;
} finally {
  System.out.println();
}

// ! Javadoc
/** 
 * 
 * @oaran staff
 * @return
 * @throws IllegalArgumentException. Please take care of your code.
*/
public static boolean isAdult(Staff staff) {
  if (staff == null)
    throw new IllegalArgumentException("No Staff");
  return staff.getAge() >= 18;

  try {
    isAdult(staff);
  } catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
  }

  if (staff != null) {
    staff.getAge();
  }

  List<Staff> staffs = 
      new ArrayList<>(Arrays.asList(new Staff(13), new Staff(19)));
  try {
    searchStaffByAge(staffs, 10); // checked exception -> Must handle
  } catch (NotFoundException ex) {
  
  }

  // 1. error -> catch -> finally
  // 2. no error -> finally
  try {
    searchStaffByAge(staffs, 18);
  } catch (NotFoundException ex) { // never AND exceptions, 
    System.out.println("Staff is too old");
  } catch (Exception ex) { // catch Parent Exception 
    System.out.println("There is no staff in age" + 18);
  } finally {
    System.out.println("This is the finally code block");
  }

  // ! for catch sequence, you should catch child exception first,then parent exception. 

}
  // Method Author is not able to control the data integrity
  public static int getStringLength(String s) throws IllegalArgumentException { // return : int type
    if (s == null)
      throw new IllegalArgumentException("Are you crazy?"); // last words 遺言 -> object (throw -> leave)
      // throw: fulfill "throws"
    return s.length();

  }
  
}
