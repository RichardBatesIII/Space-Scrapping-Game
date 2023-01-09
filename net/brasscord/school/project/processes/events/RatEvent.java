package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class RatEvent extends HostileEvents {
    public RatEvent(Scrapper user) {
        super(EventType.emergency, false, user);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }

    @Override
    public void victory() {

    }

    @Override
    public void failure() {

    }
}
