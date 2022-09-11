#include <cmath>
#include <iostream>
#include <ostream>
#include <vector>

// Declaração da Classe Termo
class Termo {
public:
    int coeficiente;
    int grau;

    Termo(int grau, int coeficiente)
        : coeficiente { coeficiente }
        , grau { grau } {};

    Termo(const Termo& termo) = default;

    auto operator+=(const Termo& termo) -> Termo&;

    auto Resultado(int x) const -> int;
};

// Definição da Classe Termo

auto Termo::Resultado(int x) const -> int
{
    return this->coeficiente * std::pow(x, this->grau);
}

auto Termo::operator+=(const Termo& termo) -> Termo&
{
    this->coeficiente = this->coeficiente + termo.coeficiente;
    return *this;
}

auto operator<<(std::ostream& os, const Termo& termo) -> std::ostream&
{
    return os << termo.coeficiente << "*x^" << termo.grau;
}

// Declaracao da Classe Polinomio
class Polinomio;
auto operator<<(std::ostream& os, const Polinomio& polinomio) -> std::ostream&;

class Polinomio {
public:
    std::vector<Termo> termos;
    int grau_maximo;

    explicit Polinomio(int grau_maximo);

    void Add(const Termo& novo_termo);

    auto Calcula(int x) -> int;

    void Mostra();
};

// Definicao da Classe Polinomio
Polinomio::Polinomio(int grau_maximo)
    : grau_maximo { grau_maximo }
{
    termos.reserve(grau_maximo + 1);
    for (int i = 0; i <= grau_maximo; i++) {
        this->termos.emplace(this->termos.begin() + i, Termo(i, 0));
    }
}

void Polinomio::Add(const Termo& novo_termo)
{
    if (novo_termo.grau > grau_maximo) {
        std::cerr << "Erro!! Grau do termo maior do que o grau maximo do polinomio em questao" << std::endl;
        return;
    }

    this->termos[novo_termo.grau] += novo_termo;
}

auto Polinomio::Calcula(int x) -> int
{
    int resultado = 0;
    for (const auto& termo : this->termos) {
        resultado += termo.Resultado(x);
    }
    return resultado;
}

void Polinomio::Mostra()
{
    std::cout << *this << std::endl;
}

auto operator<<(std::ostream& os, const Polinomio& polinomio) -> std::ostream&
{
    int elements = 0;
    for (const auto& termo : polinomio.termos) {
        if (termo.coeficiente != 0) {
            if (elements != 0) {
                os << " + ";
            }
            os << termo;
            elements++;
        }
    }
    return os;
}
