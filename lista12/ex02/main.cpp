#include <thread>
#include <iostream>

#include "ContaCorrente.h"

int main(int argc, char** argv) {   
    
    ContaCorrente *conta = new ContaCorrente(150);
    
    std::cout << "Saldo inicial: " << conta->getSaldo() << std::endl;
    
    try {    
        // Saque válido
        conta->saca(40);
        
        std::cout << "Saldo após saque: " << conta->getSaldo() << std::endl;
        
        // Depósito válido
        conta->deposita(30);
        
        std::cout << "Saldo após depósito: " << conta->getSaldo() << std::endl;
        
        // Depósito inválido
        conta->deposita(-30);
        
    } catch (std::exception& e) {
        std::cout << e.what() << std::endl;
    }
    
    try {       
        // Saque inválido
        conta->saca(200);
        
    } catch (std::exception& e) {
        std::cout << e.what() << std::endl;
    }
    
    std::cout << "Saldo final: " << conta->getSaldo() << std::endl;
    
    delete conta;
    
    return 0;
}

