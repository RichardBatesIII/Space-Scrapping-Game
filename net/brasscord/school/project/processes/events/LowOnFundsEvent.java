package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class LowOnFundsEvent extends PassiveEvents {
    public LowOnFundsEvent(Scrapper user) {
        super(EventType.critical, false, user);
    }

    @Override
    public void outcome() {
        System.out.println("You're extremely low on funds. You had to sell some scraps to make up for rent.");
        user.getShip().addUnrest((byte) 10);
        user.getShip().addScrap(-10);
    }

    @Override
    public void action() {
      outcome();
    }
}
