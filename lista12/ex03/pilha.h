/**
 * @file pilha.h
 * @authors Guilherme Mafra (N USP: 11272015), Luigi Quaglio (N USP: 11800563) and Maíra Canal (N USP: 11819403)
 */

#ifndef PILHA_H
#define PILHA_H

#include "pilhaCheia.h"
#include "pilhaVazia.h"

class pilha {
public:
    pilha(int tamanho);
    ~pilha();
    void push(int valor);
    int pop();
private:
    int tamanho;
    int topo;
    int *dados;
};
#endif 

