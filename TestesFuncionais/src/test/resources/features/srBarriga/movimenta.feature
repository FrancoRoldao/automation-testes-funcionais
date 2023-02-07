Feature: criar movimentacao

Background:
Given que estou logado na aplicação 
And visualizo a pagina inicial
And seleciono criar movimentação

Scenario Outline: Validação de campos obrigatórios em Criar Movimentação 
And preencho o tipo de movimentacao "<tipoMovimentacao>"
And preencho a data da movimentacao "<dataMovimentacao>"
And preencho a data do pagamento  "<dataPagamento>"
And preencho a descrição "<descricao>"
And preencho o interessado "<interessado>"
And preencho o valor "<valor>"
And seleciono a conta "<conta>"
And seleciono a situação Pago
When clico em salvar
Then será exibida a mensagem de alerta "<mensagem>"



Examples:

|tipoMovimentacao|dataMovimentacao|dataPagamento|descricao      |interessado|valor|conta                   |mensagem                              |
|Despesa         | 03/02/2023     |05/02/2023   |Tudo preenchido|full       | 500 |Conta para movimentacoes| Movimentação adicionada com sucesso! |  
|Receita         | 07/02/2023     |             |Falta DataPgto |notfull    | 500 |Conta para movimentacoes| Data do pagamento é obrigatório      |
|Receita         |                |07/02/2023   |Falta DataMov  |notfull    | 500 |Conta para movimentacoes| Data da Movimentação é obrigatório   | 
|Receita         | 07/02/2023     | 07/02/2023  |               |notfull    | 500 |Conta para movimentacoes| Descrição é obrigatório              |
|Receita         | 07/02/2023     | 07/02/2023  |FaltaInteressa |           | 500 |Conta para movimentacoes| Interessado é obrigatório              |

