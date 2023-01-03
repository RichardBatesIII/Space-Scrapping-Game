package net.brasscord.school.project.processes.command;

import net.brasscord.school.project.processes.exceptions.OptionNotFoundException;
import net.brasscord.school.project.user.Scrapper;
import java.util.Scanner;
import java.util.ArrayList;

public class CommandHandler {
  Scrapper user;

  public CommandHandler(Scrapper user) {
    this.user = user;
  }

  public void handleCommand(String command, ArrayList<String> listOfPossibleOptions, boolean activeEvent) {
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
      handleStandardCommand(command);
  }

  private void handleStandardCommand(String command) {
    try {
      switch(command) {
        case "status": 
          System.out.println(user.getShip().toString());
          break;
        case "q":
          return;
        default:
          throw new OptionNotFoundException();
        } 
      } catch(OptionNotFoundException ex) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n" + ex + "\n\n");
        handleStandardCommand(scan.next());
        scan.close();
    }
  }
  
}