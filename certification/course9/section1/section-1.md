# Implement inheritance

**Herança:** especialização de uma classe
palavra-chave `extends`

- Toda classe herda de Object!
- Não é possível herdar de duas classes. Heranças indiretas.
- Uma classe final não pode ser herdada.
- Os métodos e classes herdados tem que ser acessíveis para a classe filha
- Não existe herança de método estático. Método estatico não é herdado.
- Não compila métodos abstract static
- Não existe herança de construtores. O que existe é a classe filha chamar o construtor da mãe.

**Vantagens:**
- acesso a métodos e atributos da classe extendida

Como todas classes extendem de Object, então herdam todos os métodos acessíveis de Object.

