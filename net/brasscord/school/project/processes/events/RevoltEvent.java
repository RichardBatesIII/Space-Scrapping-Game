package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.ship.CrewType;
import net.brasscord.school.project.ship.Ship;
import net.brasscord.school.project.user.Scrapper;

import java.util.Random;
import java.util.Scanner;

public class RevoltEvent extends HostileEvents implements IPrintOptions {
    public RevoltEvent(Scrapper user) {
        super(EventType.emergency, true, user);
    }

    @Override
    public void outcome() {
        Random random = new Random();
        int chance = random.nextInt(0, 100);
        String input = userInput();
        if (input.equalsIgnoreCase(options()[0])) {
            System.out.println("You sabotaged the revolution");
            if(chance > 25) {
                System.out.println("The sabotage worked and revolt failed");
                user.getShip().addUnrest((byte) 10);
            } else {
                System.out.println("Your sabotage failed and the coup succeeded");
                user.getShip().setHealth(0);
            }
        } else {
            if(chance > 50)
                System.out.println("You some how avoided a revolution?");
            else {
                System.out.println("You escaped via a new ship with some of your men");
                Scanner scan = new Scanner(System.in);
                System.out.println("Type a new name for your ship");
                String name = scan.nextLine();
                user.setShip(new Ship(name, 50, CrewType.Militant, user));
            }
        }
    }

    @Override
    public void action() {
        System.out.println("It seems due to a disagreement it has sparked a lot of controversy.");
        printOptions();
        outcome();
    }

    @Override
    public void victory() {

    }

    @Override
    public void failure() {

    }

    @Override
    public String[] options() {
        return new String[] { "Sabotage", "Do nothing" };
    }
}
