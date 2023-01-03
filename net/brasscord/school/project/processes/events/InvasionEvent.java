package net.brasscord.school.project.processes.events;

public class InvasionEvent extends HostileEvents {
    public InvasionEvent(EventType eventType, boolean instantFailure) {
        super(eventType, instantFailure);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {

    }

    @Override
    public void victory() {

    }

    @Override
    public void failure() {

    }
}
