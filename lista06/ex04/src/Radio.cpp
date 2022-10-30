#include "Radio.hpp"

Radio::Radio(bool isLigado, float estacao, bool amfm) -> void{
    this->_isLigado = isLigado;
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