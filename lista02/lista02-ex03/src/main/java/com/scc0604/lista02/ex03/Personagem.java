/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scc0604.lista02.ex03;

import java.util.*;

/**
 *
 * @author 12547750
 */
public class Personagem {
    private String nome;
    private List<Superpoder> poderes = new ArrayList<Superpoder>();
    private int vida;
    
    public String getNome(){
        return nome;
    }
    
    public int getTotalPoder(){
        int poderTotal = 0;
        for(int i = 0; i < poderes.size(); i++){
            poderTotal += poderes.get(i).getCategoria();
        }
        return poderTotal;
    }
    
    public int getVida(){
        return vida;
    }
    
    public Superpoder getAlgumPoder(){
        Random rand = new Random();
        return poderes.get(rand.nextInt(poderes.size()));
    }
    
    public void setNome(String pNome){
        nome = pNome;
    }
    
    public void addPoder(Superpoder poder){
        poderes.add(poder);
    }
    
    public void setVida(int pVida){
        vida = pVida;
    }
    
    public void atacar(Personagem pAtacado, Superpoder poder){
        if(Math.random() >= 0.5){
            System.out.println("Ataque mal sucedido");
            return; //ataque mal sucedido
        }
        System.out.println(poder.getNome());
        int vida_atual_atacado = pAtacado.getVida();
        int nova_vida_atacado = vida_atual_atacado - poder.getCategoria();
        pAtacado.setVida(nova_vida_atacado);
        System.out.println("Ataque bem sucedido");        
        System.out.println(pAtacado.getNome() + ": " + vida_atual_atacado + "hp -> " + nova_vida_atacado + "hp");
    }
}
