package br.edu.unifei.ecot12a.trabalho;

public class Rational extends Titan{
    private String name;

    public void specialAbility(){
        System.out.println("Special ability: " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
