// ! Once the class extends Runtimeexception, the class can be thrown or try-catch.
// ! RuntimeException -> Unchecked Exception (optional to handle)
// ! Exception -> Checked Exception (2 ways to handle: try + catch or throws) (must handle)
// RuntimeException has getMessage()
public class NotFoundException extends RuntimeException {
  
  private int code;
  private String message;


  
  public NotFoundException(SysError sysError) {
    super(sysError.getMessage());
    this.code = sysError.getCode();
  }
  public int getCode() {
    return this.code;
  }

}
