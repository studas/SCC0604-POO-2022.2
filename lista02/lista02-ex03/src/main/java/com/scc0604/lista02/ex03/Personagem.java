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
    private List<Superpoder> poderes;
    private float vida;
    
    public String getNome(){
        return nome;
    }
    
    public int getTotalPoder(){
        return poderes.size();
    }
    
    public float getVida(){
        return vida;
    }
    
    public void setNome(String pNome){
        nome = pNome;
    }
    
    public void addPoder(Superpoder poder){
        poderes.add(poder);
    }
    
    public void setVida(float pVida){
        vida = pVida;
    }
}
