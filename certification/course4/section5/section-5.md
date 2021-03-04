# Use break and continue

O **break** quebra o laço mais proximo que estou.
O **continue** volta para o laço com a próxima iteração.

- Quando tenho um laço dentro do outro e quero sair de um em específico com o break/continue, posso criar um label para cada laço e dar o comando por eles.
    - Serve para todo laço!!
    - Se eu colocar um label que não existe, dá erro de compilação.
    - Posso repetir nome de label por escopos!
    - O label pode ter o mesmo nome de uma variável.
    - Compila um label em qualquer lugar do código que eu tenha um statement, mas não é possível dar break/continue em qualquer um, apenas em loops.
    - Posso dar dois labels pro mesmo statement.

_Switch só é possível dar break. Não é possível continuar um switch._

