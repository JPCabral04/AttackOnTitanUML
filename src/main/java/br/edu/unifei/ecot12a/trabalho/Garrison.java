package br.edu.unifei.ecot12a.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Garrison extends Soldier{
    private int wallDefenseSkill;
    private List<Wall> protectWalls = new ArrayList<Wall>();

    protected Garrison(){}

    public int getWallDefenseSkill() {
        return wallDefenseSkill;
    }

    public void setWallDefenseSkill(int wallDefenseSkill) {
        this.wallDefenseSkill = wallDefenseSkill;
    }

    public List<Wall> getProtectWalls() {
        return protectWalls;
    }

    public void setProtectWalls(List<Wall> protectWalls) {
        this.protectWalls = protectWalls;
    };

}
