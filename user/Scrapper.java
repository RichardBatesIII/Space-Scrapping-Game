package user;

import ship.Ship;

public class Scrapper {
  private Ship ship;

  public Scrapper() {
    this.ship = new Ship("Hordon V1");
  }

  public Ship getShip() {
    return ship;
  }

  public void setShip(Ship ship) {
    this.ship = ship;
  }
}