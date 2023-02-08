Feature: Login 

Como um usuario 
Quero logar na aplicação
Para utilizar os serviços disponiveis 


Scenario: Não deve logar com o campo e-mail vazio 

Given que acesso a pagina de login 
And preencho o campo senha com "testes1234"
When eu clicar em entrar
Then será exibida a mensagem "Email é um campo obrigatório"


Scenario: Não deve logar com o campo senha vazio 

Given que acesso a pagina de login 
And preencho o campo email com "testesfranco@testes.com" 
When eu clicar em entrar
Then será exibida a mensagem "Senha é um campo obrigatório"

Scenario: Deve logar com sucesso ao inserir credenciais válidas

Given que acesso a pagina de login
And preencho o campo email com "testesfranco@testes.com"
And preencho o campo senha com "testes1234"
When eu clicar em entrar
Then será exibida a mensagem de sucesso "Bem vindo, TestesFuncionais!"

Scenario: Não deve logar com credenciais inválidas

Given que acesso a pagina de login
And preencho o campo email com "eunaoexisto@nnn.com"
And preencho o campo senha com "11111"
When eu clicar em entrar
Then será exibida a mensagem "Problemas com o login do usuário" 




