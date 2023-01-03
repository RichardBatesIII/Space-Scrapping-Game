package net.brasscord.school.project.processes.events;

public class ShopkeeperEncounterEvent extends PassiveEvents {
    public ShopkeeperEncounterEvent(EventType eventType, boolean upgradeable) {
        super(eventType, upgradeable);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
