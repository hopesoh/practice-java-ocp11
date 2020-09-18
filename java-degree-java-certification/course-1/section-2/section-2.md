# Definindo a estrutura de um arquivo e classe Java

### **Ordem:**
- **package**
  - um ou nenhum
  - sempre a primeira informação
  - quando não especificamos, ele está no pacote padrão. Se eu falo o pacote, preciso colocar o **arquivo.class** nesse pacote.
- **imports**
  - nenhum, um ou mais
  - sempre depois do package (caso exista)
- **classes/interfaces/enums** e quaisquer outras coisas 
  - posso ter zero ou mais
  - dentro de um **arquivo.java**, só posso ter uma interface ou classe de tipo público. E se for, tem que ter o mesmo nome do arquivo.
  - ou seja, posso ter várias classes e interfaces mas, se eu tiver alguma pública (e só pode ser uma), o nome dessa classe/interface
deve bater com o nome do arquivo.


### **e os comentários?**
 - em qualquer lugar, inclusive antes do package.
 - dois tipos de comentários
   - **//**, tudo depois das duas barras é comentário
   - **/***, comentário para multiplas linhas, onde tudo depois do _barra+asterisco_ e antes do _asterisco+barra_ é comentário
 - uma variação especial do asterisco + barra é o **javadoc** (começa com /**), que serve para **documentar** a minha classe, pacotes e etc.

### _todos acima são opcionais!!!_

### O que posso ter dentro de uma classe?
 - variáveis de instância/atributo:
   - que precisam de um objeto para ter algum valor
   - definida dentro de um método ou construtor
 - variáveis de classe/estática
   - que não precisam de um objeto para ter algum valor
 - construtores com variáveis que são parâmetros
 - métodos com variáveis locais
 - não há conflito com o nome da variável de instância, nome do método e nome da classe;
 - métodos de instância ou métodos estáticos
   - não precisa criar um objeto para chamar.
 - construtores
   - tem mesmo nome da classe mas não tem retorno
   - são permitidos return sem nada.

### O que posso ter dentro de uma interface?
 - variáveis e métodos
 - variáveis constantes 
   - final, onde não pode ter seu valor ou referẽncia alterado
 - definição de métodos abstratos públicos
 - ambas variáveis são públicas.
 - variável, por padrão, é estático. Método, por padrão, é abstrato.
 
 
### Resumindo:
|                    Combinação               |Permissão|
|----------------------------------------------|:------:|
| um arquivo java, vários tipos                |   OK   |
| um arquivo java, um único público            |   OK   |
| um arquivo java, vários públicos             | ERRADO |
| um arquivo java, público com nome do arquivo |   OK   |
| um arquivo java, público com nome diferente  | ERRADO |