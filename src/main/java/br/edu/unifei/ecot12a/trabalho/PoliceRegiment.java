package br.edu.unifei.ecot12a.trabalho;

public class PoliceRegiment implements SoldierFactory {
    public Soldier createSoldier() {
        return new Police();
    }
    
}
