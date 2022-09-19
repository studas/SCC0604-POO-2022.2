package ex01lista2;

import java.util.*;

public class Banco {
    private String nome;
    private float dinheiroTotal;
    private Gerente gerentes[];
    
    public Banco(String nome,float dinheiro){
        this.nome = nome;
        this.dinheiroTotal = dinheiro;
        
    }
    
    public String ReturnNome(){
        return this.nome;
    }

}