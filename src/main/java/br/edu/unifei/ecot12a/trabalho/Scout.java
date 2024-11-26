package br.edu.unifei.ecot12a.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Scout extends Soldier{
    private int expeditionExperience;
    private ODMGear odmGear;
    private List<FlareGun> flareGuns = new ArrayList<FlareGun>();
    private Horse Horse;
    private Irrational killIrrational;

    public Irrational getKillIrrational() {
        return killIrrational;
    }

    public void setKillIrrational(Irrational killIrrational) {
        this.killIrrational = killIrrational;
    }

    protected Scout(){}

    public int getExpeditionExperience() {
        return expeditionExperience;
    }
    public void setExpeditionExperience(int expeditionExperience) {
        this.expeditionExperience = expeditionExperience;
    }
    public ODMGear getOdmGear() {
        return odmGear;
    }
    public void setOdmGear(ODMGear odmGear) {
        this.odmGear = odmGear;
    }
    public List<FlareGun> getFlareGuns() {
        return flareGuns;
    }
    public void setFlareGuns(List<FlareGun> flareGuns) {
        this.flareGuns = flareGuns;
    }
    public Horse getHorse() {
        return Horse;
    }
    public void setHorse(Horse horse) {
        Horse = horse;
    };
    
}
