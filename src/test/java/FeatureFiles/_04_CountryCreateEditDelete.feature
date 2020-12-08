Feature: Country Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page


  Scenario: Create a country

    When Create a country name as "son4" and code as "yeni3"
    Then Success message should be displayed

  Scenario: Edit a country

    When User edit the "son4" to "son48"
    Then Success message should be displayed

  Scenario: Delete a country

    When User delete the "son48"
    Then Success message should be displayed
