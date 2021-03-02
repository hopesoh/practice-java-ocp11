# Create and use for loops

### FOR
- Tem três argumentos separados por ;. 
  - O primeiro é a inicialização,
  - O segundo, a condição,
  - O terceiro, a atualização.
- Faz algo enquanto essa variável não atinge determinado valor.
- Primeiro inicializa e depois analisa a condição. Se for falsa, nem executa o bloco de código.
- Cuidado com o loop infinito.
- Os três parâmetros são opcionais.
- Se não coloco nada no segundo parâmetro, ele é sempre true.
- As chaves também são opcionais caso exista apenas uma única expressão dentro do bloco de código

_enhenced loop:_

Quando vamos percorrer uma coleção de objetos ou um array, podemos usar uma versão simplificada do for para percorrer essa coleção de maneira simplificada. Essa forma simplificada é chamada de **::enhanced for::**, ou **::foreach::** 

`for(VARIAVEL : COLEÇÃO){
CODIGO
}`

Nesse caso, declaramos uma variável que irá receber cada um dos membros da coleção ou array que estamos percorrendo. O próprio for irá a cada iteração do laço atribuir o próximo elemento da lista à variável.
- Não podemos, por exemplo, modificar o conteúdo da coleção que estamos percorrendo usando a variável que declaramos
- não há uma maneira natural de saber em qual iteração estamos, já que não existe nenhum contador.
- não é possível percorrer duas coleções ao mesmo tempo
- Apenas é possível iterar em quem implementa da interface Iterator.


