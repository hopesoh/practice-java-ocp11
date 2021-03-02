# Create and use while loops

- Cuidado com loop infinito!
- Analisa uma expressão booleana a cada final de execução do bloco de código.
- Pode executar zero ou mais vezes.
- Cuidado com a pegadinha das identações!
- Se o bloco de código do while possui uma única linha, posso tirar as chaves. Portanto, as chaves são opcionais.


_Unreacheable code_

**Se o while**
- é true ou é uma variável booleana verdadeira e final
- você tem linhas de código executáveis 
- não tem nenhuma condição de quebra lá dentro 
  
o compilador percebe que a condição de análise será sempre verdadeira e dá erro de **unreacheable statement**.

**Por outro lado, se o while**
- for false, ele percebe que tem código lá dentro que nunca poderá ser executado e dá erro também.
