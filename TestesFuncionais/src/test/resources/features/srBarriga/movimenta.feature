Feature: criar movimentacao

Background:
Given que estou logado na aplicação 
And visualizo a pagina inicial


Scenario Outline: Validação de campos obrigatórios em Criar Movimentação 
And seleciono criar movimentação
* preencho o tipo de movimentacao "<tipoMovimentacao>"
* preencho a data da movimentacao "<dataMovimentacao>"
* preencho a data do pagamento  "<dataPagamento>"
* preencho a descrição "<descricao>"
* preencho o interessado "<interessado>"
* preencho o valor "<valor>"
* seleciono a conta "<conta>"
* seleciono a situação Pago
When clico em salvar
Then será exibida a mensagem de alerta "<mensagem>" 



Examples:

|tipoMovimentacao|dataMovimentacao|dataPagamento|descricao      |interessado|valor|conta                   |mensagem                                       | 
|Despesa         | 03/02/2023     |05/02/2023   |Tudo preenchido|full       | 500 |Conta para movimentacoes| Movimentação adicionada com sucesso!          |              
|Receita         | 07/02/2023     |             |Falta DataPgto |notfull    | 500 |Conta para movimentacoes| Data do pagamento é obrigatório               |              
|Receita         |                |07/02/2023   |Falta DataMov  |notfull    | 500 |Conta para movimentacoes| Data da Movimentação é obrigatório            |              
|Receita         | 07/02/2023     | 07/02/2023  |               |notfull    | 500 |Conta para movimentacoes| Descrição é obrigatório                       |              
|Receita         | 07/02/2023     | 07/02/2023  |FaltaInteressa |           | 500 |Conta para movimentacoes| Interessado é obrigatório                     |
|Receita         | 07/02/2023     | 07/02/2023  |FaltaValor     |   notfull |     |Conta para movimentacoes| Valor é obrigatório\nValor deve ser um número |               
                         
Scenario: Verifica movimentação existente no extrato
When seleciono Resumo Mensal
Then visualizo os dados da movimentação com o valor "Movimentacao para extrato"





