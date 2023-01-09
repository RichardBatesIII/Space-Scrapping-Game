package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class PipeBurstingEvent extends PassiveEvents implements IPrintOptions {
    public PipeBurstingEvent(Scrapper user) {
        super(EventType.emergency, false, user);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
