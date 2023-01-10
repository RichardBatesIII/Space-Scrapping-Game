package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class MaintenanceEvent extends PassiveEvents implements IPrintOptions {
    public MaintenanceEvent(Scrapper user) {
        super(EventType.maintenence, false, user);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action() {

    }
}
