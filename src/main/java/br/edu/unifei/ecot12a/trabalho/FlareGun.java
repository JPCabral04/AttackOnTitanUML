package br.edu.unifei.ecot12a.trabalho;

public class FlareGun extends Equipment{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void equip() {
        System.out.println("Flare Gun equipped");
    }
}
