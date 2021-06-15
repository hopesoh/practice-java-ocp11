# User super and this to access objects and constructors

- Uma classe filha tem que ser capaz de acessar um construtor de uma classe pai.
- Se não colocamos nenhum construtor, por default, é criado um construtor vazio que não recebe parametros.
  - Se eu adiciono qualquer construtor, o compilador não adiciona mais o construtor vazio. Assim, se existir alguma classe filha que utiliza desse construtor, é preciso criá-lo na mão para evitar erro de compilação. 
- Se os construtores da classe mãe não são acessíveis pela classe filha, também não funciona.
- Só posso chamar apenas 1 super e/ou 1 this. Tem de ser a primeira linha do corpo do construtor.
- Cuidado com loop infinito! 
  - O construtor percebe, a menos que seja dado um new em um novo objeto.
- Contextos estáticos não possuem nem this nem super
  - uma vez que o código não é executado dentro de um objeto.
- Uma última restrição: interfaces não podem ter métodos estáticos, não compila.