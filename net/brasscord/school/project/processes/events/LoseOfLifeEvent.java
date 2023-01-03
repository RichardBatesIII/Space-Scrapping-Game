package net.brasscord.school.project.processes.events;

public class LoseOfLifeEvent extends PassiveEvents {
    public LoseOfLifeEvent(EventType eventType, boolean upgradeable) {
        super(eventType, upgradeable);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
