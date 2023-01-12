package net.brasscord.school.project.processes.events;

import java.util.Random;

import net.brasscord.school.project.user.Scrapper;

public class MeteorBeltEvent extends HostileEvents implements IPrintOptions {
    public MeteorBeltEvent(Scrapper user) {
        super(EventType.emergency, true, user, "Asteroid Belt Mission");
    }

    @Override
    public void outcome() {
        String input = userInput();
        if(input.equalsIgnoreCase("enter")) {
            Random random = new Random();
            if(random.nextInt(1, 100) > 40) {
                victory();
            } else {
               failure(); 
            }
        } else {
            System.out.println("You rerouted and avoided the asteroids");
        }
    }

    @Override
    public void action() {
        System.out.println(this);
        System.out.println("You ran into a asteroid belt what should you do?");
        printOptions();
        outcome();
    }

    @Override
    public void victory() {
        System.out.println("You escaped the belt safely");
        user.getShip().travel();
    }

    @Override
    public void failure() {
        System.out.println("You were damaged by"
                           + " some of the asteroids");                
        user.getShip().setHealth(user.getShip().getHealth() - 10);
    }

    @Override
    public String[] options() {
        return new String[] { "Enter", "Reroute" };
    }
}
