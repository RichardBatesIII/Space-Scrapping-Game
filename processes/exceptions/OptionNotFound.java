package processes.exceptions;

public class OptionNotFound extends Exception {
  // This will be thrown when you don't pick a valid option.
  public OptionNotFound() {
    super("The value the user inputted is not valid");
  }

  @Override 
  public string getMessage() {
    return super.getMessage();
  }
  
}