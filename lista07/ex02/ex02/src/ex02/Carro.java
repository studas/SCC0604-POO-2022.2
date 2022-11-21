package ex02;

import java.io.*;
import java.util.*;
 
class Carro implements Comparable<Carro> {
    String nome;
    int peso;
    int tamanho;
 
    public Carro(String x, int y,int z)
    {
        this.nome = x;
        this.peso = y;
        this.tamanho = z;
    }
 
    public String toString()
    {
        return "(" + nome + "," + peso + "," +  tamanho + ")";
    }
 
    @Override public int compareTo(Carro a)
    {
        // if the string are not equal
        if(this.peso > a.peso){
            return 1;
        }else if(this.peso == a.peso){
            return 0;
        }else{
            return -1;
        }
    }
}