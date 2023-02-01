Feature: Cadastro

Como um cliente
Quero me cadastrar na aplicação
Para utilizar os serviços disponiveis 

Scenario: Cadastro com sucesso 
 
 Given que acesso a pagina de cadastro
 And preencho um nome
 And preencho um email
 And preencho uma senha
 When eu clicar em cadastrar
 Then será exibida a mensagem de usuário inserido com sucesso 

