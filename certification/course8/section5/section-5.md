# Create and overload constructors

Não posso ter dois construtores com a mesma assinuatura.
Construtor pode receber varargs (aceita 0 ou mais argumentos).

Quando um construtor chama outro que gera loop infinito, o compilador percebe e dá erro!
Quando uso o new, ele não percebe e deixa compilar. Gerando o loop infinito.

Não posso chamar 2 this.
this: chama um outro construtor daquela mesma classe.



