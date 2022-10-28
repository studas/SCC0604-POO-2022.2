#ifndef NUMEROS_COMPLEXOS_H_
#define NUMEROS_COMPLEXOS_H_

#define PI 3.14159265

#include <iostream>
#include <string>
#include <cmath>

class NumComplexo {
protected:
  int _sigma;
  int _omega;

public:
  auto soma(NumComplexo const num) const -> NumComplexo;
  auto operator+(NumComplexo const other) const -> NumComplexo;
  auto subtracao(NumComplexo const num) const -> NumComplexo;
  auto operator-(NumComplexo const other) const -> NumComplexo;
  auto multiplicacao(NumComplexo const num) const -> NumComplexo;
  auto operator*(NumComplexo const other) const -> NumComplexo;

  auto modulo() const -> double;
  auto operator~() const -> double;
  auto para_texto() const -> std::string;

  NumComplexo(int sigma, int omega) : _sigma { sigma }, _omega { omega } {};
  NumComplexo(int module, double theta_deg);
};

std::ostream &operator<<(std::ostream& os, const NumComplexo& num);
#endif // NUMEROS_COMPLEXOS_H_
