/**
 * @file pilhaExcecao.cpp
 * @authors Guilherme Mafra (N USP: 11272015), Luigi Quaglio (N USP: 11800563) and Maíra Canal (N USP: 11819403)
 */

#include "pilhaExcecao.h"

pilhaExcecao::pilhaExcecao(string mensagem) {
    this->mensagem = mensagem;
}

pilhaExcecao::~pilhaExcecao() {}

string pilhaExcecao::getMensagem() {
    return mensagem;
}
