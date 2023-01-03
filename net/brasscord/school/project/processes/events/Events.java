package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public abstract class Events {
  // A abstract class for creating template events.
  
  private EventType eventType;
  protected final Scrapper user;
  
  public Events(EventType eventType, Scrapper user) {
    this.eventType = eventType;
    this.user = user;
  }

  public abstract void outcome();
  public abstract void action(String userInput);
  
}