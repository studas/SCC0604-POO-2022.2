package ex01lista2;

import java.util.*;

public class ContaBancaria extends Produto{
    
    private float saldo;

    public ContaBancaria(int saldo){
        this.saldo = saldo;
    }

    public void Depositar(int valor) {
    }
    
    public void Sacar(int valor) {
    }
    
    public void Transferir(int valor, int NumeroRegistroContaDestino) {
    }

    public int RetornaSaldo() {
        return 0;
    }

}