  Feature: Tariff
  I want to use this template for my feature file

  @tag1
  Scenario: to add tariff plan
  Given the user is in add tariff plan
  When the user fill valid details
  |111|100|222|333|444|555|666|
  |222|211|233|244|255|266|277|
  |333|310|312|323|333|344|355|
  |433|410|412|423|433|444|455|
  |533|510|512|523|533|544|555|
  
  When the user click submit button
  Then I validate the outcome