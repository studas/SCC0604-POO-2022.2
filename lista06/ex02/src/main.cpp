#include <iostream>
#include "numeros_complexos.hpp"

int main(int argc, char *argv[]) {

  // Cria numeros complexos
  NumComplexo a = NumComplexo(1, 2);
  NumComplexo b = NumComplexo(0, 8);
  NumComplexo c = NumComplexo(42, 0);

  // Exemplos da biblioteca funcionando
  NumComplexo result = b.soma(a);
  std::cout << "(" << a.para_texto() << ") + (" << b.para_texto() << ") = " << result.para_texto() << std::endl;

  result = a.soma(c);
  std::cout << "(" << a.para_texto() << ") + (" << c.para_texto() << ") = " << result.para_texto() << std::endl;

  result = a.subtracao(b);
  std::cout << "(" << a.para_texto() << ") - (" << b.para_texto() << ") = " << result.para_texto() << std::endl;

  result = a.subtracao(c);
  std::cout << "(" << a.para_texto() << ") - (" << c.para_texto() << ") = " << result.para_texto() << std::endl;

  result = a.multiplicacao(b);
  std::cout << "(" << a.para_texto() << ") * (" << b.para_texto() << ") = " << result.para_texto() << std::endl;

  result = b.multiplicacao(c);
  std::cout << "(" << b.para_texto() << ") * (" << c.para_texto() << ") = " << result.para_texto() << std::endl;

  return 0;
}
