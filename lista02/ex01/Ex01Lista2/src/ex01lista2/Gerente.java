package ex01lista2;

import java.util.*;

public class Gerente{
    
    private String nome;
    private Cliente clientes[];

    public Gerente(String nome){
        this.nome = nome;
    }
    
    public boolean AceitaPedidoContaBancaria(){
        return true;
    }
    
    public boolean AceitaPedidoEmprestimo(){
        return true;
    }
    
    public boolean AceitaPedidoCartaoCredito(){
        return true;
    }

}