package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

import java.util.Random;

public class EventGenerator {
  
  private double lottery;
  
  private final Random random;

  public EventGenerator() {
    random = new Random();
    lottery = random.nextDouble(0.0, 531.25);
  }

  public void reRoll() {
    lottery = random.nextDouble(0.0, 531.25);
  }
  
  public void generateEvent(Scrapper user) {
    if (lottery <= 31.25) {
      AbandonedShipEvent event = new AbandonedShipEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 2) {
      FactionRelationEvent event = new FactionRelationEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 3) {
      HarvestFailureEvent event = new HarvestFailureEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 4) {
      InvasionEvent event = new InvasionEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 5) {
      LoseOfLifeEvent event = new LoseOfLifeEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 6) {
      LowOnFundsEvent event = new LowOnFundsEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 7) {
      MaintenanceEvent event = new MaintenanceEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 8) {
      MeteorBeltEvent event = new MeteorBeltEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 9) {
      OutpostEvent event = new OutpostEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 10) {
      PipeBurstingEvent event = new PipeBurstingEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 11) {
      
      ResourceEvent event = new ResourceEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 12) {
      RevoltEvent event = new RevoltEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 13) {
      ScavengeEvent event = new ScavengeEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 14) {
      ShipMeltdownEvent event = new ShipMeltdownEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 15) {
      MaintenanceEvent event = new MaintenanceEvent(user);
      event.action();
    } else if (lottery <= 31.25 * 16) {
      UndiscoveredPlanetEvent event = new UndiscoveredPlanetEvent(user);
      event.action();
    } else {
      ScavengeEvent event = new ScavengeEvent(user);
      event.action();
    }
  }
  
}