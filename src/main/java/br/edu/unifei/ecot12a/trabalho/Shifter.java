package br.edu.unifei.ecot12a.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Shifter extends Human {
    private int transformationLimit;
    private List<Rational> rationals = new ArrayList<>();
    private List<Shifter> shiftersEaten = new ArrayList<>();
    
    public int getTransformationLimit() {
        return transformationLimit;
    }
    
    public void setTransformationLimit(int transformationLimit) {
        this.transformationLimit = transformationLimit;
    }
    
    public List<Rational> getRationals() {
        return rationals;
    }
    
    public void setRationals(List<Rational> rationals) {
        this.rationals = rationals;
    }
    
    public List<Shifter> getShiftersEaten() {
        return shiftersEaten;
    }

    public void eatShifter(Shifter otherShifter) {
        // Transfere todos os Rationals do outro Shifter para este.
        this.rationals.addAll(otherShifter.getRationals());
        
        // Adiciona o outro Shifter à lista de Shifters consumidos.
        this.shiftersEaten.add(otherShifter);
        
        // Limpa os Rationals do outro Shifter (simulando que ele perdeu seus poderes).
        otherShifter.getRationals().clear();
    }
}
