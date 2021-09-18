@expandable
  Feature: APi Demos
    Scenario: Expandable list
      Given install the app on device
      When user clicks on API Demos
      When user clicks on Views
      When user clicks on Expandable List
      When user clicks on Custom adapter
      When user clicks on People names
      When user long clicks on Arnold
      Then verify menu is displayed