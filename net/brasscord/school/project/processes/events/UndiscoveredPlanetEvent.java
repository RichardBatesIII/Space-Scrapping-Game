package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class UndiscoveredPlanetEvent extends PassiveEvents {
    public UndiscoveredPlanetEvent(Scrapper user) {
        super(EventType.colonization, true, user);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
