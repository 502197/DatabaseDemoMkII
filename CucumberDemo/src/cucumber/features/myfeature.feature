Feature: Open a web page and click a button, get expected output

  Scenario: my first test
    Given this is my first step
    When this is my second step
    Then this is my final step

@web
  Scenario: my first web test
    Given I am on google web page
    When Click on "3" buttons
    And Use this data table
      | field  | value    |
      | name   | malin    |
      | adress | julianas |
      | id     | A502197  |
    Then this is my final step
