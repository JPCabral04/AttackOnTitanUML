package br.edu.unifei.ecot12a.trabalho;

public class ShifterToSoldierAdapter extends Soldier {
    private Shifter shifter;

    public ShifterToSoldierAdapter(Shifter shifter) {
        this.shifter = shifter;
    }

    @Override
    public String getRank() {
        return "Shifter Soldier - Rank Special!";
    }

    public int getTransformationLimit() {
        return shifter.getTransformationLimit();
    }

    public String getName() {
        return shifter.getName();
    }
}
