Feature: Login
  
  Como um usuario 
  Quero logar na aplicação
  Para utilizar os serviços disponiveis

  @T1 @login
  Scenario: Não deve logar com o campo e-mail vazio
    Given que acesso a pagina de login
    And preencho o campo senha
      | senha      |
      | testes1234 |
    When eu clicar em entrar
    Then será exibida a mensagem de erro
      | mensagem                     |
      | Email é um campo obrigatório |

  @T2 @login
  Scenario: Não deve logar com o campo senha vazio
    Given que acesso a pagina de login
    And preencho o campo email
      | email                   |
      | testesfranco@testes.com |
    When eu clicar em entrar
    Then será exibida a mensagem de erro
      | mensagem                     |
      | Senha é um campo obrigatório |

  @T3 @login
  Scenario: Deve logar com sucesso ao inserir credenciais válidas
    Given que acesso a pagina de login
    And preencho o campo email
      | email                   |
      | testesfranco@testes.com |
    And preencho o campo senha
      | senha      |
      | testes1234 |
    When eu clicar em entrar
    Then será exibida a mensagem de sucesso
      | mensagem                     |
      | Bem vindo, TestesFuncionais! |

  @T4 @login
  Scenario: Não deve logar com credenciais inválidas
    Given que acesso a pagina de login
    And preencho o campo email
      | email               |
      | eunaoexisto@nnn.com |
    And preencho o campo senha
      | senha |
      | 11111 |
    When eu clicar em entrar
    Then será exibida a mensagem de erro
      | mensagem                         |
      | Problemas com o login do usuário |
