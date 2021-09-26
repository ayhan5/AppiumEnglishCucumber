@spinner
  Feature: Api demos test
    Scenario: Dropdown test (spinner)
      Given install the app on device
      When user clicks on "API Demos" page
      When user clicks on "Views" page
      When user clicks on "Spinner" page
      And user clicks on color dropdown and select green
      Then verify green selected
      And user clicks on planet dropdown and select Jupiter
      Then verify Jupiter selected