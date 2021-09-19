@switches
  Feature: UI Catalog test
    Scenario: switch element test
      Given install the ios app on device
      When user clicks on Switches in simulator
      And user switched on first switch button
      Then verify it is switched on
      And user switched off second switch button
      Then verify it is switched off
      Then take the screenshot
