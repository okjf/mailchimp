Feature: Register user

  Scenario: Register user
    Given I am on register page
    And I input a valid email
    And I input a valid username
    And I input a valid password
    When I click "Sign up"
    Then I am registered

  Scenario: Register user with long username (100 characters+)

  Scenario: Register user with already taken username

  Scenario: Register user without email