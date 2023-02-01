Feature: Cadastro

Como um cliente
Quero me cadastrar na aplicação
Para utilizar os serviços disponiveis 

Scenario: Cadastro com sucesso 
 
 Given que acesso a pagina de cadastro
 And preencho um nome "nome" 
 And preencho um email  "email"
 And preencho uma senha "senha"
 When eu clicar em cadastrar
 Then será exibida a mensagem de "Usuário inserido com sucesso"

