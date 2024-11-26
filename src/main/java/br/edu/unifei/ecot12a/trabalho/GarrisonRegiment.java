package br.edu.unifei.ecot12a.trabalho;

public class GarrisonRegiment implements SoldierFactory{

    @Override
    public Soldier createSoldier() {
        return new Garrison();
    }
    
}
