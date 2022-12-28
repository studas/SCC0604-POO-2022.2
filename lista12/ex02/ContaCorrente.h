#include <mutex>

#include "DepositoInvalido.h"
#include "SaldoInsuficiente.h"

#pragma once

class ContaCorrente {
public:
    ContaCorrente() = default;
    ContaCorrente(int saldo) : saldo{saldo} {};
    void deposita(int valor);
    void saca(int valor);
    int getSaldo();
    virtual ~ContaCorrente() = default;
private:
    int saldo = 0;
};

