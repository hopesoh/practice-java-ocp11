# Determine when casting is necessary

**Regra geral**
- Se você está subindo na hierarquia de classes, a autopromoção vai fazer tudo sozinho; e se você estiver descendo, vai precisar de casting.
- Se não houver um caminho possível, não compila nem com casting.

**Na prova**, faça sempre os diagramas de hierarquia de tipos que fica extremamente fácil resolver esses castings.

_Mas e quando fazemos casting com interfaces envolvidas?_ Apesar de não existir herança múltipla, podemos implementar múltiplas interfaces! Fazer casting para interfaces sempre é possível e vai compilar (há apenas uma exceção a essa regra).

**Dica**

- Muitos exercícios são sobre casting de referência. 
- Seguir o que é possível, impossível e óbvio.
- Se é óbvio que o casting funciona, isso é, se a conversão é sempre verdade, a autopromoção faz sozinha.
- Se o casting é possível, mas nem sempre é verdade, o casting compila, mas pode lançar erro em tempo de execução.
- Se o casting é impossível, isto é, ele nunca pode dar certo, o código não vai compilar nem com casting.
- Em alguns livros, você encontra tabelas complicadas e grandes que o "ajudam" a decidir se o casting compila e roda, mas é muito mais fácil seguir pela lógica.
instanceof

O operador **instanceof** (a instanceof Classe) devolve true caso a referência a aponte para um objeto compatível (assignable, atribuível) ao tipo Classe.

**Detalhe**

**instanceof** é um operador que deve ser usado com extremo cuidado no dia a dia. Em muitos casos, ele indica a fraca modelagem de um sistema, com blocos que parecem "switchs" e poderiam ser trocados por polimorfismo.