package net.brasscord.school.project.processes.events;

public class LowOnFundsEvent extends PassiveEvents {
    public LowOnFundsEvent(EventType eventType, boolean upgradeable) {
        super(eventType, upgradeable);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }
}
