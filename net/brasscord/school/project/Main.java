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
    handler.handleCommand("help");

    // Game Loop
    while(user.getShip().getHealth() > 0 && !userInput.equalsIgnoreCase("q")) {
      // MISSING LOGIC FOR EVENTS
      // Fire weapons method set off an event
      System.out.println("press enter to continue or enter q to exit: \n");
      userInput = user.getShip().fireWeapons(user);
      // Look at handler for potential bugs
      handler.handleCommand(userInput);
      user.getShip().turmoilCheck();
      user.getShip().travel();
    }
    time.end();
    System.out.println("\n" + time);
    scan.close();
  }

}