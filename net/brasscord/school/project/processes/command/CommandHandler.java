package net.brasscord.school.project.processes.command;

import net.brasscord.school.project.processes.InputClass;
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
      String[] commands = { "continue", "", "help", "status" };
      if(command.equalsIgnoreCase(commands[0]) ||
         command.equalsIgnoreCase(commands[1])) {
        return;
      } else if (command.equalsIgnoreCase(commands[2])) {
        System.out.println("Commands:\nstatus: Shows the status of your ship.\nq: This quits the game.\nhelp: Shows you all the default command.\n");
      } else if (command.equalsIgnoreCase(commands[3])) {
        System.out.println(user.getShip().toString() + "\n");
      } else {
        throw new OptionNotFoundException();
      }
    } catch(OptionNotFoundException ex) {
        System.out.print("\n" + ex + "\n\n");
        handleCommand(InputClass.scan.next());
    }
  }
  
}