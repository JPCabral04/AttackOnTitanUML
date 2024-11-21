package br.edu.unifei.ecot12a.trabalho;

public class Marie extends Wall {
    // Instância única do Singleton
    private static Marie instance;

    // Construtor privado aceita WallState
    private Marie(WallState wallState) {
        super(wallState);
        this.setName("Marie");
        this.setHeight(50.0f); // Altura padrão
        this.setWidth(100.0f); // Largura padrão
        this.setDestroyed(false); // Inicialmente não está destruída
    }

    // Método para obter a instância única
    public static Marie getInstance() {
        if (instance == null) {
            // Define o estado inicial como "Safe" ao criar a instância
            instance = new Marie(new Safe());
        }
        return instance;
    }
}
