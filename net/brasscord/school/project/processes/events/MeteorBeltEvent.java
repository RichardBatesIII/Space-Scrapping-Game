package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class MeteorBeltEvent extends HostileEvents implements IPrintOptions {
    public MeteorBeltEvent(Scrapper user) {
        super(EventType.emergency, true, user);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action() {

    }

    @Override
    public void victory() {

    }

    @Override
    public void failure() {

    }
}
