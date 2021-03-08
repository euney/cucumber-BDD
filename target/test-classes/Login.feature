@Login
Feature: Login Functionality
Background: Navigate
  Scenario Outline: Validation of Login Positive Scenario
    Given the user navigates to the "file:///Users/erkanuney/Desktop/Paylocity%20QA%20Interview%20Challenge/login.html"
    When the user provides the username "<username>"
    And the user provides the password "<password>"
    Then the user should  click login button
    Then the user should see "Benefits Dashboard"
    Examples:
    | username | password |
    | testUser | test1234 |