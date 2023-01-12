package net.brasscord.school.project.processes.events;

import java.util.Random;

import net.brasscord.school.project.user.Scrapper;

public class ResourceEvent extends PassiveEvents {
    public ResourceEvent(Scrapper user) {
        super(EventType.scrapping, true, user, "Resource vein found");
    }

    @Override
    public void outcome() {
        Random random = new Random();
        int chance = random.nextInt(1, 100);
        if(chance > 50)
            System.out.println("You found a steel-like substance and you gained "
                               + chance + " scrap!");
        else
            System.out.println("You found a common ore vein and you gained "
                               + chance + " scrap in exchange.");
        user.getShip().addScrap(chance);
    }

    @Override
    public void action() {
        System.out.println(this);
        System.out.println("While exploring you came"
                           + " across a ore vein of a unknown substance!");
        outcome();
    }
}
