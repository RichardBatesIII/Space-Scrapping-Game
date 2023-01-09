package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

import java.util.Random;

public class AbandonedShipEvent extends PassiveEvents implements IPrintOptions {

    public AbandonedShipEvent(Scrapper user) {
        super(EventType.scrapping, false, user);
    }

    @Override
    public void outcome() {
        Random random = new Random();
        int i = random.nextInt(50);
        System.out.println("The ship carried some goodies.\nYou gained " + i + " scraps.");
        user.getShip().addScrap(i);

    }

    @Override
    public void action(String userInput) {
        printOptions();
        if(userInput.equalsIgnoreCase(options()[0]))
            outcome();
        else
            System.out.println("You reported the ship to your alliance and left the scene.");

    }

    @Override
    public String[] options() {
        return new String[] { "explore", "report"};
    }

}
