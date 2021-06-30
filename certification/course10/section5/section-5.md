# Recognize common exceptions classes and categories

- **ArrayIndexOutOfBoundsException:** Acesso à uma casa inexistente num array
- **IndexOutOfBoundsException:** Acesso à uma casa inexistente de uma lista.
- **NullPointerException:** Invocação ou acesso de variável membro de uma referência nula pra um objeto.
    - Variável local não inicializada nem compila.
- **ClassCastException:** cast de uma classe para outra nada a ver.
- **NumberFormatException:** Tentando converter uma string inválida em um número.
- **IllegalArgumentException:** Damos nós mesmos. Quando o valor não bate com o valor que esperávamos.
- **IllegalStateException:** Um estado que não está preparado, não posso rodar ainda o método.
- **ExceptionInInitializerError:** Erro num bloco de inicialização static.
- **StackOverflowError:** Looping de chamadas
- **NoClassDefFoundError:** Não encontro uma das classes que eu dependo em tempo de execução. Ex.: Deletei uma dos arquivos .class que utilizo no meu programa.
- **OutOfMemoryError:** Estorou a memória.
