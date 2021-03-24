Feature: Register new user
  We need some kind of description here as well.

  Scenario: Register new user
    Given the user is on the register page
    And the user inputs a valid email
    And the user inputs a valid username
    And the user inputs a valid password
    When the user signs up
    Then the user sees the "Check your email" site

  Scenario: Register user with long username (100+ characters)
    Given the user is on the register page
    And the user inputs a valid email
    And the user inputs a long username
    And the user inputs a valid password
    When the user signs up
    Then the user sees the "Check your email" site

  Scenario: Register user with already taken username
    Given the user is on the register page
    And the user inputs a valid email
    And the user inputs an already taken username
    And the user inputs a valid password
    When the user signs up
    Then the user sees an error

  Scenario: Register user without email