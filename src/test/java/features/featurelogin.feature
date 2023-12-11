
@tag
Feature: Demo login 

  @tag1
  Scenario: Verify Login
    Given user is on login page
    When user enters valid username and password
    Then login is suceessful 
    And user is redirected to homepage
