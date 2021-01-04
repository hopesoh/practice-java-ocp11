#Invocação de métodos nos objetos

É preciso tomarmos alguns cuidados com `varargs`; se podemos receber qualquer quantidade como um array, também **poderemos passar zero argumentos** com `c.soma()` vazio, e não necessariamente um pelo menos.

Outro ponto importante é que o **varargs não permite a mistura de tipos**, então não podemos falar diretamente que queremos `ints` e `strings` na mesma soma por exemplo; para isso, teríamos que usar a referência genérica `Object` como argumento dentro de soma(), o que tornaria o trabalho mais complexo com cast e outras técnicas. Logo, deixaremos apenas com `int...` mesmo.

O **`varargs` deve ser o último argumento do método**, caso contrário o programa não compilará.

Portanto, **as duas regras importantes do `varargs`** são:
- Deve ser o último argumento;
- Todos serão definidos como o mesmo tipo.

`varargs` é um array (no nosso exemplo, recebe tanto um varargs como um array de int), **mas um array não é um varargs**!!

`varargs` na verdade é uma abreviação de uma passagem de um parâmetro array. Por exemplo:

`System.out.printf ("%d %s", 10, "Hello");`

é uma abreviação de

`System.out.printf ("%d %s", new Object[]{ 10, "Hello"});`

- Digamos que apareça apenas um argumento. Se ele for "assignment compatible" com o tipo T[], onde T = String e "String… strings", então ele é passado diretamente, em vez de ser encapsulado em um new T[]{} . Portanto, poderia usar:
`public void metodo(new String[] {"a", "b", "c"}) ou metodo("a", "b", "c")`. Ambas as formas são equivalentes.
