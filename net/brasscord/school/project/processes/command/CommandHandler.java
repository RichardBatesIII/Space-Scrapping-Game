package net.brasscord.school.project.processes.command;

import net.brasscord.school.project.processes.exceptions.OptionNotFound;
import net.brasscord.school.project.user.Scrapper;
import java.util.Scanner;
import java.util.ArrayList;

public class CommandHandler {
  Scrapper user;

  public CommandHandler(Scrapper user) {
    this.user = user;
  }

  public void handleCommand(String command, ArrayList<String> listOfPossibleOptions, boolean activeEvent) {
    try {
      if (activeEvent) {
        int option = 0;
        while (listOfPossibleOptions.size() > option) {
          if(listOfPossibleOptions.get(option).equals(command)) {
            // This will run the command

            return;
          }
          option++;
        }
      }
      if (command.equals("status")) {
        System.out.println(user.getShip().toString());
      } else if(command.equals("q")) {
        return;
      } else {
        throw new OptionNotFound();
      }
    } catch (OptionNotFound ex) {
      Scanner scan = new Scanner(System.in);
      System.out.print("\n" + ex.toString() + "\n\n");
      handleCommand(scan.next(), listOfPossibleOptions, activeEvent);
      scan.close();
    }
  }

  public void handleCommand(String command) {
    try {
      switch(command) {
        case "status": 
          System.out.println(user.getShip().toString());
          break;
        case "q":
          return;
        default:
          throw new OptionNotFound();
        } 
      } catch(OptionNotFound ex) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n" + ex.toString() + "\n\n");
        handleCommand(scan.next());
        scan.close();
    }
  }
  
}