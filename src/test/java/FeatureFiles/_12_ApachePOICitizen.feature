Feature: ApachePOI Citizen Functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Citizenship page
  Scenario: Create and delete citizenship page
    When User Create  Citizenship with ApachePOI
    Then User delete  Citizenship with ApachePOI