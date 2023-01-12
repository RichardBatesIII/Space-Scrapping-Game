package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

import java.util.Random;

public class ShipMeltdownEvent extends HostileEvents implements IPrintOptions {
    public ShipMeltdownEvent(Scrapper user) {
        super(EventType.emergency, true, user, "Ship Meltdown emergency");
    }

    @Override
    public void outcome() {
        Random random = new Random();
        String input = userInput();
        if(input.equalsIgnoreCase(options()[0])) {
            if(random.nextInt(0, 100) > 50)
                victory();
            else
                failure();
        } else {
            if(random.nextInt(0, 100) <= 50)
                victory();
            else
                failure();
        }
    }

    @Override
    public void action() {
        System.out.println(this);
        System.out.println("Ship started to meltdown where should you check?");
        printOptions();
    }

    @Override
    public void victory() {
        System.out.println("You found the source of"
                           + " the meltdown and fixed it in time.");
        user.getShip().addUnrest((byte) -5);
    }

    @Override
    public void failure() {
        System.out.println("You couldn't repair the ship in time...");
        user.getShip().setHealth(-100);
    }

    @Override
    public String[] options() {
        return new String[] { "Engine", "Battery" };
    }
}
