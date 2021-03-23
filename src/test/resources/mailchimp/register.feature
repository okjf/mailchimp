Feature: Register new user

  Scenario: Register new user
    Given the user is on the register page
    And the user inputs a valid email
    And the user inputs a valid username
    And the user inputs a valid password
    When the user clicks "Sign up"
    Then the user should see the "Check your email" site

  Scenario: Register user with long username (100 characters+)

  Scenario: Register user with already taken username

  Scenario: Register user without email