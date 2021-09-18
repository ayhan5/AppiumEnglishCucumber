@textBox
  Feature: Api Demos Testing
    Scenario: Send a text to text box
      Given install the app on device
      When user clicks on API Demos
      When user clicks on Preference
      When user clicks on Preference Dependencies
      And user check the check box
      When user clicks on WiFi settings
      And user provide a test to text box "test"
      Then user clicks Ok button