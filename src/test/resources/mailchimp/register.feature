Feature: Register new user
  Registering a new user on the register page.

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
    Then the user sees the error message: "Enter a value less than 100 characters long"

  Scenario: Register user with already taken username
    Given the user is on the register page
    And the user inputs a valid email
    And the user inputs an already taken username
    And the user inputs a valid password
    When the user signs up
    Then the user sees the error message: "Another user with this username already exists. Maybe it's your evil twin. Spooky."

  Scenario: Register user without email
    Given the user is on the register page
    And the user inputs a valid username
    And the user inputs a valid password
    When the user signs up
    Then the user sees the error message: "Please enter a value"