# Operadores aritméticos

O Java define operadores aritméticos para as principais operações aritméticas.
**Cinco tradicionais:** soma, subtração, multiplicação, divisão e resto de divisão.

- O que ela vai cobrar não são exatamente os resultados dos cálculos, mas sim o tipo retornado dos cálculos.

**Regra geral:** devolve, no mínimo, um int e o maior dos dois tipos envolvidos.

- Se divido um numero inteiro por 0, dá `java.lang.ArithmeticException: / by zero` em erro de **execução**.
- Se divido um numero inteiro por 0.0, existe e dá +- infinito.
- Se divido um numero de ponto flutuante por 0,  existe e dá +- infinito.
- Se faço operações com infinitos, existe dá `NaN`.