#include <mutex>

#pragma once

class ContaCorrente{
public:
    ContaCorrente() = default;
    ContaCorrente(int saldo) : saldo{saldo} {};
    void deposita(int valor);
    void saca(int valor);
    void depositos(int contador, int valor);
    void saques(int contador, int valor);
    int getSaldo();
    virtual ~ContaCorrente() = default;
    
    private:
    std::mutex mutex {};
    int saldo = 0;
};

