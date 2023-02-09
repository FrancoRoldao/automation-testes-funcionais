Feature: Adicionar conta

Background:
Given que estou logado na aplicação 
And visualizo a pagina inicial
And seleciono contas


Scenario: Adicionar conta com sucesso
And seleciono adicionar
When informo a "conta"
And seleciono salvar
Then será exibida a mensagem de sucesso "Conta adicionada com sucesso!"

Scenario: Não deve permitir adicionar conta já existente
And seleciono adicionar
When informo a "Conta mesmo nome"
And seleciono salvar
Then será exibida a mensagem "Já existe uma conta com esse nome!"

Scenario: Não deve permitir adicionar conta sem preencher nome
And seleciono adicionar
And seleciono salvar
Then será exibida a mensagem "Informe o nome da conta"

Scenario: Validar listagem de conta já existente
And seleciono listar
Then valido se conta já cadastrada está sendo "exibida"













