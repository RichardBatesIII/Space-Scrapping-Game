package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class PipeBurstingEvent extends PassiveEvents {
    public PipeBurstingEvent(Scrapper user) {
        super(EventType.emergency, false, user);
    }

    @Override
    public void outcome() {
        user.getShip().addUnrest((byte) 5);
        user.getShip().addScrap(-5);
    }

    @Override
    public void action() {
        System.out.println("Suddenly a pipe burst and your team quickly fixed, but not fast enough.");
        outcome();
    }
}
