@switchPractise
  Feature: API demos
    Scenario: Switch button verification
      Given install the app on device
      When user clicks on API Demos
      When user clicks on Preference
      When user clicks on Switch
      And first switch button should be switched on
      Then verify first switch button is switched on
      And second switch button should switched off
      Then verify second switch button is switched off
