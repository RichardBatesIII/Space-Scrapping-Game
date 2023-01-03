package net.brasscord.school.project.ship;

import net.brasscord.school.project.user.Scrapper;

public class Ship {

  private String name;
  private int health;
  private String[] upgrades;
  private int scrap;
  private byte unrest;
  private Crew crew;
  private Scrapper user;

  public Ship(String name, int health, CrewType crewType, Scrapper user) {
    this.name = name;
    this.health = health;
    upgrades = new String[10];
    this.scrap = 10;
    unrest = 0;
    crew = new Crew(crewType);
    this.user = user;
  }

  public Ship(String name, CrewType crewType, Scrapper user) {
    this.name = name;
    this.health = 100;
    this.scrap = 10;
    unrest = 0;
    crew = new Crew(crewType);
    this.user = user;
  }

  public Ship(Scrapper user) {
    this.name = "Hordon v1";
    this.health = 100;
    this.scrap = 10;
    unrest = 0;
    crew = new Crew(CrewType.Cleanup_Crew);
    this.user = user;
  }
  
  public boolean equals(Ship ship) {
      return health == ship.getHealth() && name.equals(ship.getName()) && scrap == ship.getTotalofScrap() && upgrades.equals(ship.getUpgrades());
  }

  public String toString() {
    return "\r#########################\n" + name
      + "\nHealth: "
            + health + "\nUpgrades: " + getUpgradeList()
            + "\nUnrest: " + unrest
            + "Faction Relations\nUEF: " + user.getUEFRelation()
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

  public int getTotalofScrap() {
    return scrap;
  }

  public void setTotalofScrap(int scraps) {
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

  public Crew getCrew() {
    return crew;
  }

  public String getUpgradeList() {
    if(upgrades != null) {
      int upgradeNum = 0;
      StringBuilder upgradeList = new StringBuilder();
      while(upgrades.length > upgradeNum) {
        upgradeList.append(upgradeNum).append(" ");
        upgradeNum++;
      }
      return upgradeList.toString();
    }
    return "No upgrades currently";
  }

  public String[] getUpgrades() {
    return upgrades;
  }

  private void setUpgradeList(String[] upgradeList) {
    this.upgrades = upgradeList;
  }

  public void fireWeapons() {
    // I need to finish the events first
  }

  public void travel() {
    // I need to finish the events first
  }

  public void turmoilCheck() {
    if(unrest > 10 && unrest <= 20) {
      health -= 1;
    } else if(unrest > 20 && unrest <= 30) {
      health -= 5;
    } else if(unrest > 30 && unrest <= 50) {
      health -= 10;
    } else if(unrest > 50 && unrest <= 75) {
      health -= 25;
    }
    else if(unrest > 75 && unrest <= 99) {
      health -= 50;
    }
    else if(unrest == 100) {
      health -= 1000;
    }
  }
  
}