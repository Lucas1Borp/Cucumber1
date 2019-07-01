#language: pt
Funcionalidade: Fazendo uma compra
  Como um consumidor 
  Eu quero efetuar uma compra em um site
  Para que eu possa automatizar criterios de aceitação

  Cenário: Fazendo uma compra
    Dado Que ao acessar um site
    Quando Clicar em um produto
    Então Devo preencher o cadastro e-mail
    Quando clicar em submeter
    Entao Devo finalizar a compra
