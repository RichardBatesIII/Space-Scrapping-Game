package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;
import java.util.Random;

public class HarvestFailureEvent extends PassiveEvents {

    public HarvestFailureEvent(Scrapper user) {
        super(EventType.emergency, false, user, "Harvest Emergency");
    }

    @Override
    public void outcome() {
        Random random = new Random();
        int randomInt = random.nextInt(0, 10);
        if(randomInt < 4) {
            System.out.println("Your ship's gardener fell ill"
                               + " and no one can farm.");
            user.getShip().setUnrest((byte) (1 + user.getShip().getUnrest()));
        } else if(randomInt < 7) {
            System.out.println("The plants were sabotaged and"
                               + " it has caused a panic.");
            user.getShip().setUnrest((byte) (3 + user.getShip().getUnrest()));
        } else if(randomInt < 10) {
            System.out.println("Your farm suddenly died to a solar flare");
            user.getShip().setUnrest((byte) (5 + user.getShip().getUnrest()));
        }
    }

    @Override
    public void action() {
        System.out.println(this);
        System.out.println("\n");
        outcome();
    }
}
