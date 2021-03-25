Feature: Register new user
  Registering a new user on the register page.

  Scenario Outline: Register new user
    Given the user is on the register page
    And the user inputs <email>
    And the user inputs <username>
    And the user inputs a valid password
    When the user signs up
    Then the user sees the <result>

    Examples:
      | email         | username                  | result                                                                                              |
      | a valid email | a valid username          | "Check your email" site                                                                             |
      | a valid email | a long username           | error message: "Enter a value less than 100 characters long"                                        |
      | a valid email | an already taken username | error message: "Another user with this username already exists. Maybe it's your evil twin. Spooky." |
      | no email      | a valid username          | error message: "Please enter a value"                                                               |