package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class WireSlashedEvent extends HostileEvents {
    public WireSlashedEvent(Scrapper user) {
        super(EventType.maintenence, false, user);
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
