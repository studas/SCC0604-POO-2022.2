
#include <iostream>

#include <vector>
#include <iterator>

#include <time.h> 

#include "numeros_complexos.hpp"

int main(int argc, char** argv) {
    
    srand (time(NULL));
    
    int n; 
    std::cin >> n;
    
    std::vector<NumComplexo> meuVetor;

    for(int i = 0; i < n;i++){
        meuVetor.push_back(NumComplexo(rand()%100,rand()%100));
    }
    
    NumComplexo *somaComplexo = new NumComplexo(0,0);
    
    std::vector<NumComplexo>::iterator ptr;//Iterator
    
    for(ptr =  meuVetor.begin();ptr < meuVetor.end();ptr++){//Iterator
        *somaComplexo = *somaComplexo + *ptr;
    }
    
    //Outro jeito de fazer um iterator
    /*for(auto& elemento : meuVetor){
        *somaComplexo = *somaComplexo + elemento;
    }*/
    
    std::cout << *somaComplexo << std::endl;
    delete(somaComplexo);//Livra a memória deletando todos os objetos utilizados no programa.
    
    return 0;
}

