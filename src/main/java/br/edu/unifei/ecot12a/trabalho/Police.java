package br.edu.unifei.ecot12a.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Police extends Soldier{
    private boolean protectionDuty;
    private Shield shield;
    
    private List<Civilian> protectedCivilians = new ArrayList<Civilian>();

    protected Police(){}

    public boolean isProtectionDuty() {
        return protectionDuty;
    }

    public void setProtectionDuty(boolean protectionDuty) {
        this.protectionDuty = protectionDuty;
    }

    public List<Civilian> getProtectedCivilians() {
        return protectedCivilians;
    }

    public void setProtectedCivilians(List<Civilian> protectedCivilians) {
        this.protectedCivilians = protectedCivilians;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    };

    
}
