package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

import java.util.Random;

public class InvasionEvent extends HostileEvents implements IPrintOptions {
    public InvasionEvent(Scrapper user) {
        super(EventType.critical, false, user, "Invasion");
    }

    @Override
    public void outcome() {
        String input = userInput();
        Random random = new Random();
        int chances = random.nextInt(0, 100);
        if(input.equalsIgnoreCase(options()[0]) 
           || input.equalsIgnoreCase(options()[2])) {
            if(chances >= 50)
                victory();
            else
                failure();
        } else {
            if(chances >= 25)
                escape();
            else
                failure();
        }
    }

    @Override
    public void action() {
        System.out.println(this);
        System.out.println("A alien invasion occurred"
                           + " and your ship is under-attacked.");
        printOptions();
        outcome();
    }

    @Override
    public void victory() {
        Random random = new Random();
        int scrap = random.nextInt(25, 100);
        System.out.println("You did it! You defeated the unknown foes"
                           + " and gained some loot.\nYou gained "
                           + scrap + " scrap!");
        user.getShip().addScrap(scrap);
        user.getShip().addUnrest((byte) -5);
    }

    @Override
    public void failure() {
        System.out.println("You where caught up in a battle"
                           + " and gained severe damage.");
        user.getShip().addScrap(-10);
        user.getShip().addUnrest((byte) 10);
        user.getShip().setHealth(user.getShip().getHealth() - 30);
    }

    public void escape() {
        System.out.println("Your ship was able to escape the aliens.");
        user.getShip().addUnrest((byte) 1);
    }

    @Override
    public String[] options() {
        return new String[] { "defend", "retreat", "never backdown" };
    }

}
