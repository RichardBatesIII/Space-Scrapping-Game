package net.brasscord.school.project;

import java.util.Scanner;

import net.brasscord.school.project.processes.TimeCalc;
import net.brasscord.school.project.user.Scrapper;
import net.brasscord.school.project.processes.command.CommandHandler;

public class Main {
  
  public static void main(String[] args) {
    // Some basic game logic is contained here.
    TimeCalc time = new TimeCalc();
    Scrapper user = new Scrapper();
    final CommandHandler handler = new CommandHandler(user);

    time.start();
    String userInput = "";
    System.out.println("Welcome to Space Scrapper.\nEvery round consists of command, event, and travel.\nIf don't want to type a command just press enter.\nEvents happen every round and some are unavoidable.");
    handler.handleCommand("help");
    Scanner scan = new Scanner(System.in);

    // Game Loop
    while(user.getShip().getHealth() > 0) {
      // MISSING LOGIC FOR EVENTS
      // Fire weapons method set off an event
      System.out.println("press enter to continue or enter q to exit: \n");
      // Look at handler for potential bugs
      if(scan.hasNext())

      userInput = scan.next();
      handler.handleCommand(userInput);
      if(userInput.equals("q"))
        break;
      user.getShip().fireWeapons(user);
      user.getShip().turmoilCheck();
      user.getShip().travel();
      user.getShip().collectPlanetaryIncome();
    }
    scan.close();
    time.end();
    System.out.println("\n" + time);
  }

}