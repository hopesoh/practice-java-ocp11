# Criando e manipulando Strings

### StringBuffer
  - Espaço para colocarmos uma `string` lá dentro. Por padrão, se eu chamar o construtor vazio, o interior dela será vazio.
  - Método `append`: adiciona caracteres, string lá dentro.
  - **É mutável**: o conteúdo interno pode mudar de valor
  - Pode ser criado vazio, com um valor que já existe, com uma String lá dentro ou um valor inicial:
  - `StringBuffer sb3 = new StringBuffer(50);` não significa que é uma `StringBuffer` com a string 50! É um buffer, um array, de tamanho 50. Se esse array estourar de tamanho, ele se vira, mas o tamanho inicial é 50.
  - Versão mais antiga do java.

### StringBuilder
  - A partir do java 5.
  - O compilador transforma o `+` da concatenação de `string` em um `append` de um `StringBuilder`.

## Métodos:
  - `append`: adiciona strings, caracteres, `StringBuffer`/`StringBuilder`.
  - `insert`: recebe o texto e a posição que vai inserir.
  - `delete`: deletar caracteres entre uma posição e outra
  - `reverse`: inverte todas as posições dos caracteres
  - `trim`: remove espaços em branco na esquerda e na direita
  - `charAt`: pega o caracter na posição x
  - `length`: devolve o número de caracteres dentro da string
  - `equals`: compara se um objeto é igual ao outro
  - `indexOf` e `lastIndexOf`: procura a partir de uma posição, ou do começo ou do final, a posição de uma outra string
  - `substring`: pega um pedaço de uma string. Não altera o `StringBuilder`/`StringBuffer`. Devolvem uma string nova com o resultado que queremos.
  
  

