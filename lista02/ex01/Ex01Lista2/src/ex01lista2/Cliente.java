package ex01lista2;

import java.util.*;

public class Cliente{

    private String nome;
    private ContaBancaria conta;
    private Emprestimo emprestimo;
    private CartaoCredito cartaoCredito;
    
    public Cliente(String nome){
        this.nome = nome;
    }

    private void PedidoContaBancaria(){
    }

    private void PedidoEmprestimo(int valor) {
        // TODO implement here
    }
    
    private void PedidoCartaoCredito() {
        // TODO implement here
    }
    
    public String ReturnNome(){
        return this.nome;
    }
    

}