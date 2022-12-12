package processes;

import java.util.Scanner;
import processes.TimeCalc;
import processes.exceptions.OptionNotFound;
import user.Scrapper;
import processes.command.CommandHandler;

public class Game {
  
  public static void gameLoop() {
    // To avoid creating a mess in main all the game logic goes in here.
    Scanner scan = new Scanner(System.in);
    TimeCalc time = new TimeCalc();
    Scrapper user = new Scrapper();
    CommandHandler handler = new CommandHandler(user);
    time.start();
    String userInput = "";
    while(!userInput.equals("q")) {
      // enter below
      
      // don't remove
      System.out.println("enter one of the options or enter q to exit: ");
      userInput = scan.nextLine();
      handler.handleCommand()
      scan.nextLine();
    }
    time.end();
    System.out.println(time.toString());
    scan.close();
  }

  private static void print(String text, boolean line) {
    // I'm lazy
    if(line)
      System.out.println(text);
    else
      System.out.print(text);
  }
  
}