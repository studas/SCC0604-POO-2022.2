#include "ContaCorrente.h"

void ContaCorrente::deposita(int valor){
    if (valor <= 0)
        throw DepositoInvalido();
    int temp = saldo;
    temp = saldo + valor;   
    saldo = temp;   
}

void ContaCorrente::saca(int valor) {
    if (valor > saldo)
        throw SaldoInsuficiente();
    int temp = saldo;
    temp = saldo - valor;
    saldo = temp;    
}

int ContaCorrente::getSaldo(){
    return saldo;
}
