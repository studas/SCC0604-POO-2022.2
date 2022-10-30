#pragma once 

class Radio {
private:
    bool _isLigado;
    float _estacao;
    bool _amfm;

public:
    Radio(float estacao, bool amfm);
    auto setarEstacao(float estacao) -> void;
    auto mudarAmFm(bool amfm) -> void;
    auto ligarDesligar(bool isLigado) -> void;
};