package net.brasscord.school.project.ship;

import net.brasscord.school.project.processes.events.EventGenerator;
import net.brasscord.school.project.user.Scrapper;

import java.util.Random;

public class Ship {

  private String name;
  
  private int health;
  
  private int scrap;
  
  private int colonies;
  
  private byte unrest;
  
  private double stability = 1;
  
  private final Crew crew;
  
  private final Scrapper user;
  
  private final EventGenerator eventGenerator;

  public Ship(String name, int health, CrewType crewType, Scrapper user) {
    this.name = name;
    this.health = health;
    scrap = 100;
    unrest = 0;
    crew = new Crew(crewType);
    this.user = user;
    eventGenerator = new EventGenerator();
    colonies = 0;
  }

  public Ship(Scrapper user) {
    name = "Joe";
    health = 100;
    scrap = 100;
    unrest = 0;
    crew = new Crew(CrewType.Cleanup_Crew);
    this.user = user;
    eventGenerator = new EventGenerator();
    colonies = 0;
  }

  public Ship() {
    name = "Joe";
    health = 100;
    scrap = 100;
    unrest = 0;
    crew = new Crew(CrewType.Cleanup_Crew);
    user = new Scrapper();
    eventGenerator = new EventGenerator();
    colonies = 0;
  }
  
  public boolean equals(Ship ship) {
      return health == ship.getHealth()
        && name.equals(ship.getName())
        && scrap == ship.getScrap();
  }

  public String toString() {
    return "\r#########################\n" + name
      + "\nHealth: "
            + health + "\nUnrest: " + unrest
            + "\nScrap: " + scrap
            + "\nColonies: " + colonies
            + "\nFaction Relations\nUEF: " + user.getUEFRelation()
            + "\nIlluminate: " + user.getIlluminateRelation()
            + "\nCybran: " + user.getCybranRelation()
            + "\n#########################";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }  

  public int getScrap() {
    return scrap;
  }

  public void setScrap(int scraps) {
    scrap = scraps;
  }

  public void addScrap(int scraps) {
    scrap += scraps;
  }

  public int getHealth() {
    return this.health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public byte getUnrest() {
    return unrest;
  }

  public void setUnrest(byte unrest) {
    try {
      this.unrest = unrest; 
      if(unrest > 100)
        this.unrest = 100;
    } catch(Exception ex) {
      this.unrest = 100;
    }
  }

  public void addUnrest(byte unrest) {
    try {
      this.unrest += unrest * crew.getUnrestMultiplier();
      if(unrest > 100)
        this.unrest = 100;
    } catch (Exception ex) {
      this.unrest = 100;
    }
  }

  public Crew getCrew() {
    return crew;
  }

  public void setColonies(int colonies) {
    this.colonies = colonies;
  }

  public int getColonies() {
    return colonies;
  }

  public void fireWeapons(Scrapper user) {
    eventGenerator.generateEvent(user);
    eventGenerator.reRoll();
  }

  public void travel() {
    // I need to finish the events first
    Random random = new Random();
    int scrap = (int) (random.nextInt(1, 16) * stability);
    this.addScrap(scrap);
    System.out.println("\nYou discovered scrap while traveling\nYou found "
                       + scrap + " scrap!");
  }

  public void turmoilCheck() {
    if(scrap < 0) {
      addUnrest((byte) 5);
      health -= 5;
      System.out.println("You ran out of scrap and can't fix your equipment.");
    }
    if(unrest > 10 && unrest <= 20) {
      health -= 1;
      stability = 1;
    } else if(unrest > 20 && unrest <= 30) {
      health -= 5;
      stability = 0.75;
    } else if(unrest > 30 && unrest <= 50) {
      health -= 10;
      stability = 0.5;
    } else if(unrest > 50 && unrest <= 75) {
      health -= 25;
      stability = 0.25;
    }
    else if(unrest > 75 && unrest <= 99) {
      health -= 50;
      stability = 0.1;
    }
    else if(unrest == 100) {
      health -= 1000;
      stability = 0;
    }
  }

  public void collectPlanetaryIncome() {
    if(colonies != 0) {
      System.out.println("You collected resources from your colonies");
      scrap = colonies * 5;
    }
  }
  
}