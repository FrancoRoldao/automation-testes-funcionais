Feature: Criar movimentação 

Background:
Given que estou logado na aplicação 
And visualizo a pagina inicial
And seleciono criar movimentação

Scenario Outline:
And preencho o tipo de movimentacao "<tipoMovimentacao>"
And preencho a data da movimentacao "<dataMovimentacao>"
And preencho a data do pagamento "<dataPagamento>"
And preencho o interessado "<interessado>"
And preencho o valor "<valor>"
And seleciono a conta "<conta>"
And seleciono a situação "<situacao>"
When clico em salvar
Then será exibida a mensagem "<mensagem>"




