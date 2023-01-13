package net.brasscord.school.project;

import net.brasscord.school.project.processes.command.CommandHandler;
import net.brasscord.school.project.processes.InputClass;
import net.brasscord.school.project.processes.TimeCalc;
import net.brasscord.school.project.user.Scrapper;
import net.brasscord.school.project.ship.Ship;
import net.brasscord.school.project.ship.CrewType;

public class Main {
  
  public static void main(String[] args) {
    // Some basic game logic is contained here.
    TimeCalc time = new TimeCalc();
    TimeCalc timeTwo = new TimeCalc();
    Scrapper user = new Scrapper();
    final CommandHandler handler = new CommandHandler(user);

    time.start();
    String userInput = "";
    System.out.println("Welcome to Space Scrapper.\nEvery round consists"
                       + " of command, event, and travel."
                       + "\nIf don't want to type a command just press enter.\n"
                       + "Events happen every round"
                       + " and some are unavoidable.");
    handler.handleCommand("help");

    // Game Loop
    while(user.getShip().getHealth() > 0) {
      System.out.println("Type continue to proceed or enter q to exit: \n");
      userInput = InputClass.scan.next();
      if(userInput.equals("q"))
        break;
      System.out.println();
      handler.handleCommand(userInput);
      user.getShip().fireWeapons(user);
      user.getShip().turmoilCheck();
      user.getShip().travel();
      user.getShip().collectPlanetaryIncome();
      System.out.println("\n" + user.getShip() + "\n");
    }
    time.end();
    System.out.println("\n" + time);

    Ship savedResults = user.getShip();

    System.out.println("Do you want to try again(y/n): ");
    handler.handleCommand("help");

    user.setShip(new Ship(InputClass.scan.next(), 100,
                          CrewType.Cleanup_Crew, user));
    timeTwo.start();
    while(user.getShip().getHealth() > 0) {
      System.out.println("Type continue to proceed or enter q to exit: \n");
      userInput = InputClass.scan.next();
      if(userInput.equals("q"))
        break;
      System.out.println();
      handler.handleCommand(userInput);
      user.getShip().fireWeapons(user);
      user.getShip().turmoilCheck();
      user.getShip().travel();
      user.getShip().collectPlanetaryIncome();
      System.out.println("\n" + user.getShip() + "\n");
    }
    timeTwo.end();
    System.out.println("\n" + timeTwo);

    // Comparing the first results and the second results
    if(savedResults.equals(user.getShip()))
      System.out.println("You didn't do any better then last time");
    else
      System.out.println("You either did better or worse.");
  }

}