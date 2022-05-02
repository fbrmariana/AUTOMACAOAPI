#language:pt
  @usuario
  Funcionalidade: Usuário

    Cenário: Cadastrar um usuário válido
      Dado que sejam preenchidos os valores de users com
        | name    | morpheus |
        | job | leader  |
      Quando chamado o POST de users
      Então o sistema devolve o status 201
      E o campo "name" retorna o valor "morpheus"
      E o campo "job" retorna o valor "leader"

    Cenário: Consultar um usuário existente
      Dado que seja utilizado o id "10"
      Quando chamado o Get de users Por Id
      Então o sistema devolve o status 200
      E o campo "data.id" retorna o valor 10
      E o campo "data.email" retorna o valor "byron.fields@reqres.in"
      E o campo "data.first_name" retorna o valor "Byron"
      E o campo "data.last_name" retorna o valor "Fields"

