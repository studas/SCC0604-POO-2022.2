package ex02;

import java.util.ArrayList;

public class MinhaMatrizDinamica {
    private ArrayList<ArrayList<Integer>> matriz = new ArrayList<ArrayList<Integer>>();
    private int numLinhas;
    private int numColunas;
    
    private void inicializa(int valor) {
        for(int i = 0; i < numLinhas; i++) {
            ArrayList<Integer> nova_linha = new ArrayList<Integer>();
            for(int j = 0; j < numColunas; j++) {
                nova_linha.add(valor);
            }
            this.matriz.add(nova_linha);
        }
    }
    
    public void preenchePosicao(int linha, int coluna, int valor) {
        this.matriz.get(linha).set(coluna, valor);
    }
    
    public void preencheComSomaDeIndexes() {
        for(int i = 0; i < numLinhas; i++) {
            for(int j = 0; j < numColunas; j++) {
                this.preenchePosicao(i, j, i + j);
            }
        }
    }
    
    MinhaMatrizDinamica(int numLinhas, int numColunas) {
        this.numColunas = numColunas;
        this.numLinhas = numLinhas;
        
        this.inicializa(0);
    }
    
    @Override
    public String toString() {
        String matrix_plain_text = new String();
        
        for(ArrayList<Integer> linha: this.matriz) {
            for(Integer elemento: linha) {
                matrix_plain_text += elemento.toString() + " ";
            }
            matrix_plain_text += "\n";
        }
        return matrix_plain_text;
    }
}
