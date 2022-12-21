/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;
import java.util.*;

/**
 *
 * @author arturbrennerweber
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE A QUANTIDADE DE NUMEROS A CALCULAR: ");
        long numeroRaizesCalculadas = scanner.nextLong();
        System.out.println("0: TESTE LEVE");
        System.out.println("1: TESTE MODERADO");
        System.out.println("2: TESTE PESADO");
        System.out.print("DIGITE O TESTE A EXECUTAR: ");
        int teste = scanner.nextInt();
        int numeroAmostras = 10;
        
        
        //EXECUTANDO SINGLE-CORE
        long[] temposIndividuais;
        temposIndividuais = new long[numeroAmostras];
        long tempoTotal = 0;    
        
        TesteExecutado executar = new TesteExecutado(numeroRaizesCalculadas, 1, teste);
        
        for (int i = 0; i < numeroAmostras; i++) {
            long tempoInicial = System.currentTimeMillis();
            
            executar.run();
            
            long tempoFinal = System.currentTimeMillis();
            temposIndividuais[i] = tempoFinal - tempoInicial;
            tempoTotal += temposIndividuais[i];
        }       
        
        long tempoMedio = tempoTotal / numeroAmostras;
        System.out.println("O TEMPO MEDIO E DE " + tempoMedio + " MILISEGUNDOS EM SINGLE-CORE");
        
        
        
        //EXECUTANDO MULTI-CORE
        int numNucleosMaquina = Runtime.getRuntime().availableProcessors();
        
        tempoTotal = 0;
        
        for (int i = 0; i < numeroAmostras; i++) { 
            
            TesteExecutado[] threads;
            threads = new TesteExecutado[numNucleosMaquina];
            for (int j = 0; j < numNucleosMaquina; j++) {
                threads[j] = new TesteExecutado(numeroRaizesCalculadas, numNucleosMaquina, teste);
            }
            
            
            long tempoInicial = System.currentTimeMillis();
            
            for (int j = 0; j < numNucleosMaquina; j++) {
                threads[j].start();
            }
            for (int j = 0; j < numNucleosMaquina; j++) {
                try{
                    threads[j].join();
                } catch(InterruptedException e){
                }
            }
            
            long tempoFinal = System.currentTimeMillis();
            
            temposIndividuais[i] = tempoFinal - tempoInicial;
            tempoTotal += temposIndividuais[i];
        }       
        
        tempoMedio = tempoTotal / numeroAmostras;
        System.out.println("O TEMPO MEDIO E DE " + tempoMedio + " MILISEGUNDOS EM MULTI-CORE");
        
    }
    
    

    
}
