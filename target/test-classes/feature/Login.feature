Feature: Login
  Scenario: User login with
    Given User go to login page
    When User enters valid username and password
    And User click login button
    Then Login message displayed