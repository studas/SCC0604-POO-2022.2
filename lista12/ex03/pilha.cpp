/**
 * @file pilha.cpp
 * @authors Guilherme Mafra (N USP: 11272015), Luigi Quaglio (N USP: 11800563) and Maíra Canal (N USP: 11819403)
 */

#include "pilha.h"

pilha::pilha(int tamanho) {
    this->tamanho = tamanho;
    topo = -1;
    dados = new int[tamanho];
}

pilha::~pilha() {
    delete[] dados;
}

/**
 * Adiciona o valor ao topo da pilha.
 * @param valor Valor a ser empilhado
 */
void pilha::push(int valor) {
    
    if (topo + 1 == tamanho)
        throw pilhaCheia(); // lanca excecao de pilha cheia
                            
    dados[++topo] = valor;
    
}

/**
 * Libera o valor do topo da pilha.
 * @return Retorna o item desempilhado.
 */
int pilha::pop() {
    
    if (topo == -1)
        throw pilhaVazia(); // lanca excecao de pilha vazia
                            
    return dados[topo--];
    
}