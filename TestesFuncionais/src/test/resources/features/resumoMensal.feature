Feature: Resumo Mensal (extrato)

Como um cliente 
Quero consultar o extrato 
Para visualizar movimentações inseridas na conta


Scenario: Validar movimentação existente
Given que estou logado na aplicação 
And visualizo a pagina inicial
When seleciono Resumo Mensal
Then visualizo os dados da movimentação com o valor "Movimentacao para extrato"





