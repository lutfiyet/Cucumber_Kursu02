Feature: Country Multi Scenario

  #Senaryolarda aynı olan ilk kısımlar Background olarak yazılabilir
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page


  Scenario: Create a country

    When Create a country
    Then Success message should be displayed


  Scenario: Create a country parameter data

    When Create a country name as "temurUlke21" and code as "code21"
    Then Success message should be displayed
