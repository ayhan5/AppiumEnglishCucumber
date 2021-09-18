@swipe
  Feature: API demos
    Scenario: swipe oper
      Given install the app on device
      When user clicks on API Demos
      When user clicks on Views
      When user clicks on Date Widgets
      When user clicks on Inline
      When user clicks on 9
      When swipe 15 to 45
      Then take the screenshot