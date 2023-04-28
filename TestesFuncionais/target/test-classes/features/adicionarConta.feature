Feature: Adicionar conta

Background:
Given que estou logado na aplicação 
And visualizo a pagina inicial
And seleciono contas

@adicionarConta @adicionarConta1
Scenario: Adicionar conta com sucesso
And seleciono adicionar
When informo a conta
And seleciono salvar
Then será exibida a mensagem de sucesso 
|mensagem|
|Conta adicionada com sucesso!|

@adicionarConta @adicionarConta2
Scenario: Não deve permitir adicionar conta já existente
And seleciono adicionar
When informo a conta já existente
And seleciono salvar
Then será exibida a mensagem de erro 
|mensagem|
|Já existe uma conta com esse nome!|


@adicionarConta @adicionarConta3
Scenario: Não deve permitir adicionar conta sem preencher nome
And seleciono adicionar
And seleciono salvar
Then será exibida a mensagem de erro 
|mensagem|
|Informe o nome da conta|

@adicionarConta @adicionarConta4
Scenario: Validar listagem de conta já existente
And seleciono listar
Then valido se conta já cadastrada está sendo exibida
|nomeConta|
|Conta para extrato|













