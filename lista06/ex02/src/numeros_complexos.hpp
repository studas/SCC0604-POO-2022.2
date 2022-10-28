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
  auto soma(NumComplexo num) -> NumComplexo;
  auto subtracao(NumComplexo num) -> NumComplexo;
  auto multiplicacao(NumComplexo num) -> NumComplexo;
  auto modulo() -> double;
  auto para_texto()-> std::string;

  NumComplexo(int sigma, int omega) : _sigma { sigma }, _omega { omega } {};
  NumComplexo(int module, double theta_deg);
};

#endif // NUMEROS_COMPLEXOS_H_
