# Criação e manipulação de strings

### Formas de criar strings
- Cria a string direto
- Através do new
- Por array de chars
- Por StringBuilder ou StringBuffer


- A string é referência para um objeto então pode assumir valor nulo. Chamar método nele gera NPE.
- Posso concatenar strings. Se concateno string com nulo, compila e vira um null em string.
- Precedencia de operadores é importante -> se tem soma de dois números + concatenação, ele efetua a soma e depois concatena



- **string é imutavel**
- **StringBuffer/StringBuilder é mutável**


### Métodos importantes
- _charAt(x)_ - char na posição x
- _toUpperCase()_ - transforma tudo em maiúsculo
- _toLowerCase()_ - transforma tudo em minúsculo
- _length()_ - devolve o tamanho **(length, sem os parenteses, é um atributo da string!!!!)**
- _isEmpty()_ - nos diz se length() é maior do que zero ou não, ou seja, se a String está vazia ou não. A resposta pode ser verdadeira ou falsa;
- _trim()_ - tira espaços em branco da esquerda e direita
- _substring(x)/substring(x,y)_ - devolve substrings
- _concat(x)_ - concatena strings
- _replace(x,y)_ - troca os char/strings x pelos y
- _equals(x)_ - vê se é do tipo string e todo caracter é igual
- _equalsIgnoreCase(x)_ - mesma coisa do equals, mas ignora se as letras tão maiúsculas ou minúsculas
- _compareTo()/compareToIgnoreCase()_ - comparam se uma String aparece antes ou depois do que outra lexicograficamente, sendo que a segunda também ignora se os caracteres são maiúsculos ou minúsculos, pois vale lembrar que, na ordem lexicográfica, as maiúsculas vêm antes das minúsculas. Como retorno, devolvem um valor positivo se a String passada vier depois da que está sendo comparada, devolve 0 se forem iguais e um número negativo se vier antes.
- _indexOf(x, y)/indexOf(x)_ - devolve a primeira posição da string. se não existe, devolve -1. Podendo ser a partir da posição y
- _lastIndexOf(x, y)/lastIndexOf(x)_ - mesma coisa do indexOf, mas de trás pra frente.
- _startsWith(x)/endsWith(x)_ - Se o texto começa (ou termina) com a string x.


- Poderemos fazer métodos em _chaining_, ou seja, executaremos vários em sequência por meio do operador **.**




