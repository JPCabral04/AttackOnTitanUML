package br.edu.unifei.ecot12a.trabalho;

public abstract class Equipment {
    private String name;
    private float weight;   
    private String type;

    public abstract void equip();

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public float getWeight() {
        return weight;
    }



    public void setWeight(float weight) {
        this.weight = weight;
    }



    public String getType() {
        return type;
    }



    public void setType(String type) {
        this.type = type;
    }
}
