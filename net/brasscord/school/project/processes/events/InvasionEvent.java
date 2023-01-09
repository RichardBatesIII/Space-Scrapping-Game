package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

import java.util.Random;

public class InvasionEvent extends HostileEvents implements IPrintOptions {
    public InvasionEvent(Scrapper user) {
        super(EventType.critical, false, user);
    }

    @Override
    public void outcome() {

    }

    @Override
    public void action(String userInput) {
        System.out.println("A alien invasion occurred and your ship is under-attacked.");
        printOptions();
        Random random = new Random();
        int chances = random.nextInt(0, 100);
        if(userInput.equalsIgnoreCase(options()[0]) || userInput.equalsIgnoreCase(options()[2])) {
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
    public void victory() {

    }

    @Override
    public void failure() {

    }

    public void escape() {
        System.out.println("Your ship was able to escape the aliens.");
    }

    @Override
    public String[] options() {
        return new String[] { "defend", "retreat", "won't go down without a fight" };
    }

}
