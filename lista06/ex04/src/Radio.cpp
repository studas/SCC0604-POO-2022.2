#include "Radio.hpp"

Radio::Radio(float estacao, bool amfm) {
    this->_isLigado = 0;
    this->_estacao = estacao;
    this->_amfm = amfm;
}

auto Radio::setarEstacao(float estacao) -> void {
    this->_estacao = estacao;
}

auto Radio::mudarAmFm(bool amfm) -> void {
    this->_amfm = amfm;
}

auto Radio::ligarDesligar(bool isLigado) -> void {
    this->_isLigado = isLigado;
}