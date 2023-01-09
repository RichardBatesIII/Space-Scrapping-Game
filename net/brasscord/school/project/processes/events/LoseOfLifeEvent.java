package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class LoseOfLifeEvent extends PassiveEvents {
    public LoseOfLifeEvent(Scrapper user) {
        super(EventType.confrontation, false, user);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
