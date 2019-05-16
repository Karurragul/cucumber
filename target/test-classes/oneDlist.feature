
  Feature: Tariff
  I want to use this template for my feature file

  Scenario Outline: to add tariff plan
  Given the user is in add tariff plan
  When the user fill valid details"<monthlyrental>","<freelocalmin>","<freeinternationalmin>","<freesmspack>","<localperminutescharge>","<Internationalperminutes>","<SMSpercharges>"
  When the user click submit button
  Then I validate the outcome
  
  Examples:
  |monthlyrental|freelocalmin|freeinternationalmin|freesmspack|localperminutescharge|Internationalperminutes|SMSpercharges|
  |100|200|300|400|500|600|700|
  |1000|2000|3000|4000|500|800|000|
  |11000|22000|33000|44000|550|660|770|
  
  