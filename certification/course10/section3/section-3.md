# Create a try-catch block and determine how exceptions alter normal program flow

- Um try puro não compila. Pode ter um try-catch
- Posso colocar a palavra RuntimeException e suas filhas no meu catch, a palavra Throwable e a palavra Error e suas filhas.
- checked exception (filha de exception que não é filha de Runtime): não pode colocar. Só posso colocar se dentro do try tenho a possibilidade desse erro acontecer.
- fluxo de execução: para o bloco try, procura o bloco catch, se o bloco catch é do time do erro ou o polimorfismo bate, chama o catch e o fluxo continua. Se não bate, sai do fluxo pulando os catchs e acabou.

