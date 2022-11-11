Feature: Login User

  Scenario: Login correct user
    Then Click "Log In" button
    Then Input email
    Then Input password
    Then Click "Log In" submit button
    Then Button with text "Start teaching" is visible