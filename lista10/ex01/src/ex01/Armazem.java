package ex01;

import java.util.Stack;

public class Armazem<T> extends Stack<T> {
    private final int limite = 100;
    private boolean fechado;

    Armazem() {
        this.fechado = false;
    }
    
    public boolean estaFechado() {
        return this.fechado && isEmpty();
    }
    
    synchronized public void fecha() {
        this.fechado = true;
    }
    
    synchronized public void recebe(T produto) {
        while (size() == limite) {
            try {
                wait(); // espera ate que um consumidor retire um produto
            } catch (InterruptedException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        push(produto);
        notifyAll(); // notifica as threads dos consumidores, as quais podem  
                     // estar esperando liberacao para a retirada de um produto
    }
    
    synchronized public T envia() {
        while (isEmpty() && !estaFechado()) {
            try {
                wait(); // espera ate que o produtor entregue um produto
            } catch (InterruptedException e) {
                System.out.println("Erro: " + e.getMessage());
            } 
        }
        
        if (estaFechado())
            return null; // nada mais a retirar
        
        T produto = pop();
        notifyAll(); // notifica a thread do produtor que pode estar esperando
                     // liberacao para a entrega de um novo produto
        return produto;
    }
    
}