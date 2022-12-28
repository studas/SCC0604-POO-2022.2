#include <thread>
#include <iostream>

#include "ContaCorrente.h"

int main(int argc, char** argv) {

/*Letra (a): Tem problemas de concorrência, já que gera valores de saldo imprevisíveis

Letra (b): Ao utilizar a biblioteca mutex, o problema de concorrência é resolvido, independente da estratégia.

-Estratégia sem paralelismo: Essa abordagem não é boa, pois, enquanto uma thread opera, a outra espera, de forma a reduzir a eficiência.

-Estratégia de máximo paralelismo: Essa estratégia maximiza o paralelismo, já que minimiza o tempo que cada operação segura o mutex. No entanto, isso deixa a operação muito lenta, pois travar e destravar o mutex é uma operação custosa computacionalmente.

-Estratégia de melhor paralelismo: Essa estratégia não possui o maior paralelismo, no entanto, é a melhor estratégia, já que evita o overhead  causado pelo mutex, mas ainda permite um certo grau de paralelismo.

As diferentes estratégias estão no arquivo ContaCorrente.cpp.*/

    ContaCorrente *conta = new ContaCorrente(150);
    
    std::thread *tSaque = new std::thread(&ContaCorrente::depositos, conta, 50000, 150);
    std::thread *tDeposito = new std::thread(&ContaCorrente::saques, conta, 50000, 150);
    
    tSaque->join();
    tDeposito->join();
    
//O valor final correto deve ser 150, caso contrário, houve problemas de concorrência.
    
    std::cout << "Saldo final: " << conta->getSaldo();
    
    delete conta;
    delete tSaque;
    delete tDeposito;
    
    return 0;
}

