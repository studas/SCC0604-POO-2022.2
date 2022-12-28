#include "ContaCorrente.h"

void ContaCorrente::deposita(int valor) {   
    int temp = saldo;
    temp = saldo + valor;
    saldo = temp;
}

//Saca dinheiro na conta bancária
void ContaCorrente::saca(int valor) {
    int temp = saldo;
    temp = saldo - valor;
    saldo = temp;
}

//Realiza múltiplos depósitos de dinheiro na conta bancária
void ContaCorrente::depositos(int contador, int valor) {
    //Letra (a) - Problemas de concorrência
    
    /*for (; contador > 0; contador--)
        deposita(valor);*/
    
    //Letra (b) - Resolve problemas de concorrência com mutex
    
    //Sem paralelismo

    /*mutex.lock();
    for (; contador > 0; contador--)
        deposita(valor);
    mutex.unlock();*/
    
    //Máximo paralelismo (com overhead do mutex) **/ 
    
    /*for (; contador > 0; contador--) {
        mutex.lock();
        deposita(valor);
        mutex.unlock();
    }*/
    
   //Melhor paralelismo
    mutex.lock();
    for(; contador > contador/2; contador--)
        deposita(valor);
    mutex.unlock();
    
    mutex.lock();
    for(; contador > 0; contador--)
        deposita(valor);
    mutex.unlock();

}

//Realiza múltiplos saques de dinheiro na conta bancária
void ContaCorrente::saques(int contador, int valor) {
    
    // Letra (a) - Problemas de concorrência (gera valores de saldo imprevisíveis)
    
    /*for (; contador > 0; contador--)
        saca(valor); */

    //Letra (b) - Resolve problemas de concorrência com mutex]

    //Estratégia sem paralelismo
    
    /*mutex.lock();
    for (; contador > 0; contador--)
        saca(valor);
    mutex.unlock();*/

    //Estratégia de máximo paralelismo(com overhead do mutex)
    
    /*for (; contador > 0; contador--) {
        mutex.lock();
        saca(valor);
        mutex.unlock();
    }*/
    
    //Estratégia de melhor paralelismo
    mutex.lock();
    for(; contador > contador/2; contador--)
        saca(valor);
    mutex.unlock();
    
    mutex.lock();
    for(; contador > 0; contador--)
        saca(valor);
    mutex.unlock();
}

// Getter do saldo
int ContaCorrente::getSaldo(){
    return saldo;
}
