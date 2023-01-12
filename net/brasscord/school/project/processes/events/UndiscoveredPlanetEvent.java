package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class UndiscoveredPlanetEvent
  extends PassiveEvents implements IPrintOptions {
    public UndiscoveredPlanetEvent(Scrapper user) {
        super(EventType.colonization, true,
              user, "Undiscovered planet mission");
    }

    @Override
    public void outcome() {
        if(userInput().equalsIgnoreCase("accept")) {
            user.getShip().setColonies(user.getShip().getColonies() + 1);
            user.getShip().addScrap(10);
        }
    }

    @Override
    public void action() {
        System.out.println(this);
        System.out.println("You found a huge planet ripe for the taking.");
        printOptions();
        outcome();
    }
}
