@dragDrop
  Feature: API demos
    Scenario: Drag and drop
      Given install the app on device
      When user clicks on API Demos
      When user clicks on Views
      When user clicks on Drag and Drop
      And user drag first button and drop on third button
      Then verify the text is displayed