#include "numeros_complexos.hpp"

auto NumComplexo::soma(NumComplexo num) -> NumComplexo {
  return NumComplexo( _sigma + num._sigma, _omega + num._omega );
}

auto NumComplexo::subtracao(NumComplexo num) -> NumComplexo {
  return NumComplexo( _sigma - num._sigma, _omega - num._omega );
}

auto NumComplexo::multiplicacao(NumComplexo num) -> NumComplexo {
  return NumComplexo( _sigma * num._sigma - _omega * num._omega, _omega * num._sigma + _sigma * num._omega );
}

auto NumComplexo::modulo() -> double {
  double expression = _sigma * _sigma + _omega * _omega;
  return sqrt(expression);
}

auto NumComplexo::para_texto() -> std::string {
  auto str_buffer = std::to_string(_sigma);
  str_buffer += ((_omega >= 0)? " + " : " - ");
  str_buffer += std::to_string(abs(_omega));
  str_buffer += "j";
  return str_buffer;
}

NumComplexo::NumComplexo(int module, double theta_deg) {
  _sigma = module * cos ( theta_deg * PI / 180.0 );
  _omega = module * sin ( theta_deg * PI / 180.0 );
}
