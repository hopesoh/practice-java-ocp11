# Definindo o escopo de variáveis

### **Tipos de Variáveis:**
- Variáveis locais
    - declaradas dentro de um método ou construtor;
    - existe dentro do bloco que foi criada (dentro das ultimas chaves que criaram aquela variável);
    - parâmetro é uma variável local;

- Variáveis de instância/Variáveis de objeto/atributo/membro
   - declarada dentro da classe;
   - pode ser acessada em qualquer lugar dentro do objeto, desde que eu tenha um objeto instanciado;
   - pode ser acessada de qualquer método ou construtor do meu objeto, salvo métodos estáticos (static);
   
- Variáveis de classe/Variáveis estáticas
   - existe uma única para aquela classe (Ex.: Se eu criar 5 Pessoas diferentes, tenho uma única variável estática);
   - acesso através da classe ou da instância;
   - acesso a partir de qualquer escopo (método local, construtor...), desde que sejam respeitados os modificadores de acesso;
   - não preciso de necessariamente uma referência àquele objeto;

### **- Variáveis com mesmo nome**
   - variável local x variável de instância -> **CERTO**
   - variável local x variável estática -> **CERTO**
   - variável local x variável local -> **ERRADO**
   
- _SHADOWING_: Capacidade de esconder o acesso a uma das variáveis, pois colocou as duas com mesmo nome. Acessa sempre a variável local.
   - para forçar acessar a de instância ou a de classe, uso this. (para variável de instância) e NomeDaClasse. (para variável de classe);