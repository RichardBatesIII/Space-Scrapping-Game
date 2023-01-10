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

  public void handleCommand(String command) {
    try {
      switch(command) {
        case "help":
          System.out.println("Commands:\nstatus: Shows the status of your ship.\nq: This quits the game.\nhelp: Shows you all the default command.\n");
          break;
        case "status": 
          System.out.println(user.getShip().toString());
          break;
        case "q":
          return;
        case "":
          break;
        default:
          throw new OptionNotFoundException();
        } 
      } catch(OptionNotFoundException ex) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n" + ex + "\n\n");
        handleCommand(scan.next());
        scan.close();
    }
  }
  
}