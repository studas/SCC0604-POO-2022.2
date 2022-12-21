package ex01;

/**
 * Lista 10 - exercicio 01
 * 
 * @author Carlos Craveiro
 * @nusp 12547187
 */
public class Ex01 {

public static void main(String[] args) {
        int unidades = 5000; // unidades a produzir
        String [] nomes = {"Robson", "Leonardo", "Ferreira", "Cordeiro"};
                
        // Cria Classe Armazem
        Armazem<Bolo> deposito = new Armazem<>();
        
        // Instancia a thread de producao
        Thread produtor = new Thread(new Cafeteria("Jardim", unidades, deposito));
        
        // Cria o array de consumidosres
        Consumidor [] consumidores = new Consumidor[nomes.length];
        
        // Cria o array de threads
        Thread [] thread_array = new Thread[nomes.length];
        
        for (int i=0; i<nomes.length; i++) { // Linka uma thread a um dos consumidores
            consumidores[i] = new Consumidor(nomes[i], deposito);
            thread_array[i] = new Thread(consumidores[i]);
        }
        
        produtor.start(); // inicia a producao
        System.out.println("A Cafeteria esta aberta!");
        
        for (int i=0; i<nomes.length; i++)
            thread_array[i].start(); // inicia o consumo
        
        try {
            produtor.join(); // espera o termino da producao
            for (int i = 0; i < nomes.length; i++)
                thread_array[i].join(); // espera o termino do consumo
        
        } catch(InterruptedException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        
        // lista a quantidade de itens consumidos por cada consumidor
        for (int i=0; i<nomes.length; i++) {
            System.out.println("O consumidor " + nomes[i] 
                    + " consumiu " + consumidores[i].getConsumido() 
                    + " fatias de " + consumidores[i].getUltimoConsumido());
        }
        
        System.out.println(); // nova linha
        
        // descobre o maior consumidor
        int mais_guloso = 0;
        for (int i=1; i<nomes.length; i++)
            if (consumidores[i].getConsumido() > consumidores[mais_guloso].getConsumido())
                mais_guloso = i;
        System.out.println("O maior consumidor foi " + nomes[mais_guloso] 
                + ", o qual consumiu " + consumidores[mais_guloso].getConsumido() 
                + " fatias de " + consumidores[mais_guloso].getUltimoConsumido());
    }
    
}
