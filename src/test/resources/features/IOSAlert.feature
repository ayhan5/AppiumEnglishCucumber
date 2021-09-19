@alert
  Feature: UiCAtalog test
    Scenario: alert test
      Given install the ios app on device
      When user clicks on Alert Views button
      When user clicks on Okey Cancel button
      When user verify popup is displayed
      Then user clicks Cancel button on IOS'
      Then quit app