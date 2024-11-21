package br.edu.unifei.ecot12a.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // FAZER DO EREN YAGER PARA INCLUIR TUDO

        // Criação de um Shifter
        Shifter eren = new Shifter();
        eren.setName("Eren");

        // Adaptação para um Soldier
        ShifterToSoldierAdapter adaptedSoldier = new ShifterToSoldierAdapter(eren);

        // Acessando métodos como Soldier
        System.out.println("Rank: " + adaptedSoldier.getRank());

        // Acessando características do Shifter
        System.out.println("Name: " + adaptedSoldier.getName());

        // Marie marie = Marie.getInstance();
        // Rational r1 = new Rational();
        // Rational r2 = new Rational();
        // Irrational i = new Irrational();

        // r1.setName("AttackTitan");
        // r2.setName("HammerTitan");
        // i.isAnomalous();

        // System.out.println("Muralha: " + marie.getName());
        // System.out.println("Altura: " + marie.getHeight() + " metros");
        // System.out.println("Largura: " + marie.getWidth() + " metros");
        // System.out.println("Estado inicial: " + (marie.isDestroyed() ? "Destroyed" : "Safe"));

        // List<Titan> titans = new ArrayList<>();
        // titans.add(r1);
        // titans.add(r2);
        // titans.add(i);

        // UnderAttack underAttack = new UnderAttack();
        // underAttack.setTitans(titans);
        // marie.setWallState(underAttack);

        // marie.getWallState().state();
    }
}
