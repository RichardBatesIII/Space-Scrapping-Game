package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.processes.InputClass;

import java.util.Scanner;

public interface IPrintOptions {

  default void printOptions() {
    String str = "Options: \n";
    StringBuilder stringBuilder = new StringBuilder(str);
    for(int i = 0; i < options().length; i++) {
      stringBuilder.append(options()[i]).append("\n");
    }
    System.out.println(stringBuilder);
  }

  default String userInput() {
    String response = InputClass.scan.next();
    return response;
  }

  default String[] options() {
    return new String[] { "accept", "deny" };
  }

}
