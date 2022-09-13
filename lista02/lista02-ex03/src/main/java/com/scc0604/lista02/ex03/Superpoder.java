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
public class Superpoder {
    private int categoria;
    private String nome;
    private float multiplicado_ataque;
    
    public Superpoder(String pNome, int pCategoria, float pMultiplicado_ataque){
        nome = pNome;
        categoria = pCategoria;
        multiplicado_ataque = Math.min(1, Math.max(0, pMultiplicado_ataque));
    }
    
    public int getCategoria(){
        return categoria;
    }
    
    public String getNome(){
        return nome;
    }
    
    public float getIntensidade(){
        return multiplicado_ataque;
    }
    
    public void setCategoria(int pCategoria){
        categoria = pCategoria;
    }
    
    public void setNome(String pNome){
        nome = pNome;
    }
    
    public void setIntensidade(float pMultiplicador_ataque){
        multiplicado_ataque = Math.min(1, Math.max(0, pMultiplicador_ataque));
    }
}
