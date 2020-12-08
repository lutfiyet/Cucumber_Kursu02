Feature: Testing JDBC City

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to City page

  Scenario: City testing with JDBC

    Then Send The query the database "select * from country order by id desc" and control match