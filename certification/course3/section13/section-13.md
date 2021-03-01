# Use switch statements

### SWITCH
- Se parece muito com um if com diversas cláusulas.
- Você passa uma variável, ele analisa o valor dessa variável, passa por cada case (em sequencia) achando algum que dê match com o valor avaliado.
    - Após entrar no case correspondente, ele não sai sozinho da declaração switch. Ele continua executando os próximos cases até encontrar alguma declaração de pausa/retorno.

_break:_ para a execução dos cases.

**Alguns pontos de atenção:**
- Não existe continue no switch.
- Os cases tem que ter o mesmo tipo.
- Não posso usar variáveis no case, a não ser que sejam finais.
- Não pode usar null no case.
- Posso ter casos padrão (default).
- Default pode estar em qualquer lugar dos cases.
- Posso fazer case vazio.


**Tipos de parâmetros para o switch:**
- String 
- Tipos inteiros
- Enum