@Login_credentials
Feature: data_tables
  Scenario Outline: TC_Login with manager credentials

    Given user is on the "https://www.bluerentalcars.com/" page
    When user clicks on the icon button
    And user enters username
    And user enters password
    And user click on login button
    Then verify the login is successful

    Examples: test_data



