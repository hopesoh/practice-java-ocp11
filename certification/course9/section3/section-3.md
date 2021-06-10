# Differentiate between the type of a reference and the type of an object

- Eu só posso acessar as variáveis membro ou invocar métodos que estejam definidas no meu tipo de referência e não no meu tipo referenciado em tempo de execução.

**Polimorfismo:** capacidade de chamar o mesmo objeto de diversas formas.
Quanto mais específico o escopo, menos coisas que posso acessar.

- Quando uso herança com métodos default ou private tenho que tomar o cuidado pra saber se estou ou não sobrescrevendo esse método. 
  - Só sobrescrevo se tenho visibilidade e acesso a ele na classe pai. Senão, estou criando um método novo nada a ver com a classe pai.
