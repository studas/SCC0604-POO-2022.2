package com.scc0604.lista02.ex03;

public class Main {

    public static void main(String[] args) {
        SuperHeroi heroi = new SuperHeroi("Robson", "Fulgur", 100, 100);
        Vilao vilao = new Vilao("Nosbor", 150, 80);
        
        heroi.addAtaque(new Superpoder("Raio Concentrado", 40));
        heroi.addAtaque(new Superpoder("Trovao", 20));
        heroi.addAtaque(new Superpoder("Raio terrestre", 60));
        heroi.addDefesa(new Superpoder("Parede de raios", 20));
        
        vilao.addAtaque(new Superpoder("Chicote de chamas", 10));
        vilao.addAtaque(new Superpoder("Tiro de fogo", 20));
        vilao.addAtaque(new Superpoder("Chamas ardentes", 30));
        vilao.addDefesa(new Superpoder("Parede de fogo", 10));   
        

        while(vilao.getVida() > 0 && heroi.getVida() > 0){
            System.out.println(heroi.getNome() + ": " + heroi.getVida() + "hp");
            System.out.println(vilao.getNome() + ": " + vilao.getVida() + "hp");
            System.out.println("\n\n");            
            
            double vilaoAtaque = Math.random();
            double heroiAtaque = Math.random();
            
            if(heroiAtaque > vilaoAtaque){
                Superpoder poder = heroi.getAlgumAtaque();
                System.out.println(heroi.getNome() + " ataca " + vilao.getNome() + " com " + poder.getNome());
                heroi.atacar(vilao, poder);
            } else {
                Superpoder poder = vilao.getAlgumAtaque();
                System.out.println(vilao.getNome() + " ataca " + heroi.getNome() + " com " + poder.getNome());
                vilao.atacar(heroi, poder);                
            }
            
            System.out.println("\n\n");            
            
        }
        
        if(heroi.getVida() > 0){
            System.out.println(heroi.getNome() + " ganhou a luta");
        }else{
            System.out.println(vilao.getNome() + " ganhou a luta");            
        }

    }
    
}
