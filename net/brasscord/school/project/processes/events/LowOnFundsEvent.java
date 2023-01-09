package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class LowOnFundsEvent extends PassiveEvents {
    public LowOnFundsEvent(Scrapper user) {
        super(EventType.critical, false, user);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
