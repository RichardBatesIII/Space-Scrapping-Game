package net.brasscord.school.project.processes.events;

public class ResourceEvent extends PassiveEvents {
    public ResourceEvent(EventType eventType, boolean upgradeable) {
        super(eventType, upgradeable);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
