@toast
  Feature: APi demos
    Scenario: Toast message
      Given install the app on device
      When user clicks on API Demos
      When user clicks on Views
      When user clicks on Popup Menu
      When user clicks on make popup button
      When user clicks on add button
      Then verify toast message
      Then take the screenshot