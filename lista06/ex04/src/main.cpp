#include "Relogio.hpp"
#include "Radio.hpp"

auto main() -> int {
    auto meuRelogio = Relogio(23, 59, 57);
    meuRelogio.exibirHoras();
    meuRelogio.definirAlarme(23, 59, 57);
    auto meuRadio = Radio(0, 0, 0);
}