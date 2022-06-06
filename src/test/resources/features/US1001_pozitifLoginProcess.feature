Feature: US1001 login process


  Scenario: TC01_İnvalid username can login with correct password

    Given User goes to "paritexPage"
    And   Clicks on sign in button
    And   User enters "validEposta"
    And   User enters "validParola"
    Then  Clicks on login in button
    Then  Enters "OtpKey"
    And   Login with clicking
    And   Checks that you have successfully entered



