Feature: Nationalities functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Nationalities page


  Scenario: Create Nationalities
    Then Create a Nationality name as "abcd27"
    Then Success message should be displayed

  Scenario: Edit Nationalities
    Then User edit the "abcd27" to "abcd37"
    Then Success message should be displayed

  Scenario: Delete Nationalities
    Then User delete the "abcd37"
    Then Success message should be displayed

#  //@SmokeTest
#  Scenario: Nationalities All functionality
#    Then Create a Nationality name as "iscb91"
#    Then Success message should be displayed
#    Then User edit the "iscb91" to "iscb92"
#    Then Success message should be displayed
#    Then User delete the "iscb92"
#    Then Success message should be displayed