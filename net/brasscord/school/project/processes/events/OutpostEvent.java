package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class OutpostEvent extends PassiveEvents implements IPrintOptions {
    public OutpostEvent(Scrapper user) {
        super(EventType.colonization, true, user);
    }

    @Override
    public void outcome() {
        String input = userInput();
        if(input.equalsIgnoreCase("accept")) {
            user.getShip().setColonies(user.getShip().getColonies() + 1);
            user.getShip().addScrap(-10);
            user.getShip().addUnrest((byte) -5);
        }
    }

    @Override
    public void action() {
        System.out.println("You discovered a undiscovered planet do you want to colonize the planet?\nIt costs 10 scrap.");
        printOptions();
        outcome();
    }
}
