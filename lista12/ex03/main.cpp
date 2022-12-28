/**
 * @file main.cpp
 * @authors Guilherme Mafra (N USP: 11272015), Luigi Quaglio (N USP: 11800563) and Maíra Canal (N USP: 11819403)
 */

#include "pilha.h"
#include <cstdlib>
#include <iostream>

using namespace std;

/**
 * Mostra como criar a pilha e invocar os métodos push() 
 * e pop() com os respectivos tratamentos de exceções.
 */
int main(int argc, char** argv) {
    
    int tamPilha = 30;
    pilha *p = new pilha{tamPilha};
    
    try {
        
        for(int i=0; i < tamPilha; i++)
            p->push(i+1);
        p->push(tamPilha + 1);       // Causa a excecao pilhaCheia
        
    } catch(pilhaExcecao e) {
        
        cout << "Erro: " << e.getMensagem() << endl;
        
    }
    
    try {
        
        for(int i=0; i < tamPilha; i++)
            cout << p->pop() << " ";
        cout << endl;
        cout << p->pop() << endl;    // Causa a excecao pilhaVazia
        
    } catch(pilhaExcecao e) {
        
        cout << "Erro: " << e.getMensagem() << endl;
        
    }
    
    delete p;
    
    return 0;
    
}

