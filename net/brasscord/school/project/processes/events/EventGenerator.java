package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

import java.util.Random;

public class EventGenerator {
  
  private double lottery;
  private final Random random;

  public EventGenerator() {
    random = new Random();
    lottery = random.nextDouble(0.0, 100.0);
  }

  public void reRoll() {
    lottery = random.nextDouble(0.0, 100.0);
  }
  
  public void generateEvent(Scrapper user) {
    if (lottery <= 5.55555555556) {
      AbandonedShipEvent event = new AbandonedShipEvent(user);
      event.action();
    } else if (lottery <= 11.1111111111) {
      FactionRelationEvent event = new FactionRelationEvent(user);
      event.action();
    } else if (lottery <= 16.6666666667) {
      HarvestFailureEvent event = new HarvestFailureEvent(user);
      event.action();
    } else if (lottery <= 22.2222222222) {
      InvasionEvent event = new InvasionEvent(user);
      event.action();
    } else if (lottery <= 27.7777777778) {
      LoseOfLifeEvent event = new LoseOfLifeEvent(user);
      event.action();
    } else if (lottery <= 33.3333333334) {
      LowOnFundsEvent event = new LowOnFundsEvent(user);
      event.action();
    } else if (lottery <= 38.8888888889 ) {
      MaintenanceEvent event = new MaintenanceEvent(user);
      event.action();
    } else if (lottery <= 44.4444444445 ) {
      MeteorBeltEvent event = new MeteorBeltEvent(user);
      event.action();
    } else if (lottery <= 50.0) {
      OutpostEvent event = new OutpostEvent(user);
      event.action();
    } else if (lottery <= 55.5555555556) {
      PipeBurstingEvent event = new PipeBurstingEvent(user);
      event.action();
    } else if (lottery <= 61.1111111112) {
      HarvestFailureEvent event = new HarvestFailureEvent(user);
      event.action();
    } else if (lottery <= 66.6666666667) {
      ResourceEvent event = new ResourceEvent(user);
      event.action();
    } else if (lottery <= 72.2222222223) {
      RevoltEvent event = new RevoltEvent(user);
      event.action();
    } else if (lottery <= 77.7777777778) {
      ScavengeEvent event = new ScavengeEvent(user);
      event.action();
    } else if (lottery <= 83.3333333334) {
      ShipMeltdownEvent event = new ShipMeltdownEvent(user);
      event.action();
    } else if (lottery <= 88.888888889) {
      MaintenanceEvent event = new MaintenanceEvent(user);
      event.action();
    } else if (lottery <= 94.4444444445) {
      UndiscoveredPlanetEvent event = new UndiscoveredPlanetEvent(user);
      event.action();
    } else if (lottery <= 100.0) {
      ScavengeEvent event = new ScavengeEvent(user);
      event.action();
    } else {
      ScavengeEvent event = new ScavengeEvent(user);
      event.action();
    }
  }
  
}