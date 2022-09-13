/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scc0604.lista02.ex03;

/**
 *
 * @author 12547750
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SuperHeroi heroi = new SuperHeroi("Robson", 100);
        heroi.setNome("Fulgur");
        Vilao vilao = new Vilao(150);
        vilao.setNome("Nosbor");
        
        heroi.addPoder(new Superpoder("Raio Concentrado", 40));
        heroi.addPoder(new Superpoder("Trovao", 20));
        heroi.addPoder(new Superpoder("Raio terrestre", 60));
        
        vilao.addPoder(new Superpoder("Chicote de chamas", 10));
        vilao.addPoder(new Superpoder("Tiro de fogo", 20));
        vilao.addPoder(new Superpoder("Chamas ardentes", 30));

        while(vilao.getVida() > 0 && heroi.getVida() > 0){
            System.out.println(heroi.getNome() + ": " + heroi.getVida() + "hp");
            System.out.println(vilao.getNome() + ": " + vilao.getVida() + "hp");
            System.out.println("\n\n");            
            
            double vilaoAtaque = Math.random();
            double heroiAtaque = Math.random();
            
            if(heroiAtaque > vilaoAtaque){
                Superpoder poder = heroi.getAlgumPoder();
                System.out.println(heroi.getNome() + " ataca " + vilao.getNome() + " com " + poder.getNome());
                heroi.atacar(vilao, poder);
            } else {
                Superpoder poder = vilao.getAlgumPoder();
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
