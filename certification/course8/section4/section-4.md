# Differentiate between default and user defined constructors

- Quando eu defino uma classe que não tem construtor definido pelo usuário final, por padrão, existe um construtor default.

Equivalente a 

`A() {super();}`

- Se minha classe é pública, meu construtor padrão também é publico. 
  - Se a classe é default, o construtor também é default e assim por diante.


- A partir do momento que adiciono um construtor meu, **ele deixa de adicionar o construtor padrão**.


- Todas as variáveis que são inicializadas na minha classe, são inicializadas antes da chamada do construtor, em ordem de declaração.
    - O mesmo cuidado deve ser tomado dentro do construtor.


- private não é sobrescrito!!
  
- Um construtor pode entrar em loop infinito.
  
- O nome do construtor é exatamente o nome da classe.


