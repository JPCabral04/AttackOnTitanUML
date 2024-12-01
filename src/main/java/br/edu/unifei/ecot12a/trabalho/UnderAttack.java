package br.edu.unifei.ecot12a.trabalho;

import java.util.ArrayList;
import java.util.List;

public class UnderAttack implements WallState {

    private List<Titan> titans = new ArrayList<>();

    @Override
    public void state(Wall wall) {
        if (titans.isEmpty()) {
            System.out.println("No Titans are attacking the wall.");
            wall.setWallState(new Safe());
            return;
        }

        boolean hasRational = false;
        boolean hasIrrational = false;

        for (Titan titan : titans) {
            if (titan instanceof Rational) {
                System.out.println("The wall is under attack by Rational Titan: " + ((Rational) titan).getName());
                hasRational = true;
            } else if (titan instanceof Irrational) {
                System.out.println("The wall is under attack by an Irrational Titan!");
                hasIrrational = true;
            }
        }

        if (hasRational && hasIrrational) {
            System.out.println("The wall is severely under attack!");
        } else if (hasRational) {
            System.out.println("The wall is being strategically attacked by Rational Titans.");
        } else {
            System.out.println("The wall is under chaotic attack by Irrational Titans.");
        }
        
        wall.setWallState(new Safe());
    }

    public List<Titan> getTitans() {
        return new ArrayList<>(titans); 
    }

    public void setTitans(List<Titan> titans) {
        if (titans == null) {
            throw new IllegalArgumentException("Titans list cannot be null.");
        }
        this.titans = new ArrayList<>(titans); 
    }
}
