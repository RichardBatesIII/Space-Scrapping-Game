package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class ResourceEvent extends PassiveEvents {
    public ResourceEvent(Scrapper user) {
        super(EventType.scrapping, true, user);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
