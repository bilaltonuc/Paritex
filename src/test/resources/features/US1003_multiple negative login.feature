Feature: US1003 multiple negative login
  @WebU
  Scenario Outline: TC03_User enters more than one different eposta and parola


    Given User goes to "paritexPage"
    And   Clicks on sign in button
    And   User enters from the scnerio outline "<username>"
    And   User enters from the scnerio outline as parola "<parola>"
    And   User can not click on the login in button






    Examples:
      |username|parola|
      |capableqa@gmail.com| asddadsas|
      |test@gmail.com     |tEsT@1234 |
      |Selman@paritex.com |    asdad |
      |asdasdasdas        |    asdda |
