package br.edu.unifei.ecot12a.trabalho;

public class Marie extends Wall {
    
    private static Marie instance;

    
    private Marie() {
        this.setName("Marie");
        this.setHeight(50.0f); 
        this.setWidth(100.0f); 
        this.setDestroyed(false); 
    }

    
    public static Marie getInstance() {
        if (instance == null) {
            instance = new Marie();
        }
        return instance;
    }
}
