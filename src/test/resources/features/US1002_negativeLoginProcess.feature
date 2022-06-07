Feature: US1002 negative login
  @WebU



  Scenario:TC02_Valid username  cannot login with invalid password

    Given User goes to "paritexPage"
    And   Clicks on sign in button
    And   User enters "validEposta"
    And   User enters as parola "invalidParola"
    Then  Clicks on login in button
    And   Verify can not login in

  @WebU
  Scenario: TC3_Invalid username cannot login with valid password

    Given User goes to "paritexPage"
    And   Clicks on sign in button
    Then  User enters "invalidEposta"
    And   User enters as parola "validParola"
    Then  Clicks on login in button
    And   Verify can not login in

  @WebU
Scenario: TC3_Invalid username cannot login with invalid password


  Given User goes to "paritexPage"
  And   Clicks on sign in button
  Then  User enters "invalidEposta"
  And   User enters as parola "invalidParola"
  Then  Clicks on login in button
  And   Verify can not login in








