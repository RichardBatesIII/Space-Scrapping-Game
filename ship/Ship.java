package ship;

public class Ship {

  private String name;
  private int health;
  private String[] upgrades;
  private int scrap;

  public Ship(String name, int health) {
    this.name = name;
    this.health = health;
    this.scrap = 10;
  }

  public Ship(String name) {
    this.name = name;
    this.health = 100;
    this.scrap = 10;
  }

  public Ship() {
    this.name = "Hordon v1";
    this.health = 100;
    this.scrap = 10;
  }
  
  public boolean isEqual(Ship ship) {
      return this.getHealth() == ship.getHealth() && this.getName() == ship.getName();
  }

  public String toString() {
    return "\r#########################\n" + name
      + "\nHealth: " + health + "\nUpgrades: " + getUpgradeList() + "\n#########################";
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

  public int getHealth() {
    return this.health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public String getUpgradeList() {
    if(upgrades != null) {
      int upgradeNum = 0;
      String upgradeList = "";
      while(upgrades.length > upgradeNum) {
        upgradeList += upgradeNum + " ";
        upgradeNum++;
      }
      return upgradeList;
    } else {
      return "No upgrades currently";
    }
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

  public void addScrap(int scraps) {
    scrap += scraps;
  }
  
}