@switch
  Feature: API Demos
    Scenario: Switch element
      Given install the app on device
      When user clicks on API Demos
      When user clicks on Preference
      When user clicks on Switch
      When first switch button should be switched on
      Then verify first switch button is switched on

