#include "numeros_complexos.hpp"

auto NumComplexo::soma(NumComplexo const num) const -> NumComplexo {
  return NumComplexo( _sigma + num._sigma, _omega + num._omega );
}

auto NumComplexo::operator+(NumComplexo const other) const -> NumComplexo {
  return this->soma(other);
}

auto NumComplexo::subtracao(NumComplexo const num) const -> NumComplexo {
  return NumComplexo( _sigma - num._sigma, _omega - num._omega );
}

auto NumComplexo::operator-(NumComplexo const other) const -> NumComplexo {
  return this->subtracao(other);
}

auto NumComplexo::multiplicacao(NumComplexo const num) const -> NumComplexo {
  return NumComplexo( _sigma * num._sigma - _omega * num._omega, _omega * num._sigma + _sigma * num._omega );
}

auto NumComplexo::operator*(NumComplexo const other) const -> NumComplexo {
  return this->multiplicacao(other);
}

auto NumComplexo::modulo() const -> double {
  double expression = _sigma * _sigma + _omega * _omega;
  return sqrt(expression);
}

auto NumComplexo::operator~() const -> double {
  return this->modulo();
}

auto NumComplexo::para_texto() const -> std::string {
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

std::ostream &operator<<(std::ostream& os, const NumComplexo& num) {
  return os << num.para_texto();
}
