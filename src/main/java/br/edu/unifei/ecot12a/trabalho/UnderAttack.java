package br.edu.unifei.ecot12a.trabalho;

import java.util.ArrayList;
import java.util.List;

public class UnderAttack implements WallState {

    private List<Titan> titans = new ArrayList<Titan>();

    @Override
    public void state() {
        boolean hasIrrational = false;

        for (Titan titan : titans) {
            if (titan instanceof Rational) {
                System.out.println("The wall is underattack by " + ((Rational) titan).getName() + "!");
            } else {
                hasIrrational = true;
            }
        }

        if (hasIrrational) {
            System.out.println("The wall is underattack by Irrationals!");
        }
    }

    public List<Titan> getTitans() {
        return titans;
    }

    public void setTitans(List<Titan> titans) {
        this.titans = titans;
    }
}
