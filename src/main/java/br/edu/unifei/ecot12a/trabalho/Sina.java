package br.edu.unifei.ecot12a.trabalho;

public class Sina extends Wall{
    private static Sina instance;

    private Sina() {
        this.setName("Sina");
        this.setHeight(50.0f); 
        this.setWidth(20.0f); 
        this.setDestroyed(false); 
    }

    public static Sina getInstance() {
        if (instance == null) {
            instance = new Sina();
        }
        return instance;
    }

}
