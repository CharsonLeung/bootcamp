public enum SysError {
  STAFF_NOT_FOUND(90000, "Staff is not found."),;

  private int code;
  private String message;

  private SysError(int code, String message) {
    this.code = code;
  }

  public int getCode() {
    return this.code;
  }
  public String getMessage() {
    return this.message;
  }
  
}
