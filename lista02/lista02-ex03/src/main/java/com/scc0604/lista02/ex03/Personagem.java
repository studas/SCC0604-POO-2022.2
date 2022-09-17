package com.scc0604.lista02.ex03;

import java.util.*;

public class Personagem {
    private String nome;
    private List<Superpoder> ataques = new ArrayList<Superpoder>();
    private List<Superpoder> defesas = new ArrayList<Superpoder>();    
    private int vida;
    private int forca;
    
    public Personagem(String pNome, int pVida, int pForca){
        nome = pNome;
        vida = pVida;
        forca = pForca;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getTotalPoder(){
        int poderTotal = 0;
        for(int i = 0; i < ataques.size(); i++){
            poderTotal += ataques.get(i).getCategoria();
        }
        return poderTotal;
    }
    
    public int getVida(){
        return vida;
    }
    
    public int getForca(){
        return forca;
    }
    
    public Superpoder getAlgumAtaque(){
        Random rand = new Random();
        return ataques.get(rand.nextInt(ataques.size()));
    }
    
    public Superpoder getAlgumaDefesa(){
        Random rand = new Random();
        return defesas.get(rand.nextInt(defesas.size()));
    }
    
    public void setVida(int pVida){
        vida = pVida;
    }
    
    public void addAtaque(Superpoder pAtaque){
        ataques.add(pAtaque);
    }
    
    public void addDefesa(Superpoder pDefesa){
        defesas.add(pDefesa);
    }
    
    public void atacar(Personagem pAtacado, Superpoder ataque){
        if(Math.random() >= 0.5){
            System.out.println("Ataque mal sucedido");
            return; //ataque mal sucedido
        } 
        
        System.out.println("Ataque " + ataque.getNome() + " realizado");
        
        int protecao = 0;
        double chance_nao_defesa = (forca - pAtacado.getForca())/100.0;
        double chanc = Math.random();
        //System.out.println(chanc + " >=" + (0.5 + chance_nao_defesa));
        if(chanc >= (0.5 + chance_nao_defesa)){
            Superpoder defesa = pAtacado.getAlgumaDefesa();
            protecao = defesa.getCategoria();
            if((ataque.getCategoria() - protecao) <= 0){
                System.out.println("Ataque totalmente defendido com " + defesa.getNome());
                return;
            }
            System.out.println("Ataque parcialmente defendido com " + defesa.getNome());
        }
        
        int vida_atual_atacado = pAtacado.getVida();
        int nova_vida_atacado = vida_atual_atacado - (ataque.getCategoria() - protecao);
        pAtacado.setVida(nova_vida_atacado);
        System.out.println(pAtacado.getNome() + ": " + vida_atual_atacado + "hp -> " + nova_vida_atacado + "hp");
    }
}
