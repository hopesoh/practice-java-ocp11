# Use abstract classes and interfaces

**Classe abstrata:** pode ser criada sem nenhum método, inclusive abstratos.
- Não precisa ter métodos abstratos mas, se tiver pelo menos um, ela precisa ser abstrata também.
- Uma classe abstrata não pode ser instanciada sem ser herdada.

**Método abstrato:** não existe corpo no método. Podem pertender apenas à interfaces ou classes abstratas.
- Enquanto eu não implementar os métodos abstratos das minhas classes pai, não posso definir uma classe como concreta.


**Interface x Classe abstrata**
- Uma classe abstrata pode ter métodos normais e ter métodos abstratos
- Uma interface não tem métodos de instância com corpo implementado (apenas se for default)
- Por padrão, métodos de interface são abstract e públicos
- Por padrão, métodos de classes abstratas são default e concretos.
- Uma classe implementa várias interfaces.
- Uma classe extende apenas uma classe.
- Uma interface extende várias interfaces.
- Uma interface NUNCA implementa outra interface
- Em uma interface, uma variável é, por padrão, public static final.
- Uma interface não pode ter métodos estáticos.


