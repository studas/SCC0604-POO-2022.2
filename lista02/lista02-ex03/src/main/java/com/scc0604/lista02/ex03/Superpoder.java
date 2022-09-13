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
    
    public Superpoder(String pNome, int pCategoria){
        nome = pNome;
        categoria = pCategoria;
    }
    
    public int getCategoria(){
        return categoria;
    }
    
    public String getNome(){
        return nome;
    }
}
