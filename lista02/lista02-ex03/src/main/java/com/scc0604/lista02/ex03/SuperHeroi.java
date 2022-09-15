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
public class SuperHeroi extends Personagem{
    private String nome_vida_real;
    
    public SuperHeroi(String pNomeReal, String pNome, int vida, int forca){
        super(pNome, vida, forca);
        nome_vida_real = pNomeReal;
    }
    
    public String getNomeVidaReal(){
        return nome_vida_real;
    }
}
