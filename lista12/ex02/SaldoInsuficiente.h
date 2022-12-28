#pragma once

#include <stdexcept>

class SaldoInsuficiente : public std::runtime_error {
public:
    SaldoInsuficiente() : std::runtime_error{"Saldo insuficiente! O valor em conta é menor do que o valor a ser sacado."} {};
    ~SaldoInsuficiente() = default;
};