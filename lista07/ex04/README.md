# Lista 07 - Exercício 04

## Introdução

O enunciado proposto pede que seja feito um *benchmark* entre as duas coleções `ArrayList` e `LinkedList`, da **linguagem de programação Java**. Levando em consideração nesse *benchmark* dois tempos, sendo eles:
1. Tempo de inserção de 10^8^ números(doubles) aleatórios + tempo de acesso aleatório de 10^7^ desses elementos inseridos
2. Tempo de remoção de 10^7^ dos 10^8^ elementos inseridos + tempo de inserção de novos 10^7^ números(doubles) aleatórios
    
### Observações

Devido a gargalos devido ao desempenho da máquina utilizada para o *benchmark* ao invés de utilizar 10^8^ e 10^7^, utilizou-se 4.10^6^ e 4.10^5^ elementos respectivamente. Ademais, também utilizou-se uma thread para cada coleção, de modo a possibilitar a computação dos resultados em tempo útil.

## Resultados

| Tarefa             | Coleção    | Tempo de execução |
| :----------------  | :--------: | :---------------: |
| Inserção + Acesso  | ArrayList  | 0min 4s           |
| Remoção + Inserção | ArrayList  | 10min 42s         |
| Inserção + Acesso  | LinkedList | 14min 51s         |
| Remoção + Inserção | LinkedList | 11min 32s         |

1. Tabela com resultados do benchmark, utilizando um i3-7100U

### ArrayList

A coleção `ArrayList` é uma classe que representa um *vetor* de tamanho variável, e assim como um *vetor* padrão da linguagem java (`array`), ela possui custo **O(1)** para acesso de qualquer elemento escolhido aleatóriamente em uma posição *i* qualquer.

### LinkedList

Já a coleção `LinkedList` é uma classe que representa uma *lista encadeada*, e assim como qualquer lista encadeada, para encontrar um dado elemento na posição *i* nessa estrutura, faz-se necessário passar pelos *i - 1* elementos anteriores.

## Discussão de resultados

A `LinkedList` apresentou um desempenho inferior à `ArrayList` em todas as tarefas. Isso deveu-se principalmente pelo custo **O(1)** que a `ArrayList` possui para acesso de qualquer um de seus elementos em uma dada posição conhecida *i*. Essa característica confere à essa coleção uma vantagem estratégica muito grande na identificação dos elementos a serem removidos e no acesso por si só. Assim, apesar da inserção em posições específicas da `LinkedList`, como na *HEAD* ser também de custo constante, no geral ela é **O(i)**, sendo *i* a posição do dado elemento. Logo, apesar de remoção em uma `ArrayList` ser uma operação relativamente custosa, pela necessidade de *shiftar* os elementos à frente do elemento removido (o que não ocorre na `LinkedList`), o custo de "encontrar" o elemento a ser removido acabou sendo o fator decisivo para a diferença de **50 segundos** na tarefa de **Remoção + Inserção**.

## Conclusão

A `ArrayList` apresentou um desempenho superior à `LinkedList` em todas as duas tarefas testadas, sendo essa diferença principalmente devido ao custo constante de acesso de elementos da `ArrayList`.
