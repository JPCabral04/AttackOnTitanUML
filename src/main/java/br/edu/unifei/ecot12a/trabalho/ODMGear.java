package br.edu.unifei.ecot12a.trabalho;

public class ODMGear extends Equipment{

    private int gasSupply;
    private int bladesDurability;

    @Override
    public void equip() {
        System.out.println("ODM Gear equipped");
    }

    public int getGasSupply() {
        return gasSupply;
    }



    public void setGasSupply(int gasSupply) {
        this.gasSupply = gasSupply;
    }



    public int getBladesDurability() {
        return bladesDurability;
    }



    public void setBladesDurability(int bladesDurability) {
        this.bladesDurability = bladesDurability;
    }

}
