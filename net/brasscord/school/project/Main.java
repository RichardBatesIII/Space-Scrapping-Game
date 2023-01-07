package net.brasscord.school.project;

import java.util.Scanner;
import java.util.ArrayList;

import net.brasscord.school.project.processes.TimeCalc;
import net.brasscord.school.project.user.Scrapper;
import net.brasscord.school.project.processes.command.CommandHandler;

public class Main {
  
  public static void main(String[] args) {
    // Some basic game logic is contained here.
    Scanner scan = new Scanner(System.in);
    TimeCalc time = new TimeCalc();
    Scrapper user = new Scrapper();
    final CommandHandler handler = new CommandHandler(user);

    // Deprecated code
    ArrayList<String> options = new ArrayList<String>();
    options.add(0, "DONT TYPE THIS...");

    time.start();
    String userInput = "";

    // Game Loop
    while(user.getShip().getHealth() > 0 && !userInput.equalsIgnoreCase("q")) {
      // MISSING LOGIC FOR EVENTS
      System.out.println("enter one of the options or enter q to exit: \n");
      userInput = scan.nextLine();
      // Look at handler for potential bugs
      handler.handleCommand(userInput, options, false);
      user.getShip().turmoilCheck();
    }
    time.end();
    System.out.println("\n" + time);
    scan.close();
  }

}