Feature: Login
  Scenario Outline: Verify user login
    Given User go to login page
    When User enters <username> and <password>
    And User click login button
    Then Login message displayed

    Examples:
    | username | password |
    | tomsmith | SuperSecretPassword! |
    | test     | password123          |
