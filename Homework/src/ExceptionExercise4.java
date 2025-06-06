import java.util.Scanner;

public class ExceptionExercise4 {

  // Follow the instructions below to complete the User Registration Process.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    scanner.close();
    
    // code here ...
    // call method registerUser(), handle the exception to print "User Registeration is Fail."
    try {registerUser(username, password, email);
    } catch (UserRegistrationException e) {
      System.out.println("User Registeration is Fail.");
    }

    // or "User Registeration is Success."
    
    // try, catch
    try {
      registerUser(username, password, email);
    } catch (UserRegistrationException e) {
      System.out.println(e.getMessage());
    }
  }

  public static class UserRegistrationException extends RuntimeException {
    // code here ...
    public UserRegistrationException(String message) {
      super(message);
    }

  }

  // Call validateUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
  public static void registerUser(String username, String password,
      String email) {
    // code here ...
    //try {
      //validateUsername(username);
      //validatePassword(password);
      //validateEmail(email);
      //System.out.println("User registrated successfully" + username);
    //} catch (IllegalArgumentException e) {
      //throw new UserRegistrationException(e.getMessage());
    //}
    boolean invalidFound = false;
    String errorMessage = "";

    try {
      validateUsername(username);
    } catch (IllegalArgumentException e) {
      invalidFound = true;
      errorMessage += e.getMessage();
    }
    try {
      validatePassword(password);
    } catch (IllegalArgumentException e) {
      invalidFound = true;
      errorMessage += e.getMessage();
    }
    try {
      validateEmail(email);
    } catch (IllegalArgumentException e) {
      invalidFound = true;
      errorMessage += e.getMessage();
    }
    if (invalidFound) {
      throw new UserRegistrationException(errorMessage);
    }
  }

  // Throw IllegalArgumentException if String username is null or empty string
  private static void validateUsername(String username) {
    // code here ...
    if (username == null || username.isEmpty()) {
      throw new IllegalArgumentException("Invalid Username. ");
    } 
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  private static void validatePassword(String password) {
    // code here ...
    if (password == null || password.length() < 8 
        || (!password.contains("!") && !password.contains("@")
        && !password.contains("$") && !password.contains("&")
        && !password.contains("_"))) {
          throw new IllegalArgumentException("Invalid password. ");
        }
  }

  // Throw IllegalArgumentException if String email is null or it does not contain character @
  private static void validateEmail(String email) {
    // code here ...
    if (email == null || !email.contains("@")) {
      throw new IllegalArgumentException("Invalid email address. ");
    }
  }
}