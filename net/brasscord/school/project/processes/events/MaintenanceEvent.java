package net.brasscord.school.project.processes.events;

public class MaintenanceEvent extends PassiveEvents {
    public MaintenanceEvent(EventType eventType, boolean upgradeable) {
        super(eventType, upgradeable);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
