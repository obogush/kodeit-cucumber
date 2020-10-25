Feature: Validate title


  Scenario: Validate title of the page
    Given I am on the homepage
    Then I test the website title
    Then I validate title is correct
    Then I close the browser windows