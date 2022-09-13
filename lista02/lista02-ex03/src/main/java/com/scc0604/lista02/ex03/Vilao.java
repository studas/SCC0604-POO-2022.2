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
public class Vilao extends Personagem{
    int anos_prisao;
    
    public Vilao(int vida){
        setVida(vida);
    }
    
    public int getAnosPrisao(){
        return anos_prisao;
    }
    
    public void setAnosPrisao(int pAnos){
        anos_prisao = pAnos;
    }
}
