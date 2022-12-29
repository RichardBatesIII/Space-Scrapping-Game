package net.brasscord.school.project.processes.events;

import java.util.Random;

public class EventGenerator {
  
  private double lottery;
  private final Random random;

  public EventGenerator() {
    random = new Random();
    lottery = random.nextDouble();
  }

  public void reRoll() {
    lottery = random.nextDouble();
  }
  
}