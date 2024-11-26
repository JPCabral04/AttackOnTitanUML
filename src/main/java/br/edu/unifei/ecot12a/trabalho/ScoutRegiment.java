package br.edu.unifei.ecot12a.trabalho;

public class ScoutRegiment implements SoldierFactory {
    
    @Override
    public Soldier createSoldier() {
        return new Scout();
    }   
    
}
