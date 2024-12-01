package br.edu.unifei.ecot12a.trabalho;


public class Garrison extends Soldier{
    private String wallDefenseSkill;
    private Wall protectWall;

    protected Garrison(){}

    public String getWallDefenseSkill() {
        return wallDefenseSkill;
    }

    public void setWallDefenseSkill(String wallDefenseSkill) {
        this.wallDefenseSkill = wallDefenseSkill;
    }

    public Wall getProtectWalls() {
        return protectWall;
    }

    public void setProtectWall(Wall protectWall) {
        this.protectWall = protectWall;
    };

}
