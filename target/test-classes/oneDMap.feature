
  Feature: Tariff
  I want to use this template for my feature file

  @tag1
  Scenario: to add tariff plan
  Given the user is in add tariff plan
  When the user fill valid details
  |monthlyrental|100|
  |freelocalmin|200|
  |freeinternationalmin|300|
  |freesmspack|400|
  |localperminutescharge|500|
  |Internationalperminutes|600|
  |SMSpercharges|700|
  When the user click submit button
  Then I validate the outcome
  

  @tag1
  Scenario: to add tariff plan
  Given the user is in add tariff plan
  When the user fill valid details
  |monthlyrental|1000|
  |freelocalmin|2000|
  |freeinternationalmin|3000|
  |freesmspack|4000|
  |localperminutescharge|500|
  |Internationalperminutes|600|
  |SMSpercharges|700|
  When the user click submit button
  Then I validate the outcome
  