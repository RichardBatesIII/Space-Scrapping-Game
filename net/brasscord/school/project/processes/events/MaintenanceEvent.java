package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

public class MaintenanceEvent extends PassiveEvents implements IPrintOptions {
    public MaintenanceEvent(Scrapper user) {
        super(EventType.maintenence, false, user, "Maintenance");
    }

    @Override
    public void outcome() {
        String input = userInput();
        if (input.equalsIgnoreCase("shell")) {
            user.getShip().addScrap(-10);
            user.getShip().addUnrest((byte) -10);
        } else if (input.equalsIgnoreCase("battery")) {
            user.getShip().addScrap(-5);
            user.getShip().addUnrest((byte) -5);
        } else {
            user.getShip().addScrap(-15);
            user.getShip().addUnrest((byte) -15);
        }
    }

    @Override
    public void action() {
        System.out.println(this);
        System.out.println("Your crew has some spare time"
                           + " to fix machinery which do you chose?");
        printOptions();
        outcome();
    }

    @Override
    public String[] options() {
        return new String[] { "Shell", "Battery", "Engine" };
    }
}
