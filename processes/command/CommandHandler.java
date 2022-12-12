package processes.command;

import processes.exceptions.OptionNotFound;
import user.Scrapper;
import java.util.Scanner;

import com.oracle.truffle.api.impl.asm.commons.SerialVersionUIDAdder;

public class CommandHandler {
  Scrapper user;

  public CommandHandler(Scrapper user) {
    this.user = user;
  }

  public void handleCommand(String command, SerialVersionUIDAdder[] listOfPossibleOptions, boolean activeEvent) {
    Scanner scan = new Scanner(System.in);
    try {
      if (activeEvent) {
        int option = 0;
        while (listOfPossibleOptions[option].equals(command) && listOfPossibleOptions.length() > option) {

          option++;
        }
      }
      if (command.equals("status")) {
        System.out.println(user.getShip().toString());
      } else {
        throw new OptionNotFound();
      }
    } catch (OptionNotFound ex) {
      System.out.print(ex.toString());
      handleCommand(scan.nextLine(), listOfPossibleOptions, activeEvent);
    }
  }
}