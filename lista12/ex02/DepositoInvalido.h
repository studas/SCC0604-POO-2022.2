#pragma once

#include <stdexcept>

class DepositoInvalido : public std::runtime_error {
public:
    DepositoInvalido() : std::runtime_error{"Depósito inválido! Valor depositado deve ser maior que zero."} {};
    ~DepositoInvalido() = default;
};