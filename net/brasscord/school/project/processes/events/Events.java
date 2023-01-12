package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public abstract class Events {
  // A abstract class for creating template events.
  
  private final EventType eventType;
  protected final Scrapper user;
  protected final String name;
  
  public Events(EventType eventType, Scrapper user, String name) {
    this.eventType = eventType;
    this.user = user;
    this.name = name;
  }

  public abstract void outcome();
  public abstract void action();

  protected String getEventType() {
    if(eventType == EventType.critical)
      return "critcal";
    else if (eventType == EventType.emergency)
      return "emergency";
    else if (eventType == EventType.confrontation)
      return "confrontation";
    else if (eventType == EventType.maintenence)
      return "maintenance";
    else if (eventType == EventType.scrapping)
      return "scavenging";
    else if (eventType == EventType.colonization)
      return "colonization";
    else
      return "unknown";
  }
  
}