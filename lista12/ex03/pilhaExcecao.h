/**
 * @file pilhaExcecao.h
 * @authors Guilherme Mafra (N USP: 11272015), Luigi Quaglio (N USP: 11800563) and Maíra Canal (N USP: 11819403)
 */

#ifndef PILHAEXCECAO_H
#define PILHAEXCECAO_H

#include <string>

using namespace std;

class pilhaExcecao {
public:
    pilhaExcecao(string mensagem);
    virtual ~pilhaExcecao();
    string getMensagem();
private:
    string mensagem;
};

#endif 

