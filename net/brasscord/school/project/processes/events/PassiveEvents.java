package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.processes.events.EventType;

public abstract class PassiveEvents extends Events {

  private boolean upgradeable;
  
  public PassiveEvents(EventType eventType, boolean upgradeable) {
    super(eventType);
    this.upgradeable = upgradeable;
  }

  public abstract void publicRelation();
  
}