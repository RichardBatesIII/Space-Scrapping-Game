package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class OutpostEvent extends PassiveEvents implements IPrintOptions {
    public OutpostEvent(Scrapper user) {
        super(EventType.colonization, true, user);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
