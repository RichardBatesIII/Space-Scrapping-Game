package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class ShipMeltdownEvent extends HostileEvents implements IPrintOptions {
    public ShipMeltdownEvent(Scrapper user) {
        super(EventType.emergency, true, user);
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
