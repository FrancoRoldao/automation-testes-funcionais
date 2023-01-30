Feature: Login 

Como um usuario 
Quero logar na aplicação
Para utilizar os serviços disponiveis 


Scenario: Não deve logar com o campo e-mail vazio 

Given que acesso a pagina de login 
And preencho o campo senha com "fran7267"
When eu clicar em entrar
Then será exibida a mensagem de erro "Email é um campo obrigatório"


Scenario: Não deve logar com o campo senha vazio 

Given que acesso a pagina de login 
And preencho o campo email com "francotrabalhoestudo@gmail.com" 
When eu clicar em entrar
Then será exibida a mensagem de erro "Senha é um campo obrigatório"


