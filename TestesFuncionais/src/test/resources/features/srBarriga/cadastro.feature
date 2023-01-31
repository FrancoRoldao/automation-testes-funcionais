Feature: Cadastro

Como um cliente
Quero me cadastrar na aplicação
Para utilizar os serviços disponiveis 

Scenario: Cadastro com sucesso 
 
 Given que acesso a pagina de cadastro
 And preencho o "nome"
 And preencho o "email"
 And preencho a "senha"
 When eu clicar em cadastrar
 Then será exibida a mensagem de sucesso "Usuário inserido com sucesso"

