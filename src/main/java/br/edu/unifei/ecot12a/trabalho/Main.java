package br.edu.unifei.ecot12a.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creating Shifter Eren Yager
        Shifter eren = new Shifter();
        eren.setName("Eren Yager");

        // Creating Eren's Rational Titans
        Rational attackTitan = new Rational();
        Rational founderTitan = new Rational();
        attackTitan.setName("Attack Titan");
        founderTitan.setName("Founder Titan");

        // Associating Rational Titans with Eren
        eren.getRationals().add(attackTitan);
        eren.getRationals().add(founderTitan);

        // Adapting Eren to a Soldier
        ShifterToSoldierAdapter adaptedSoldier = new ShifterToSoldierAdapter(eren);

        // Accessing Soldier and Shifter methods
        System.out.println("Rank: " + adaptedSoldier.getRank());
        System.out.println("Name: " + adaptedSoldier.getName());
        System.out.println("Rational Titans:");
        for (Rational rational : eren.getRationals()) {
            System.out.print("- " + rational.getName());
            System.out.println();
        }

        System.out.println();

        // Creating another Shifter to be "eaten"
        Shifter lala = new Shifter();
        lala.setName("Lala Tybur");

        Rational hammerTitan = new Rational();
        hammerTitan.setName("Hammer Titan");
        lala.getRationals().add(hammerTitan);

        // Displaying Lala's Titans
        System.out.println(
                lala.getName() + " is a shifter\n" + "Rational Titans:\n" + "-" + lala.getRationals().get(0).getName());
        System.out.println();

        // Eren eats Lala
        System.out.printf(eren.getName() + " is attacking " + lala.getName() + " using ");
        attackTitan.specialHability();
        eren.eatShifter(lala);

        // Displaying Eren's Rational Titans after consuming Lala
        System.out.println("Eren's Rational Titans after eating Lala:");
        for (Rational rational : eren.getRationals()) {
            System.out.println("- " + rational.getName());
        }

        System.out.println();

        // Checking if Lala lost her Rational Titans
        System.out.println("Lala's Rational Titans (should be empty): " + lala.getRationals().size());
        System.out.println();

        // Instance of the wall Marie
        Marie marie = Marie.getInstance();
        System.out.println("Wall: " + marie.getName());
        System.out.println("Height: " + marie.getHeight() + " meters");
        System.out.println("Width: " + marie.getWidth() + " meters");
        System.out.println("Initial state: " + marie.getWallState().getClass().getSimpleName());

        // Creating Titans to attack the wall
        List<Titan> titans = new ArrayList<>();
        titans.add(attackTitan); // Eren's Attack Titan
        titans.add(new Irrational()); // Example of an Irrational Titan

        // Wall under attack
        UnderAttack underAttackState = new UnderAttack();
        underAttackState.setTitans(titans);
        marie.setWallState(underAttackState);

        // Changing the wall state
        marie.changeStage();
        System.out.println("Rallying the troops and changing the wall state...");
        System.out.println("Wall state: " + marie.getWallState().getClass().getSimpleName() + "\n");

        // Regiments
        ScoutRegiment scoutRegiment = new ScoutRegiment();
        PoliceRegiment policeRegiment = new PoliceRegiment();
        GarrisonRegiment garrisonRegiment = new GarrisonRegiment();

        // Creating Scout soldier (Armin)
        Scout armin = (Scout) scoutRegiment.createSoldier();
        armin.setName("Armin");
        armin.setRank("1st Class");
        armin.setExpeditionExperience(5);
        System.out.println("Scout Soldier: " + armin.getName());
        System.out.println("Rank: " + armin.getRank());
        System.out.println("Expedition Experience: " + armin.getExpeditionExperience());

        // Adding objects to Armin
        Horse horse = new Horse();
        horse.setName("Gustav");
        armin.setHorse(horse);
        ODMGear odmGear = new ODMGear();
        armin.setOdmGear(odmGear);
        FlareGun flareGun = new FlareGun();
        armin.getFlareGuns().add(flareGun);

        // Displaying Armin's objects
        System.out.println("Going on an expedition with " + armin.getHorse().getName()+ "...");
        armin.getOdmGear().equip();
        armin.getFlareGuns().get(0).equip();

        // Creating Police soldier (Nile Dok)
        Police nile = (Police) policeRegiment.createSoldier();
        nile.setName("Nile Dok");
        nile.setRank("2nd Class");
        System.out.println("\nPolice Soldier: " + nile.getName());
        System.out.println("Rank: " + nile.getRank());

        //Adding objects to Nile
        Shield shield = new Shield();
        nile.setShield(shield);

        // Creating Civilian Gunter
        Civilian civilian = new Civilian();
        civilian.setName("Gunter");
        List<Civilian> civilians = new ArrayList<>();
        civilians.add(civilian);
        nile.setProtectedCivilians(civilians);

        // Displaying Gunter's protection and objects
        System.out.println("Civilian underattack...");
        nile.getShield().equip();
        System.out.println("Protecting civilian: " + nile.getProtectedCivilians().get(0).getName());

        // Creating Garrison soldier (Hannes)
        Garrison hannes = (Garrison) garrisonRegiment.createSoldier();
        hannes.setName("Hannes");
        hannes.setWallDefenseSkill("Expert");
        hannes.setRank("3st Class");
        System.out.println("\nGarrison Soldier: " + hannes.getName());
        System.out.println("Rank: " + hannes.getRank());

        // Adding objects to Hannes
        Rose rose = Rose.getInstance();
        hannes.setProtectWall(rose);

        // Displaying Hannes' objects
        rose.changeStage();
        System.out.println("Rose state: " + rose.getWallState().getClass().getSimpleName());
        System.out.println("Protecting wall: " + hannes.getProtectWalls().getName());
        System.out.println("Wall defense skill: " + hannes.getWallDefenseSkill());

    }
}
