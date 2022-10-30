#pragma once 

class Relogio {
private:
    int _horas;
    int _minutos;
    int _segundos;

public:
    Relogio(int hora, int minuto, int segundo): _horas{ hora }, _minutos{ minuto }, _segundos{ segundo } {};
    auto exibirHoras() -> void;
    auto definirHoras(int horaDef, int minutoDef, int segundoDef) -> void;
    auto definirAlarme(int horaAlarme, int minutoAlarme, int segundoAlarme) -> void;
};
