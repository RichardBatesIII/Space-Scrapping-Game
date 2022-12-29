package net.brasscord.school.project.processes.events;

public abstract class Events {
  // A abstract class for creating template events.
  
  private EventType eventType;
  
  public Events(EventType eventType) {
    this.eventType = eventType;
  }

  public abstract void outcome();
  public abstract void action(String userInput);
  
}