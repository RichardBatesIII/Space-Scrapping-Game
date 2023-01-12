package net.brasscord.school.project.ship;

public class Crew {
  
  private CrewType crewType;
  
  private final float unrestMultiplier;

  public Crew(CrewType crewType) {
    this.crewType = crewType;
    unrestMultiplier = unrestMultiplierCalc();
  }

  private float unrestMultiplierCalc() {
    if(crewType == CrewType.Research) {
      return 2.0f;
    } else if(crewType == CrewType.Cleanup_Crew) {
      return 1.0f;
    } else if(crewType == CrewType.Militant) {
      return 0.5f;
    }
    return 1.0f;
  }

  public CrewType getCrewType() {
    return crewType;
  }
  
  public float getUnrestMultiplier() {
    return unrestMultiplier;
  }
  
  
}