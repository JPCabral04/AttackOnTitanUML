package br.edu.unifei.ecot12a.trabalho;

public class Rose extends Wall{
    private static Rose instance;   

    private Rose() {
        this.setName("Rose");
        this.setHeight(50.0f); 
        this.setWidth(50.0f); 
        this.setDestroyed(false); 
    }

    public static Rose getInstance() {
        if (instance == null) {
            instance = new Rose();
        }
        return instance;
    }
}
