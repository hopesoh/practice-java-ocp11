# Use ArrayList

### Iterator:
- iterator() é um método presente num ArrayList que retorna um objeto do tipo Iterator
- assim como o ArrayList, Iterator não vem no pacote padrão do java. Precisa importar

`java.util.Iterator`

- Maneira de iterar sobre os objetos de dentro de um array
- Métodos importantes
  - hasNext(): que retorna um booleano dizendo se existe ou não um próximo elemento na iteração
  - next(): que o elemento atual da iteração.
  - remove(): que remove o elemento atual de dentro da coleção

_O contains do ArrayList usa o equals dos objetos para comparar se um objeto está ou não na lista. Portanto, é preciso garantir que o equals foi implementado corretamente para garantir o funcionamento correto e esperado do contains._

