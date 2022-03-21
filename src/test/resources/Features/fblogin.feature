@tag
Feature: Login To FB

  @tag1
  Scenario: Login to FB With Invalid Credentials
    Given Open FB URL
    When User enter invalid credentials
    And Click on Login button
    Then Application should display the validation Message
