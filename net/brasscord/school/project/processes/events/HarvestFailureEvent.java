package net.brasscord.school.project.processes.events;

public class HarvestFailureEvent extends PassiveEvents {
    public HarvestFailureEvent(EventType eventType, boolean upgradeable) {
        super(eventType, upgradeable);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
