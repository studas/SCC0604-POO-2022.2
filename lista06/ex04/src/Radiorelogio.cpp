#include "Radiorelogio.hpp"

auto Radiorelogio::alarmeSintonizar(int hora, int minuto, int segundo , float estacao) -> void {
    Relogio::definirAlarme(hora, minuto, segundo);
    Radio::setarEstacao(estacao);
};