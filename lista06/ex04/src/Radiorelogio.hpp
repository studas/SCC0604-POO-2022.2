#pragma once 
#include "Radio.hpp"
#include "Relogio.hpp"

class Radiorelogio : public Radio, public Relogio {
public:
    Radiorelogio(float estacao, bool amfm, int hora, int minuto, int segundo) : Radio(estacao, amfm), Relogio(hora, minuto, segundo) {}
    auto alarmeSintonizar(int hora, int minuto, int segundo , float estacao) -> void; 
};