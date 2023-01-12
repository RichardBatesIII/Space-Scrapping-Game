package net.brasscord.school.project.processes.exceptions;

public class OptionNotFoundException extends Exception {
  // This will be thrown when you don't pick a valid option.
  public OptionNotFoundException() {
    super("\n##########################################"
          + "\n\t\t\tOption not found"
          + "\n##########################################");
  }

  @Override 
  public String getMessage() {
    return super.getMessage();
  }
  
}