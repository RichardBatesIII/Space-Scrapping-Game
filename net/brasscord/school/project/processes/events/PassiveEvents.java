package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public abstract class PassiveEvents extends Events {

  private final boolean upgradeable;
  
  public PassiveEvents(EventType eventType, boolean upgradeable, Scrapper user) {
    super(eventType, user);
    this.upgradeable = upgradeable;
  }

  @Deprecated
  public String publicRelation() {
    return "This didn't effect any relations.";
  }
  
}