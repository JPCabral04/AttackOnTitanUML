package br.edu.unifei.ecot12a.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Shifter extends Human{
    private int transformationLimit;
    private List<Rational> rationals = new ArrayList<Rational>();
    
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
    
}
