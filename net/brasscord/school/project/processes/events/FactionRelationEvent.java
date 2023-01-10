package net.brasscord.school.project.processes.events;

import net.brasscord.school.project.user.Scrapper;

import java.util.Random;

public class FactionRelationEvent extends PassiveEvents implements IPrintOptions {

    public FactionRelationEvent(Scrapper user) {
        super(EventType.confrontation, false, user);
    }

    @Override
    public void outcome() {
        Random random = new Random();
        int factionGenerator = random.nextInt(2);
        int scrap = random.nextInt(20);
        if(factionGenerator == 0) {
            if(user.getUEFRelation() > 0) {
                System.out.println("You traded with the UEF and gained some scrap");
                user.getShip().addScrap(scrap);
            }
            else {
                System.out.println("The UEF raided your ship");
                user.getShip().addScrap(-5);
            }
        } else if (factionGenerator == 1) {
            if(user.getIlluminateRelation() > 0) {
                System.out.println("You traded with the Illuminate and gained some scrap");
                user.getShip().addScrap(scrap);
            }
            else {
                System.out.println("The illuminate rained your ship");
                user.getShip().addScrap(-5);
            }
        } else if (factionGenerator == 2) {
            if(user.getCybranRelation() > 0) {
                System.out.println("You traded with the Cybran and gained some scrap");
                user.getShip().addScrap(scrap);
            }
            else {
                System.out.println("The Cybran raided your ship");
                user.getShip().addScrap(-5);
            }
        }
        factionConfronted(factionGenerator);
    }

    @Override
    public void action() {
      printOptions();
      System.out.println("You encountered a unknown ship!");
      if(userInput().equalsIgnoreCase(options()[0]))
        outcome();
    }

    private void factionConfronted(int factionEncounter) {
        if(factionEncounter == 0) {
            user.setUEFRelation(user.getUEFRelation() + 1);
        } else if (factionEncounter == 1) {
            user.setIlluminateRelation(user.getIlluminateRelation() + 1);
        } else if (factionEncounter == 2) {
            user.setCybranRelation(user.getCybranRelation() + 1);
        }
    }

    @Override
    public String[] options() {
        return new String[] { "engage", "escape" };
    }
}
