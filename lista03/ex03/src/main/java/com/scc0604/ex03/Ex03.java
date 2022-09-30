package com.scc0604.ex03;

import java.util.*;

public class Ex03 {

    public static void main(String[] args) {
        ArrayList<PegadaDeCarbono> objetos = new ArrayList<PegadaDeCarbono>();
        objetos.add(new Escola(420, 1500, 4, 12, 220));
        objetos.add(new Escola(365, 1450, 3, 10, 130));
        objetos.add(new Casa(200, 360, 4, 7));
        objetos.add(new Casa(110, 300, 4, 9));
        objetos.add(new Carro(100, 1000, 12, 15));
        objetos.add(new Carro(200, 1200, 10, 20));
        objetos.add(new Bicicleta(21, 15, 10));
        objetos.add(new Bicicleta(12, 10, 18));

        for(PegadaDeCarbono peg : objetos){
            System.out.println("Pegada de carbono de " + peg.getClass().getSimpleName() + " é " + peg.getPegadaDeCarbono());
        }
    }
}
