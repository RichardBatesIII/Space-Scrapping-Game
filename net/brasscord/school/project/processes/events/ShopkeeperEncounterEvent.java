package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class ShopkeeperEncounterEvent extends PassiveEvents implements IPrintOptions {
    public ShopkeeperEncounterEvent(Scrapper user) {
        super(EventType.merchant, true, user);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
