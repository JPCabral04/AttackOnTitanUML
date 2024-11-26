package br.edu.unifei.ecot12a.trabalho;

public class Shield extends Equipment{
    private float weight;

    @Override
    public void equip() {
        System.out.println("Shield equipped");
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }  


}
