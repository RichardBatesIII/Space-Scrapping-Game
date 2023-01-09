package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.processes.events.EventType;
import net.brasscord.school.project.user.Scrapper;

public abstract class HostileEvents extends Events {

  private boolean instantFailure;
  
  public HostileEvents(EventType eventType, boolean instantFailure, Scrapper user) {
    super(eventType, user);
    this.instantFailure = instantFailure;
  }

  public abstract void victory();
  public abstract void failure();
  
}