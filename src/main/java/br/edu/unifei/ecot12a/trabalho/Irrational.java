package br.edu.unifei.ecot12a.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Irrational extends Titan{
    private boolean isAnomalous;
    private List<Human> humansKilled = new ArrayList<Human>();

    public boolean isAnomalous() {
        return isAnomalous;
    }

    public void setAnomalous(boolean isAnomalous) {
        this.isAnomalous = isAnomalous;
    }

    public List<Human> getHumans() {
        return humansKilled;
    }

    public void setHumans(List<Human> humans) {
        this.humansKilled = humans;
    }

    
}
