package net.brasscord.school.project.user;

import net.brasscord.school.project.ship.Ship;

public class Scrapper {
  private Ship ship;
  
  private int relationUEF;
  
  private int relationIlluminate;
  
  private int relationCybran;

  public Scrapper() {
    this.ship = new Ship(this);
    this.relationUEF = 0;
    this.relationIlluminate = 0;
    this.relationCybran = 0;
  }

  public Ship getShip() {
    return ship;
  }

  public void setShip(Ship ship) {
    this.ship = ship;
  }

  public int getUEFRelation() {
    return relationUEF;
  }

  public void setUEFRelation(int UEFRelation) {
    relationUEF = UEFRelation;
  }

  public int getIlluminateRelation() {
    return relationIlluminate;
  }

  public void setIlluminateRelation(int illuminateRelation) {
    relationIlluminate = illuminateRelation;
  }

  public int getCybranRelation() {
    return relationCybran;
  }

  public void setCybranRelation(int cybranRelation) {
    relationCybran = cybranRelation;
  }
  
}