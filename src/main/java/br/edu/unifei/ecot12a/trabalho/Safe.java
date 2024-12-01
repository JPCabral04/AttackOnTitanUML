package br.edu.unifei.ecot12a.trabalho;

public class Safe implements WallState{

    @Override
    public void state(Wall wall) {
        wall.setWallState(new UnderAttack());
    }
    
}
