package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public abstract class PassiveEvents extends Events implements IPrintOptions {

  private final boolean upgradeable;
  
  public PassiveEvents(EventType eventType, boolean upgradeable,
                       Scrapper user, String name) {
    super(eventType, user, name);
    this.upgradeable = upgradeable;
  }

  public String toString() {
    return "#########"
      + "\n" + name
      + "\nEvent Type: " + getEventType()
      + "\nUpgradeable: " + upgradeable
      + "\n#########\n";
  }

  @Deprecated
  public String publicRelation() {
    return "This didn't effect any relations.";
  }
  
}