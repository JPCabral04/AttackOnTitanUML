package br.edu.unifei.ecot12a.trabalho;

public class Rational extends Titan {
    private String name;

    public String getName() {
        return name;
    }
    

    public void specialHability() {
        System.out.println(name + " is using its special hability!");
    }


    public void setName(String name) {
        this.name = name;
    }
}
