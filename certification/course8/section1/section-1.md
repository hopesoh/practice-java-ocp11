# Create methods with arguments and return values

- Todo método tem um corpo e uma assinatura, a não ser que seja abstrato. Métodos abstratos não possuem corpo.

### Assinatura do método:

`modificadores tipoDeRetorno nomeDoMetodo(Tipo parâmetros) throws Exception {
    //corpo do método
}`

**nomeDoMetodo:** segue a mesma regra de nomeclatura de identificadores. Obrigatório.
**tipoDeRetorno:** obrigatório.
**(Tipo parametros):** opcional. Os parênteses são obrigatórios. Se tem mais de um, são separados por ,
**//corpo do método:** opcional. As chaves são obrigatórias.
**modificadores:** opicional. Vem antes do retorno. Se não coloco nada, é default.
**throws Exception:** opcional. Exceções lançadas.

- Se um método requer parâmetros e eu não passo: Não compila.
- Não posso inicializar um parâmetro dentro dos parâmetros do método.
