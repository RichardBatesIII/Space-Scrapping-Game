package net.brasscord.school.project;

import java.util.Scanner;
import net.brasscord.school.project.processes.TimeCalc;
import net.brasscord.school.project.user.Scrapper;
import net.brasscord.school.project.processes.command.CommandHandler;
import java.util.ArrayList;

public class Game {
  
  public static void gameLoop() {
    // To avoid creating a mess in main all the game logic goes in here.
    Scanner scan = new Scanner(System.in);
    TimeCalc time = new TimeCalc();
    Scrapper user = new Scrapper();
    final CommandHandler handler = new CommandHandler(user);
    
    ArrayList<String> options = new ArrayList<String>();
    options.add(0, "DONT TYPE THIS...");
    
    time.start();
    String userInput = "";
    
    while(true) {
      // enter below
      
      // don't remove
      System.out.println("enter one of the options or enter q to exit: ");
      userInput = scan.nextLine();
      handler.handleCommand(userInput, options, false);
      
      if(userInput.equals("q")) {
        System.out.println();
        scan.close();
        break;
      }
      scan.nextLine();
    }
    time.end();
    System.out.println(time.toString());
    scan.close();
  }
}