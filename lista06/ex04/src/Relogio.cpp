#include "Relogio.hpp"
#include <iostream>

auto Relogio::exibirHoras() -> void {
    std::cout << "Horario: " << this->_horas << ":" << this->_minutos << ":" << this->_segundos << "\n";
}

auto Relogio::definirHoras(int horaDef, int minutoDef, int segundoDef) -> void {
    this->_horas = horaDef;
    this->_minutos = minutoDef;
    this->_segundos = segundoDef;
} 

auto Relogio::definirAlarme(int horaAlarme, int minutoAlarme, int segundoAlarme) -> void {
    if (this->_horas == horaAlarme && this->_minutos == minutoAlarme && this->_segundos == segundoAlarme) {
        std::cout << "ACORDA!!!\n";
    } else {
        return;
    }
}
