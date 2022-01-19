Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is on home page
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed