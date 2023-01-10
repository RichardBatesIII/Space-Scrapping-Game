package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class LoseOfLifeEvent extends PassiveEvents {
    public LoseOfLifeEvent(Scrapper user) {
        super(EventType.confrontation, false, user);
    }

    @Override
    public void outcome() {
        System.out.println("Someone lost their life while working and everyone is greaving.");
        user.getShip().addUnrest((byte)3);
    }

    @Override
    public void action() {
        outcome();
    }
}
