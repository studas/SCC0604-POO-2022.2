/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

import java.util.Random;

/**
 *
 * @author arturbrennerweber
 */
public class TesteExecutado extends Thread{
    
    private int teste;
    private long quantNumerosCalculados;
    private int numNucleosMaquina;
    
    public TesteExecutado(long quantNumerosCalculados, int numNucleosMaquina, int teste) {
        this.quantNumerosCalculados = quantNumerosCalculados;
        this.numNucleosMaquina = numNucleosMaquina;
        this.teste = teste;
    } 
    
    
    @Override
    public void run() {
        Random geradorAleatorio = new java.util.Random();
        switch (teste) {
            case 0:
                for (long k = 0; k < (quantNumerosCalculados/numNucleosMaquina); k++) {
                    
                }   
                break;
            case 1:
                for (long k = 0; k < (quantNumerosCalculados/numNucleosMaquina); k++) {
                    double numero = geradorAleatorio.nextDouble();
                    double raiz = Math.sqrt(numero);
                }   
                break;
            case 2:
                for (long k = 0; k < (quantNumerosCalculados/numNucleosMaquina); k++) {
                    double numero = geradorAleatorio.nextDouble();
                    double raiz = Math.sqrt(numero);
                    double quadrado = Math.pow(numero, 2);
                    double cosseno = Math.cos(numero);
                }   
                break;
            default:
                break;
        }
        
    }
    
}
